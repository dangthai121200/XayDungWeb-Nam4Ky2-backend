package app.netlify.laptopso1vn.SERVICE;

import java.util.ArrayList;
import java.util.List;

import app.netlify.laptopso1vn.DAO.OrderDao;
import app.netlify.laptopso1vn.ENTITY.DonHangEntity;
import app.netlify.laptopso1vn.MODEL.OrderModel;

public class OrderService {
	
	private OrderDao orderDao;
	

	public OrderService() {
		orderDao = new OrderDao();
	}

	public List<OrderModel> getOrders() {
		List<DonHangEntity> donHangEntities = orderDao.getOrders();
		List<OrderModel> orderModels = new ArrayList<OrderModel>();
		for (DonHangEntity donHangEntity : donHangEntities) {
			OrderModel orderModel = new OrderModel(donHangEntity);
			orderModels.add(orderModel);
		}
		return orderModels;
	}
	
}
