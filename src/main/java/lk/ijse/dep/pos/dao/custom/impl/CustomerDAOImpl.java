package lk.ijse.dep.pos.dao.custom.impl;

import lk.ijse.dep.pos.dao.CrudDAOImpl;
import lk.ijse.dep.pos.dao.custom.CustomerDAO;
import lk.ijse.dep.pos.entity.Customer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;


@Repository
public class CustomerDAOImpl extends CrudDAOImpl<Customer, String> implements CustomerDAO {

    @Override
    public String getLastCustomerId() throws Exception {
        Query nativeQuery = entityManager.
                createNativeQuery("SELECT customer_id FROM Customer ORDER BY customer_id DESC LIMIT 1");
        return nativeQuery.getResultList().size() > 0 ? (String) nativeQuery.getSingleResult() : null;
    }


}
