/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.singleton;

import ejb.session.stateless.CustomerSessionBeanLocal;
import entity.Customer;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author yeowh
 */
@Singleton
@LocalBean
@Startup

public class DataInitSessionBean {

    @EJB
    private CustomerSessionBeanLocal customerSessionBeanLocal;

    @PersistenceContext(unitName = "RetailCoreBankingSystem-ejbPU")
    private EntityManager em;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PostConstruct
    public void postConstruct() {
        if(em.find(Customer.class, 1l) == null){
            customerSessionBeanLocal.createNewCustomer(new Customer("AfirstName", "lastName"));
            customerSessionBeanLocal.createNewCustomer(new Customer("BfirstName", "lastName"));
            customerSessionBeanLocal.createNewCustomer(new Customer("CfirstName", "lastName"));
            customerSessionBeanLocal.createNewCustomer(new Customer("DfirstName", "lastName"));
        }
    } 
}
