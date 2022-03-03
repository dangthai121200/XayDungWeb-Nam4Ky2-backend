package app.netlify.laptopso1vn.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.netlify.laptopso1vn.ENTITY.UserEntity;

public class UserDao {
	
	private SessionFactory sessionFactory ;
	
	public UserDao() {
		sessionFactory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(UserEntity.class)
				.buildSessionFactory();
	}


	public UserEntity getUserLogin(String username, String password) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		String SQL = "FROM UserEntity WHERE username = '" + username + "'" + " AND password = '" + password +"'";
		UserEntity userEntity = session.createQuery(SQL, UserEntity.class).getSingleResult();
		return userEntity;
	}
	
}

