package app.netlify.laptopso1vn.SERVICE;

import java.util.ArrayList;
import java.util.List;


import app.netlify.laptopso1vn.DAO.UserDao;
import app.netlify.laptopso1vn.ENTITY.KhachHangEntity;
import app.netlify.laptopso1vn.EXCEPTION.ExistEmailException;
import app.netlify.laptopso1vn.EXCEPTION.ExistUsernameException;
import app.netlify.laptopso1vn.EXCEPTION.PasswordException;
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
		List<KhachHangEntity> userEntitieList = userDao.getUsers();
		List<UserModel> userModelList = new ArrayList<UserModel>();
		for (KhachHangEntity userEntity : userEntitieList) {
			UserModel userModel = new UserModel(userEntity);
			userModelList.add(userModel);
		}
		return userModelList;
	}
	
	public UserModel getUserFromLogin(FormLogin formLogin) {
		KhachHangEntity userEntity = userDao.getUserFromLogin(formLogin);
		UserModel userModel = new UserModel(userEntity);
		return userModel;
	}


	public UserModel postUserRegister(@Valid FormRegister formRegister) throws ExistEmailException, ExistUsernameException, PasswordException {
	
		boolean flagEmail = checkExistByEmail(formRegister.getEmail());
		if(flagEmail) {
			throw new ExistEmailException();
		}else {
			boolean flagUsername = checkExistByUsername(formRegister.getUsername());
			if(flagUsername) {
				throw new ExistUsernameException();
			}else {
				if(formRegister.getPassword().equals(formRegister.getConfiPassword())) {
					KhachHangEntity khachHangEntity =  userDao.postUserRegister(formRegister);
					UserModel userModel = new UserModel(khachHangEntity);
					return userModel;
				}else {
					throw new PasswordException();
				}
				
			}	
		}
	}
	
	public boolean checkExistByEmail(String email) {
		boolean flagEmail = userDao.checkExistByEmail(email);
		return flagEmail;
	}
	
	public boolean checkExistByUsername(String username) {
		boolean flagUsername = userDao.checkExistByUsername(username);
		return flagUsername;
	}
	
}
