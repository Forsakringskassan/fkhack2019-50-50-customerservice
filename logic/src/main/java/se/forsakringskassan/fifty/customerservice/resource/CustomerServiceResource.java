package se.forsakringskassan.fifty.customerservice.resource;


import se.forsakringskassan.fifty.customerservice.api.Customer;
import se.forsakringskassan.fifty.customerservice.logic.CustomerService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/customerservice")
public class CustomerServiceResource
{
    @Inject
    CustomerService customerService;

    @Path("/customers/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomer(@PathParam("id") String id)
    {
        return customerService.getCustomer(UUID.fromString(id));
    }

    @Path("/customers/{id}")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createCustomer(@PathParam("id") String id, Customer customer)
    {
        customer.id = UUID.fromString(id);
        customerService.storeCustomer(customer);
    }



}
