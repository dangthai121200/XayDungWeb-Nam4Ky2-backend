package app.netlify.laptopso1vn.RECOURSE;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_PLAIN + ";charset=utf-8")
public class MainRecourse {
	
	@GET
	public String main() {
		return "Chào mừng bạn đến với laptopso1vn";
	}
	
}
