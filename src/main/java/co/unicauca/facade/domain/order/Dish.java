package co.unicauca.facade.domain.order;

/**
 * Representa un plato
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public class Dish {

    /**
     * Identificador plato
     */
    private int id;
    
    /**
     * Nombre plato 
     */
    private String name;
    
    /**
     * Precio plato 
     */
    private int price;

    /**
     * Constructores
     */
    public Dish() {
    }

    public Dish(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Getters y setters
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
