package co.unicauca.facade.domain.order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un pedido
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public class Order {

    /**
     * Envío pedido
     */
    public int dispatch;

    /**
     * Cliente pedido
     */
    private Customer customer;

    /**
     * Fecha pedido
     */
    private LocalDate date;

    /**
     * Estado pedido
     */
    private State State;

    /**
     * Detalles pedido
     */
    private List<Item> details;

    /**
     * Constructor
     */
    public Order(Customer customer) {
        this.customer = customer;
        this.details = new ArrayList<Item>();
    }

    /**
     * Getters y setters
     */
    public int getDispatch() {
        return dispatch;
    }

    public void setDispatch(int dispatch) {
        this.dispatch = dispatch;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public State getState() {
        return State;
    }

    public void setState(State State) {
        this.State = State;
    }

    public List<Item> getDetails() {
        return details;
    }

    public void setDetails(List<Item> details) {
        this.details = details;
    }

    /**
     * Método que adiciona un item al pedido
     *
     * @param dish Plato
     * @param amount Cantidad
     */
    public void addDish(Dish dish, int amount) {
        Item item = new Item(dish, amount);
        this.details.add(item);
    }

    /**
     * Método que calcula el valor total del pedido
     *
     * @return el valor total
     */
    public int calculateTotal() {
        int subtotal = 0;
        int total = 0;
        for (Item item : details) {
            subtotal = item.getDish().getPrice();
            total += subtotal * item.getAmount();
        }
        return total;
    }

}
