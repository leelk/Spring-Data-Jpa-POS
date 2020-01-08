package lk.ijse.dep.pos.test;

import lk.ijse.dep.pos.AppConfig;
import lk.ijse.dep.pos.dao.CustomerDAO;
import lk.ijse.dep.pos.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@ContextConfiguration(classes = {AppConfig.class})
@RunWith(SpringRunner.class)


public class MyTest {

    @Autowired
    CustomerDAO customerDAO;


    @Test
    public void getCustomersByNameLike(){
        List<Customer> customers = customerDAO.getCustomersByNameLike("%");
        for (Customer customer : customers) {
            System.out.println(customer.getName());
        }
    }


    @Test
    public void countAllByCustomers(){
        int i = customerDAO.countCustomerBy()   ;
        System.out.println(i);
    }


}
