package app.netlify.laptopso1vn.RECOURSE;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class MainRecourse {
	public String main() {
		return "Chào mừng bạn đến với laptopso1vn";
	}
}
