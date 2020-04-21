/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod59cntt1;

import pizza.Pizza;
import pizza.PizzaType;
import store.ChicagoPizzaStore;
import store.NYPizzaStore;
import store.PizzaStore;

/**
 *
 * @author asus
 */
public class FactoryMethod59CNTT1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        PizzaStore store = new ChicagoPizzaStore();
        Pizza pizza = store.orderPizza(PizzaType.cheese);
        System.out.println(pizza.toString());
        
        PizzaStore nYStore = new NYPizzaStore();
        Pizza pizza1 = nYStore.orderPizza(PizzaType.clam);
        System.out.println(pizza1.toString());
    }
    
}
