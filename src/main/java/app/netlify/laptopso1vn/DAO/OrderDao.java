package app.netlify.laptopso1vn.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.netlify.laptopso1vn.ENTITY.DonHangEntity;
import app.netlify.laptopso1vn.ENTITY.KhachHangEntity;
import app.netlify.laptopso1vn.UTIL.HibernateUtil;

public class OrderDao {
	
private SessionFactory sessionFactory ;
	
	public OrderDao() {
		sessionFactory =  HibernateUtil.configuration
				.addAnnotatedClass(DonHangEntity.class)
				.buildSessionFactory();
	}
	
	public List<DonHangEntity> getOrders() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		String SQL = "FROM DonHangEntity";
		List<DonHangEntity> donHangEntities = session.createQuery(SQL).getResultList();
		return donHangEntities;
	}
	

}
