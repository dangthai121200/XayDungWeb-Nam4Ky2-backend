package app.netlify.laptopso1vn.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.netlify.laptopso1vn.ENTITY.LaptopEntity;

public class LaptopDao {
	
private SessionFactory sessionFactory ;
	
	public LaptopDao() {
		sessionFactory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(LaptopEntity.class)
				.buildSessionFactory();
	}
	
	public List<LaptopEntity> getAllLaptop() {
		
		Session session = sessionFactory.getCurrentSession();
		if(session.getTransaction().isActive() == false) {
			session.beginTransaction();	
		}
		List<LaptopEntity> laptopEntities = session.createQuery("FROM LaptopEntity").getResultList();
		return laptopEntities;
	}
}
