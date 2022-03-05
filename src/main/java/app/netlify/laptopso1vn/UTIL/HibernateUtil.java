package app.netlify.laptopso1vn.UTIL;


import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static Configuration configuration;
	
	static {
		configuration =  new Configuration()
				.configure("hibernate.cfg.xml");
	}
	
}
