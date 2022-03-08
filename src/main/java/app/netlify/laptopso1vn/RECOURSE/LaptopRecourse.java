package app.netlify.laptopso1vn.RECOURSE;

import java.util.List;

import app.netlify.laptopso1vn.MODEL.LaptopModel;
import app.netlify.laptopso1vn.SERVICE.LaptopService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("v1/laptop")
public class LaptopRecourse {
	
	private LaptopService laptopService;
	

	public LaptopRecourse() {
		laptopService = new LaptopService();
	}


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<LaptopModel> getAllLaptop(){
		List<LaptopModel> laptopModels = laptopService.getAllLaptop();
		return laptopModels;
	}
	
	
}
