import org.junit.Before;
import org.junit.Test;
import visitors.Customer;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    public Customer customer;

    @Before
    public void setup(){
        customer = new Customer("Benjamin Linus", 30000);
    }

    @Test
    public void hasName(){
        assertEquals("Benjamin Linus", customer.getName());
    }

    @Test
    public void hasBudget(){
        assertEquals(30000, customer.getBudget(), 0.001);
    }

    @Test
    public void canBuyCar(){
        assertEquals(true, customer.buyCar());
    }
}
