package co.unicauca.facade.access;

/**
 * Fabrica que se encarga de instanciar un repositorio concreto 
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public class Factory {

    /**
     * Atributo de fabrica
     */
    private static Factory instance;

    /**
     * Constructor
     */
    private Factory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia IOrderRepository
     *
     * @param type
     * @return
     */
    public IOrderRepository getRepository(String type) {
        IOrderRepository result = null;

        switch (type) {
            case "default":
                result = new OrderRepository();
                break;
        }

        return result;

    }
}
