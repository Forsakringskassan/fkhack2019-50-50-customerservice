package se.forsakringskassan.fifty.customerservice.logic;

public class CustomerDoesNotExistException extends RuntimeException
{
    private static final long serialVersionUID = 1L;
    public CustomerDoesNotExistException(String s)
    {
        super(s);
    }
}
