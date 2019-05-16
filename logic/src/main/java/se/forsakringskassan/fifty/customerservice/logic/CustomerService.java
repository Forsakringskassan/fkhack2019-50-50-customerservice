package se.forsakringskassan.fifty.customerservice.logic;

import se.forsakringskassan.fifty.customerservice.api.Customer;

import javax.enterprise.context.ApplicationScoped;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@ApplicationScoped
public class CustomerService
{
    // in mem "db"
    private final static Map<UUID, Customer> m = new ConcurrentHashMap<>();

    public void storeCustomer(Customer customer)
    {
        m.put(customer.id, customer);
    }

    public Customer getCustomer(UUID id)
    {
        Customer customer = m.get(id);
        if(null == customer)
        {
            throw new CustomerDoesNotExistException("customer does not exist");
        }
        return customer;
    }

}
