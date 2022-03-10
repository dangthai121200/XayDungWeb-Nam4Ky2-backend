package app.netlify.laptopso1vn.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.netlify.laptopso1vn.ENTITY.LaptopEntity;
import app.netlify.laptopso1vn.ENTITY.LoaiMayEntity;

public class LaptopCategoryDao {

	private SessionFactory sessionFactory ;
	
	public LaptopCategoryDao() {
		sessionFactory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(LoaiMayEntity.class)
				.addAnnotatedClass(LaptopEntity.class)
				.buildSessionFactory();
	}
	
	public List<LoaiMayEntity> getAllCategoryLaptop() {
		Session session = sessionFactory.getCurrentSession();
		if(session.getTransaction().isActive() == false) {
			session.beginTransaction();	
		}
		List<LoaiMayEntity> loaiMayEntities = session.createQuery("FROM LoaiMayEntity").getResultList();
		return loaiMayEntities;
	}
	
	public static void main(String[] args) {
		LaptopCategoryDao laptopCategoryDao = new LaptopCategoryDao();
		System.out.println(laptopCategoryDao.getAllCategoryLaptop());
	}
}
