package app.netlify.laptopso1vn.SERVICE;

import java.util.ArrayList;
import java.util.List;

import app.netlify.laptopso1vn.DAO.LaptopDao;
import app.netlify.laptopso1vn.ENTITY.LaptopEntity;
import app.netlify.laptopso1vn.MODEL.LaptopModel;

public class LaptopService {

	private LaptopDao laptopDao;

	public LaptopService() {
		laptopDao = new LaptopDao();
	}
	
	public List<LaptopModel> getAllLaptop(){
		List<LaptopEntity> laptopEntities = laptopDao.getAllLaptop();
		List<LaptopModel> laptopModels = new ArrayList<LaptopModel>();
		for (LaptopEntity laptopEntity : laptopEntities) {
			LaptopModel laptopModel = new LaptopModel(laptopEntity);
			laptopModels.add(laptopModel);
		}
		return laptopModels;
	}
	
	
}
