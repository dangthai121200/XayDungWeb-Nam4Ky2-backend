package app.netlify.laptopso1vn.SERVICE;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import app.netlify.laptopso1vn.DAO.LaptopCategoryDao;
import app.netlify.laptopso1vn.ENTITY.LaptopEntity;
import app.netlify.laptopso1vn.ENTITY.LoaiMayEntity;
import app.netlify.laptopso1vn.MODEL.CategoryLaptopModel;

public class LaptopCategoryService {
	
	private LaptopCategoryDao laptopCategoryDao;

	public LaptopCategoryService() {
		laptopCategoryDao = new LaptopCategoryDao();
	}
	
	public List<CategoryLaptopModel> getAllCategoryLaptop() {
		List<LoaiMayEntity> loaiMayEntities = laptopCategoryDao.getAllCategoryLaptop();
		List<CategoryLaptopModel> categoryLaptopModels = new ArrayList<CategoryLaptopModel>();
		for (LoaiMayEntity loaiMayEntity : loaiMayEntities) {
			categoryLaptopModels.add(new CategoryLaptopModel(loaiMayEntity));
		}
		return categoryLaptopModels;
	}
	
}
