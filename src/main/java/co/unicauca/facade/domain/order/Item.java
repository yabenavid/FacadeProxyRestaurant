package co.unicauca.facade.domain.order;

/**
 * Representa un item
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public class Item {
    
    /**
     * Plato
     */
    private Dish dish;
    
    /**
     * Cantidad
     */
    private int amount;

    /**
     * Constructores
     */
    public Item() {
    }

    public Item(Dish dish, int amount) {
        this.dish = dish;
        this.amount = amount;
    }

    /**
     * Getters y setters
     */
    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
}
