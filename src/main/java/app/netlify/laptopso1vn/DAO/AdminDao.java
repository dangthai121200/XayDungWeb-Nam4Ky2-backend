package app.netlify.laptopso1vn.DAO;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.netlify.laptopso1vn.ENTITY.AdminEntity;
import app.netlify.laptopso1vn.FORM.FormLogin;

public class AdminDao {
private SessionFactory sessionFactory ;
	
	public AdminDao() {
		sessionFactory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(AdminEntity.class)
				.buildSessionFactory();
	}
	
	public AdminEntity getAdminFromLogin(FormLogin formLogin) {
		try {
			Session session = sessionFactory.getCurrentSession();
			if(session.getTransaction().isActive() == false) {
				session.beginTransaction();
			}
			String SQL = "FROM AdminEntity WHERE username = '" + formLogin.getUsername() + "'" + " AND password = '" 
			+ formLogin.getPassword() +"'";
			AdminEntity adminEntity  = session.createQuery(SQL, AdminEntity.class)
					.getSingleResult();
			return adminEntity;
		} catch (NoResultException e) {
			return null;
		}
	}
//	public static void main(String[] args) {
//		AdminDao adminDao = new AdminDao();
//		System.out.println(adminDao.getUserFromLogin(new FormLogin("gaonet567","Thai0913442325.")));
//	}
}
