package co.unicauca.facade.domain.order;

import co.unicauca.facade.access.IOrderRepository;

/**
 * Fachada
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public class OrderFacade implements IOrderService {

    /**
     * Pedido
     */
    private Order order;

    /**
     * Método para crear un pedido
     *
     * @param customer cliente
     */
    public void createOrder(Customer customer) {
        this.order = new Order(customer);
        this.changeState(State.NEW);
    }

    /**
     * Método que adiciona un item al pedido
     *
     * @param dish Plato
     * @param amount Cantidad
     */
    public void addDish(Dish dish, int amount) {
        this.order.addDish(dish, amount);
    }

    /**
     * Método que fija el estado del pedido
     *
     * @param state Estado
     */
    public void changeState(State state) {
        this.order.setState(state);
    }

    /**
     * Método que cancela un pedido
     */
    public void cancelOrder() {
        this.order.setState(State.CANCELLED);
    }

    /**
     * Método que calcula el valor total de un pedido
     *
     * @return Valor total
     */
    public int calculateTotal() {
        return order.calculateTotal();
    }

    /**
     * Método para obtener un pedido
     *
     * @return Pedido
     */
    public Order getOrder() {
        return this.order;
    }

    /**
     * Método que obtiene la cantidad de platos pedidos
     *
     * @return Cantidad
     */
    public int totalDishes() {
        return this.order.getDetails().size();
    }

    /**
     * Método que almacena un pedido
     *
     * @param repo Repositorio
     */
    public void save(IOrderRepository repo) {
        repo.createOrder(this.order);
    }

}
