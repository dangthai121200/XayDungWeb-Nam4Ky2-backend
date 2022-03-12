package app.netlify.laptopso1vn.SERVICE;

import app.netlify.laptopso1vn.DAO.AdminDao;
import app.netlify.laptopso1vn.ENTITY.AdminEntity;
import app.netlify.laptopso1vn.EXCEPTION.LoginException;
import app.netlify.laptopso1vn.FORM.FormLogin;
import app.netlify.laptopso1vn.MODEL.AdminModel;

public class AdminService {
	private AdminDao adminDao;

	public AdminService() {
		adminDao = new AdminDao();
	}
	
	public AdminModel getUserFromLogin(FormLogin formLogin) throws LoginException {
		if(formLogin != null) {
			AdminEntity adminEntity = adminDao.getAdminFromLogin(formLogin);
			if(adminEntity != null) {
				AdminModel adminModel = new AdminModel(adminEntity);
				return adminModel;
			}else {
				throw new LoginException();
			}
		}else {
			throw new LoginException();
		}
		
	}
	
	public AdminModel getUserFromLogin(String username, String password) {
		FormLogin formLogin = new FormLogin(username, password);
		if(formLogin != null) {
			AdminEntity adminEntity = adminDao.getAdminFromLogin(formLogin);
			if(adminEntity != null) {
				AdminModel adminModel = new AdminModel(adminEntity);
				return adminModel;
			}else {
				return null;
			}
		}
		return null;
		
	}
}
