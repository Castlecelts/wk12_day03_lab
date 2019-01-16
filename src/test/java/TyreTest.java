import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TyreTest {

    Tyre tyre;
    @Before
    public void setUp() {
        tyre = new Tyre("Dunlop", "winter");
    }

    @Test
    public void getBrand() {
        assertEquals("Dunlop", tyre.getBrand());
    }

    @Test
    public void getType() {
        assertEquals("winter", tyre.getType());
    }

    @Test
    public void hasA() {
        assertEquals("This is a component class Tyre", tyre.hasA());
    }
}