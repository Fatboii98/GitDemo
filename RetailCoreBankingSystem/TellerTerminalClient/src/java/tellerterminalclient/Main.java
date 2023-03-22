/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tellerterminalclient;

import ejb.session.stateless.CustomerSessionBeanRemote;
import entity.Customer;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author yeowh
 */
public class Main {

    @EJB
    private static CustomerSessionBeanRemote customerSessionBeanRemote;

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Customer> customers = customerSessionBeanRemote.retrieveAllCustomers();
        
        customers.forEach(customer -> {
            System.out.println("customerID" + customer.getCustomerId() + "; customer name = " + customer.getFirstName());
        });
        
        
    }
    
}
