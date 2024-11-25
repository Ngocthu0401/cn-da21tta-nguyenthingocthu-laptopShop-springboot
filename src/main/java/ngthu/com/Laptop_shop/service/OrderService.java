package ngthu.com.Laptop_shop.service;

import ngthu.com.Laptop_shop.model.OrderRequest;
import ngthu.com.Laptop_shop.model.ProductOrder;

import java.util.List;


public interface OrderService {

    public void saveOrder(Integer userid, OrderRequest orderRequest) throws Exception;

    public List<ProductOrder> getOrdersByUser(Integer userId);

    public ProductOrder updateOrderStatus(Integer id, String status);

    public List<ProductOrder> getAllOrders();
}
