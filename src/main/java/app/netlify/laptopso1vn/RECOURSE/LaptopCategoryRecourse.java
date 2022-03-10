package app.netlify.laptopso1vn.RECOURSE;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import app.netlify.laptopso1vn.MODEL.CategoryLaptopModel;
import app.netlify.laptopso1vn.SERVICE.LaptopCategoryService;

@Path("v1/categoryLaptop")
public class LaptopCategoryRecourse {
	
	private LaptopCategoryService CategoryLaptopModel;
	public LaptopCategoryRecourse() {
		CategoryLaptopModel = new LaptopCategoryService();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<CategoryLaptopModel> getAllCategoryLaptop(){
		List<CategoryLaptopModel> data = CategoryLaptopModel.getAllCategoryLaptop();
		return data; 
		
	}
}
