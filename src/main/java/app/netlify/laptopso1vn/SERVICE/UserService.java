package app.netlify.laptopso1vn.SERVICE;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import app.netlify.laptopso1vn.DAO.UserDao;
import app.netlify.laptopso1vn.ENTITY.UserEntity;
import app.netlify.laptopso1vn.FORM.FormLogin;
import app.netlify.laptopso1vn.FORM.FormRegister;
import app.netlify.laptopso1vn.MODEL.UserModel;
import jakarta.validation.Valid;

public class UserService {
	
	private UserDao userDao;

	public UserService() {
		userDao = new UserDao();
	}
	
	public List<UserModel> getUsers() {
		List<UserEntity> userEntitieList = userDao.getUsers();
		List<UserModel> userModelList = new ArrayList<UserModel>();
		for (UserEntity userEntity : userEntitieList) {
			UserModel userModel = new UserModel(userEntity);
			userModelList.add(userModel);
		}
		return userModelList;
	}
	
	public UserModel getUserLogin(FormLogin formLogin) {
		UserEntity userEntity = userDao.getUserLogin(formLogin);
		UserModel userModel = new UserModel(userEntity);
		return userModel;
	}


	public void postUserRegister(@Valid FormRegister formRegister) {
		
		userDao.postUserRegister(formRegister);
		
	}
	
}
