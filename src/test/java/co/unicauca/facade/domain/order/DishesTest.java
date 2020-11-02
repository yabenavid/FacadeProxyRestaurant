/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facade.domain.order;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias
 * 
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public class DishesTest {
    
    

    /**
     * Test of createOrder method, of class ProxyClient.
     */
    @Test
    public void testCreateOrder() {
    	
     	 System.out.println("createOrder");
         
         OrderFacade orderFacade = new OrderFacade();
                 
         orderFacade.createOrder(new Customer(1, "Pedro Perez", "Calle 5 No. 28-36", "3208978989", "Popayán"));
         orderFacade.addDish(new Dish(1, "Pizza hawaiana", 4000), 3);

         assertEquals(State.NEW, orderFacade.getOrder().getState());

         assertEquals("Pedro Perez", orderFacade.getOrder().getCustomer().getName());
         assertEquals("Pizza hawaiana", orderFacade.getOrder().getDetails().get(0).getDish().getName());
         assertEquals(4000, orderFacade.getOrder().getDetails().get(0).getDish().getPrice());
         assertEquals(12000, orderFacade.getOrder().calculateTotal());
         
          orderFacade.changeState(State.FINALIZED);
     	 assertEquals(State.FINALIZED, orderFacade.getOrder().getState());
         
     	 orderFacade.cancelOrder();
     	 assertEquals(State.CANCELLED, orderFacade.getOrder().getState());
    	 
    }
    
}
