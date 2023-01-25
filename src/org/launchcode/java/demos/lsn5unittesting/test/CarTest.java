package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {
    Car test_car;
    @Before
    public void createCarObject() {
        test_car = new Car("Toyota","Prius", 10,50);
    }
    // Add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    /*
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
     */

    // Check that constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        // Car test_car = new Car("Toyota","Prius", 10,50);
        assertEquals(10,test_car.getGasTankLevel(), .001);
    }

    // Write another version of testInitialGasTank() using assertFalse(), comparing the value to 0.
    @Test
    public void reTestInitialGasTank() {
        assertFalse(test_car.getGasTankLevel() <= 0);
    }
    // Write another version of testInitialGasTank() using assertTrue().
    @Test
    public void reReTestInitialGasTank() {
        assertTrue(test_car.getGasTankLevel() == test_car.getGasTankSize());
    }

    // gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9,test_car.getGasTankLevel(),.001);
    }

    // gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(1000);
        assertEquals(test_car.getGasTankLevel(), 0,.001);
    }
    // can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        // I tried to have the car drive 100 miles (tank 8), add a gallon (tank 9), add 5 gallons... and that failed.
        // test_car.drive(100);
        // test_car.addGas(1);
        // System.out.println("a " + test_car.getGasTankLevel());
        test_car.addGas(5);
        // System.out.println("b "+test_car.getGasTankLevel());
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }

}
