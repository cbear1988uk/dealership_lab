import org.junit.Before;
import org.junit.Test;
import property.Tyre;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    public Tyre tyres;

    @Before
    public void setup(){
        tyres = new Tyre("All-Season");
    }

    @Test
    public void hasTyreType(){
        assertEquals("All-Season", tyres.getType());
    }


}
