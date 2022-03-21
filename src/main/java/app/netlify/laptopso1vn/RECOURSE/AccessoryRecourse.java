package app.netlify.laptopso1vn.RECOURSE;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import app.netlify.laptopso1vn.MODEL.AccessoryModel;
import app.netlify.laptopso1vn.SERVICE.AccessoryService;

@Path("v1/accessory")
public class AccessoryRecourse {
	
	private AccessoryService accessoryService;
	
	public AccessoryRecourse() {
		accessoryService = new AccessoryService();
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public List<AccessoryModel> getAllAccessory() {
		List<AccessoryModel> accessoryModels = accessoryService.getAllAccessory();
		return accessoryModels;
	}
	
}
