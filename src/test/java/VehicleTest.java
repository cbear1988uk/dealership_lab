import org.junit.Before;
import org.junit.Test;
import property.Vehicle;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    public Vehicle vehicle;
    public Vehicle vehicle2;

    @Before
    public void setup(){
        vehicle = new Vehicle("Prius", "Hybrid", "Red", 15000, false);
        vehicle2 = new Vehicle("Selica", "Fubar", "Light Orange", 16000, true);
    }

    @Test
    public void hasModel(){
        assertEquals("Prius", vehicle.getModel());
    }

    @Test
    public void hasType(){
        assertEquals("Hybrid", vehicle.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Red", vehicle.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(15000, vehicle.getPrice(), 0.01);
    }

    @Test
    public void hasDamage(){
        assertEquals(false, vehicle.getDamage());
    }

    @Test
    public void canDeductDamage(){
        assertEquals(12000, vehicle2.deductDamage(), 0.01);
    }

}
