package co.unicauca.facade.access;

import co.unicauca.facade.domain.order.Order;

/**
 * Repositorio de pedidos
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public class OrderRepository implements IOrderRepository {
    
    @Override
    public void save(Order order) {
        System.out.println("Pedido grabado con éxito en la base de datos");
    }
    
    @Override
    public void createOrder(Order order) {
    }

}
