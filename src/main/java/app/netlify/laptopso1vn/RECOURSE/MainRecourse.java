package app.netlify.laptopso1vn.RECOURSE;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_PLAIN + ";charset=utf-8")
public class MainRecourse {
	
	@GET
	public String main() {
		return "Chào mừng bạn đến với laptopso1vn";
	}
	
}
