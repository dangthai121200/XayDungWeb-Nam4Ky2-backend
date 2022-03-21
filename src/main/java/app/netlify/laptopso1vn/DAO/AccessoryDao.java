package app.netlify.laptopso1vn.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.netlify.laptopso1vn.ENTITY.AdminEntity;
import app.netlify.laptopso1vn.ENTITY.LoaiMayEntity;
import app.netlify.laptopso1vn.ENTITY.LoaiPhuKienEntity;
import app.netlify.laptopso1vn.ENTITY.PhuKienEntity;

public class AccessoryDao {
	
private SessionFactory sessionFactory ;
	
	public AccessoryDao() {
		sessionFactory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(PhuKienEntity.class)
				.addAnnotatedClass(LoaiPhuKienEntity.class)
				.buildSessionFactory();
	}
	
	public List<PhuKienEntity> getAllAccessory() {
		Session session = sessionFactory.getCurrentSession();
		if(session.getTransaction().isActive() == false) {
			session.beginTransaction();	
		}
		List<PhuKienEntity> phuKienEntities = session.createQuery("FROM PhuKienEntity").getResultList();
		return phuKienEntities;
	}
	
	public static void main(String[] args) {
		AccessoryDao accessoryDao = new AccessoryDao();
		System.out.println(accessoryDao.getAllAccessory());
	}
}
