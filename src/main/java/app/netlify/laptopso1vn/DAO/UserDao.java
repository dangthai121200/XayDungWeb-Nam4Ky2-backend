package app.netlify.laptopso1vn.DAO;

import java.util.List;

import javax.persistence.NoResultException;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.netlify.laptopso1vn.ENTITY.KhachHangEntity;
import app.netlify.laptopso1vn.FORM.FormLogin;
import app.netlify.laptopso1vn.FORM.FormRegister;
import javax.validation.Valid;



public class UserDao {
	
	private SessionFactory sessionFactory ;
	
	public UserDao() {
		sessionFactory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(KhachHangEntity.class)
				.buildSessionFactory();
	}


	public KhachHangEntity getUserFromLogin(FormLogin formLogin) {
		KhachHangEntity khachHangEntity = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			if(session.getTransaction().isActive() == false) {
				session.beginTransaction();
			}
			String SQL = "FROM UserEntity WHERE username = '" + formLogin.getUsername() + "'" + " AND password = '" 
			+ DigestUtils.md5Hex(formLogin.getPassword()) +"'";
			khachHangEntity  = session.createQuery(SQL, KhachHangEntity.class)
					.getSingleResult();
			return khachHangEntity;
		} catch (NoResultException e) {
			return null;
		}
	}


	public List<KhachHangEntity> getUsers() {
		Session session = sessionFactory.getCurrentSession();
		if(session.getTransaction().isActive() == false) {
			session.beginTransaction();
		}
		String SQL = "FROM UserEntity";
		List<KhachHangEntity> userEntityList = session.createQuery(SQL).getResultList();
		return userEntityList;
	}


	public KhachHangEntity postUserRegister(@Valid FormRegister formRegister) {
		
			Session session = sessionFactory.getCurrentSession();
			if(session.getTransaction().isActive() == false) {
				session.beginTransaction();
			}
			KhachHangEntity khachHangEntity = new KhachHangEntity(formRegister.getEmail(), 
					formRegister.getUsername(), 
					DigestUtils.md5Hex(formRegister.getPassword()));
			session.save(khachHangEntity);
			session.getTransaction().commit();
			return khachHangEntity;
	}
	
	public boolean checkExistByEmail(String email) {
		KhachHangEntity userEntity = null;
		try {
			
			Session session = sessionFactory.getCurrentSession();
			if(session.getTransaction().isActive() == false) {
				session.beginTransaction();
			}
			
			String SQL = "FROM UserEntity WHERE email = '" +  email + "'";
			userEntity = session.createQuery(SQL, KhachHangEntity.class)
					.getSingleResult();
		} catch (NoResultException e) {			
		}
		
		if(userEntity!=null) {
			return true;
		}
		return false;
	}
	
	public boolean checkExistByUsername(String username) {
		KhachHangEntity userEntity = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			if(session.getTransaction().isActive() == false) {
				session.beginTransaction();
			}
			String SQL = "FROM UserEntity WHERE username = '" +  username + "'";
			userEntity = session.createQuery(SQL, KhachHangEntity.class)
					.getSingleResult();
		} catch (Exception e) {
		}
		
		if(userEntity!=null) {
			return true;
		}
		return false;
	}
	
}

