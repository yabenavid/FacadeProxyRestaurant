package co.unicauca.facade.access;

import co.unicauca.facade.domain.order.Order;

/**
 * Interface del repositorio de pedidos
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public interface IOrderRepository {

    /**
     * Método que almacena un pedido 
     */
    public void save(Order order);
    
    /**
     * Método que crea un pedido 
     */
    public void createOrder(Order order);
}
