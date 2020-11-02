package co.unicauca.facade.domain.order;

import co.unicauca.facade.access.IOrderRepository;

/**
 * Interface que debe ser imlementada tanto por los proxies como por los sujetos
 * que realizan la operación.
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public interface IOrderService {

    /**
     * Método que guarda un pedido
     *
     * @param repo Repositorio
     */
    public void save(IOrderRepository repo);
}
