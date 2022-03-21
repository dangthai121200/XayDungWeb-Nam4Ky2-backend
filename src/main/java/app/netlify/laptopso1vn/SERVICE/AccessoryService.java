package app.netlify.laptopso1vn.SERVICE;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import app.netlify.laptopso1vn.DAO.AccessoryDao;
import app.netlify.laptopso1vn.ENTITY.PhuKienEntity;
import app.netlify.laptopso1vn.MODEL.AccessoryModel;

public class AccessoryService {

private AccessoryDao accessoryDao;
	
	public AccessoryService() {
		accessoryDao = new AccessoryDao();
	}
	
	public List<AccessoryModel> getAllAccessory() {
		List<PhuKienEntity> phuKienEntities = accessoryDao.getAllAccessory();
		List<AccessoryModel> accessoryModels = new ArrayList<AccessoryModel>();
		for (PhuKienEntity phuKienEntity : phuKienEntities) {
			accessoryModels.add(new AccessoryModel(phuKienEntity));
		}
		return accessoryModels;
	}
	
//	public static void main(String[] args) {
//		AccessoryService accessoryService = new AccessoryService();
//		System.out.println(accessoryService.getAllAccessory());
//	}
}
