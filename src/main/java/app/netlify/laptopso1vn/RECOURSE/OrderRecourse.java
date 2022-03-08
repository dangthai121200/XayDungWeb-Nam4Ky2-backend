package app.netlify.laptopso1vn.RECOURSE;

import java.util.List;

import app.netlify.laptopso1vn.MODEL.OrderModel;
import app.netlify.laptopso1vn.SERVICE.OrderService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("v1/orders")
public class OrderRecourse {
	
	private OrderService orderService;

	public OrderRecourse() {
		orderService = new OrderService();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<OrderModel> getOrders(){
		List<OrderModel> orderModels = orderService.getOrders();
		System.out.println(orderModels);
		return orderModels;
		
	}
	
}
