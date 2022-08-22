import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void setUp(){
        bike = new Bike();
    }

    @Test
    public void bikeCanBeTurnedOnTest(){
        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void bikeCanBeTurnedOff(){
//        take note
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());

    }

    @Test
    public void bikeCanBeAcceleratedOnGearOneTest(){
        bike.turnOn();
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getGear());

        bike.increaseSpeed();
//        bike.increaseSpeed();
//        bike.increaseSpeed();
//        you can increase multiple times
        assertEquals(1, bike.getSpeed());
    }

    @Test
    public void bikeWillNotAccelerateWhenOffTest(){
        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());

        bike.increaseSpeed();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeCanChangeFromGear0neToGearTwoAutomatically(){
        bike.turnOn();
        assertEquals(1, bike.getGear());
        for(int i = 0; i < 20; i++){
            bike.increaseSpeed();
        }

        assertEquals(20, bike.getSpeed());
        assertEquals(1, bike.getGear());
        bike.increaseSpeed();
        assertEquals(2, bike.getGear());
        assertEquals(21, bike.getSpeed());
    }


    @Test
    public void bikeCanAccelerateOnGearTwoTest() {
        bike.turnOn();
        for(int v = 0; v < 21; v++){
            bike.increaseSpeed();
        }
        assertEquals(2, bike.getGear());
        assertEquals(21, bike.getSpeed());

//        bike.increaseSpeed();
//        you can increase twice
        bike.increaseSpeed();
        assertEquals(23, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void bikeCanChangeFromGearTwoToGearThreeTest() {
        bike.turnOn();
        for(int i = 0; i < 25; i++){
            bike.increaseSpeed();
        }
        assertEquals(29, bike.getSpeed());
        assertEquals(2, bike.getGear());

        bike.increaseSpeed();
        assertEquals(3, bike.getGear());
        assertEquals(31, bike.getSpeed());
    }






















}
