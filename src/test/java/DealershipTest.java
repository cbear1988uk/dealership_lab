import org.junit.Before;
import org.junit.Test;
import property.Dealership;
import property.Vehicle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DealershipTest {

    Vehicle vehicle1;
    Dealership dealership;

    @Before
    public void setup(){
        vehicle1 = new Vehicle("Prius", "Electric", "Teal", 15000, false);
        dealership = new Dealership(vehicle1, 35000);
    }

    @Test
    public void hasModel(){
        assertEquals("Prius", vehicle1.getModel());
    }

    @Test
    public void hasType(){
        assertEquals("Electric", vehicle1.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Teal", vehicle1.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(15000, vehicle1.getPrice(), 0.01);
    }

    @Test
    public void canThrowPitch(){
        assertEquals("This ride is way sick, bro.", dealership.throwPitch("This ride"));
    }

    @Test
    public void canBuyCar(){
        assertEquals(false, dealership.buyCar());
    }


}
