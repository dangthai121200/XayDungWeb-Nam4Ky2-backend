package app.netlify.laptopso1vn.RECOURSE;

import java.util.List;

import app.netlify.laptopso1vn.MODEL.OrderModel;
import app.netlify.laptopso1vn.SERVICE.OrderService;
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
	@Produces(MediaType.APPLICATION_JSON)
	public List<OrderModel> getOrders(){
		List<OrderModel> data = orderService.getOrders();
		return data;
		
	}
	
}
