package app.netlify.laptopso1vn.SERVICE;

import org.hibernate.Session;

import app.netlify.laptopso1vn.DAO.UserDao;
import app.netlify.laptopso1vn.ENTITY.UserEntity;
import app.netlify.laptopso1vn.MODEL.UserModel;

public class UserService {
	
	private UserDao userDao;

	public UserService() {
		userDao = new UserDao();
	}
	
	public UserModel getUserLogin(String username, String password) {
		UserEntity userEntity = userDao.getUserLogin(username, password);
		UserModel userModel = new UserModel(userEntity);
		return userModel;
	}
	
}
