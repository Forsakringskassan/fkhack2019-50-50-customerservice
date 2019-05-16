package se.forsakringskassan.fifty.customerservice.api;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.UUID;

@RegisterForReflection
public final class Customer
{
    public UUID id;
    public String name;
    public PaymentMethod paymentMethod;

    @Override
    public String toString()
    {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
