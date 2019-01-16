import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FuelTankTest {

    FuelTank fuelTank;

    @Before
    public void setUp(){
        fuelTank = new FuelTank();
    }

    @Test
    public void getCapacity() {
        assertEquals(100, fuelTank.getCapacity());
    }

    @Test
    public void useFuel() {
        fuelTank.useFuel(10);
        assertEquals(90, fuelTank.getCapacity());
    }

    @Test
    public void hasA() {
        assertEquals("This has a component class FuelTank", fuelTank.hasA());
    }
}