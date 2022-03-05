package app.netlify.laptopso1vn.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.netlify.laptopso1vn.ENTITY.KhachHangEntity;
import app.netlify.laptopso1vn.FORM.FormLogin;
import app.netlify.laptopso1vn.FORM.FormRegister;
import jakarta.validation.Valid;
import javassist.expr.NewArray;

public class UserDao {
	
	private SessionFactory sessionFactory ;
	
	public UserDao() {
		sessionFactory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(KhachHangEntity.class)
				.buildSessionFactory();
	}


	public KhachHangEntity getUserLogin(FormLogin formLogin) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		String SQL = "FROM UserEntity WHERE username = '" + formLogin.getUsername() + "'" + " AND password = '" + formLogin.getPassword() +"'";
		KhachHangEntity userEntity = session.createQuery(SQL, KhachHangEntity.class).getSingleResult();
		return userEntity;
	}


	public List<KhachHangEntity> getUsers() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		String SQL = "FROM UserEntity";
		List<KhachHangEntity> userEntityList = session.createQuery(SQL).getResultList();
		return userEntityList;
	}


	public void postUserRegister(@Valid FormRegister formRegister) {
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(new KhachHangEntity(formRegister.getEmail(), 
				formRegister.getUsername(), 
				formRegister.getPassword()));
		session.getTransaction().commit();
	}
	
	
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		userDao.postUserRegister(new FormRegister("asdas","asd","asdasd","asdasd"));
	}
}

