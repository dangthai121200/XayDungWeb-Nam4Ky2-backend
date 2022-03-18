package app.netlify.laptopso1vn.RECOURSE;

import java.util.List;

import app.netlify.laptopso1vn.MODEL.OrderModel;
import app.netlify.laptopso1vn.SERVICE.OrderService;
import app.netlify.laptopso1vn.UTIL.Laptopso1vnUtil;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("v1/orders")
public class OrderRecourse {
	
	private OrderService orderService;

	public OrderRecourse() {
		orderService = new OrderService();
	}
	
	@GET
	@RolesAllowed(Laptopso1vnUtil.ADMIN_ROLE)
	@Produces(MediaType.APPLICATION_JSON)
	public List<OrderModel> getOrders(){
		List<OrderModel> data = orderService.getOrders();
		return data;
	}
	
}
