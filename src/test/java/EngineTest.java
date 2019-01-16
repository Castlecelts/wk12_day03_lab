import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {


    Engine engine;
    @Before
    public void setUp(){
        engine = new Engine("1.6Litre", "BMW");
    }

    @Test
    public void getSize() {
        assertEquals("1.6Litre", engine.getSize());
    }

    @Test
    public void getManufacturer() {
        assertEquals("BMW", engine.getManufacturer());
    }

    @Test
    public void hasA() {
        assertEquals("This is a component class Engine", engine.hasA());
    }
}