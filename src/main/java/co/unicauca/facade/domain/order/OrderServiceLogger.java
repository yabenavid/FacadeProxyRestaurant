package co.unicauca.facade.domain.order;

import co.unicauca.facade.access.IOrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Proxy de loggin
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public class OrderServiceLogger implements IOrderService {

    /**
     * Fachada
     */
    private OrderFacade orderFacade;
    
    /**
     * Logger
     */
    private Logger logger;

    /**
     * Constructor
     */
    public OrderServiceLogger(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
        logger = LoggerFactory.getLogger(OrderServiceLogger.class);
    }

    /**
     * Método para poder llevar los logs
     *
     * @param repo Repositorio
     */
    @Override
    public void save(IOrderRepository repo) {
        repo.createOrder(orderFacade.getOrder());

        // Se hace el log 
        String message = "Pedido guardado en la base de datos";
        logger.info("Pedido guardado en la base de datos");
    }

}
