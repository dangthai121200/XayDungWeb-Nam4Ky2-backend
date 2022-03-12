package app.netlify.laptopso1vn.RECOURSE;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import app.netlify.laptopso1vn.EXCEPTION.LoginException;
import app.netlify.laptopso1vn.FORM.FormLogin;
import app.netlify.laptopso1vn.MODEL.AdminModel;
import app.netlify.laptopso1vn.MODEL.UserModel;
import app.netlify.laptopso1vn.SERVICE.AdminService;


@Path("v1/admin")
public class AdminRecourse {
	
	private AdminService adminService;
	
	public AdminRecourse() {
		adminService = new AdminService();
	}

	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public AdminModel getUser(@Valid  FormLogin  formLogin) throws LoginException {
		AdminModel data = adminService.getUserFromLogin(formLogin);
		return data;
		
	}

}
