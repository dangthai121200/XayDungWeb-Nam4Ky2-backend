package app.netlify.laptopso1vn.RECOURSE;

import java.util.List;

import app.netlify.laptopso1vn.MODEL.LaptopModel;
import app.netlify.laptopso1vn.SERVICE.LaptopService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
