/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packEnumeradores;

import entites.Order;
import java.util.Date;

/**
 *
 * @author Lucas
 */
public class AppEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAIMENT);
        
        System.out.println(order);
    }
    
}
