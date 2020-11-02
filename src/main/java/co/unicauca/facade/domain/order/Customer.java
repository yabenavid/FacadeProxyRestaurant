package co.unicauca.facade.domain.order;

/**
 * Representa un cliente
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public class Customer {

    /**
     * Identificación cliente
     */
    private int id; 
    
    /**
     * Nombre cliente
     */
    private String name;
    
    /**
     * Dirección cliente
     */
    private String address;
    
    /**
     * Número de contacto cliente
     */
    private String mobile;
    
    /**
     * Ciudad cliente
     */
    private String city;

    /**
     * Constructores
     */
    public Customer() {
    }

    public Customer(int id, String name, String address, String mobile, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.city = city;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
