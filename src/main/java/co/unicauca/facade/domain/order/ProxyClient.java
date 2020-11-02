package co.unicauca.facade.domain.order;

import co.unicauca.facade.access.Factory;
import co.unicauca.facade.access.IOrderRepository;

/**
 * Proxy
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public class ProxyClient {

    /**
     * Servicio
     */
    private IOrderService orderService;

    /**
     * Constructor
     */
    public ProxyClient(IOrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * Método para realizar un pedido
     */
    public void createOrder() {
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        orderService.save(repo);
    }
    
    public IOrderService getOrderService(){
        return this.orderService;
    }

}
