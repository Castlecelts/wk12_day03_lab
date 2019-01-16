import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ElectricTest {

    IComponent component1;
    IComponent component2;
    Electric car;
    ArrayList<IComponent> parts;


    @Before
    public void setUp() {
        component1 = new FuelTank();
        component2 = new Engine("1.6Litre", "BMW");
        parts = new ArrayList<>();
        parts.add(component1);
        parts.add(component2);

        car = new Electric(10000.00, "Red", parts);
    }

    @Test
    public void getFuelTanks() {
        assertEquals(1, car.getFuelTanks().size());
    }

    @Test
    public void drive() {
        car.drive(10);
        assertEquals(90, car.getFuelTanks().get(0).capacity);
    }

    @Test
    public void reFuel() {
        car.drive(10);
        assertEquals(90, car.getFuelTanks().get(0).capacity);
        car.reFuel();
        assertEquals(100, car.getFuelTanks().get(0).capacity);
    }
}
