
import org.junit.Before;
import org.junit.Test;
import property.Engine;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    public Engine engine;

    @Before
    public void setup(){
        engine = new Engine("V12");
    }

    @Test
    public void hasEngineType(){
        assertEquals("V12", engine.getType());
    }

}
