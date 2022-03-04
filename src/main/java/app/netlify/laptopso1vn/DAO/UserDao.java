package app.netlify.laptopso1vn.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.netlify.laptopso1vn.ENTITY.UserEntity;
import app.netlify.laptopso1vn.FORM.FormLogin;

public class UserDao {
	
	private SessionFactory sessionFactory ;
	
	public UserDao() {
		sessionFactory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(UserEntity.class)
				.buildSessionFactory();
	}


	public UserEntity getUserLogin(FormLogin formLogin) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		String SQL = "FROM UserEntity WHERE username = '" + formLogin.getUsername() + "'" + " AND password = '" + formLogin.getPassword() +"'";
		UserEntity userEntity = session.createQuery(SQL, UserEntity.class).getSingleResult();
		return userEntity;
	}


	public List<UserEntity> getUsers() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		String SQL = "FROM UserEntity";
		List<UserEntity> userEntityList = session.createQuery(SQL).getResultList();
		return userEntityList;
	}
	
}

