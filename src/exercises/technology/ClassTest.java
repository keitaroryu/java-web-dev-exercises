package exercises.technology;

import jdk.jfr.StackTrace;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassTest {
    Computer dell;
    Laptop toshiba;
    Smartphone samsung;

    @Before
    public void createTestComputer() {
        dell = new Computer(16, 256, "No");
    }

    @Test
    public void testComputerRamConstructor(){
        assertEquals(16, dell.getRam(), 0.001);
    }

    @Test
    public void testComputerStorageConstructor(){
        assertEquals(256, dell.getStorage(), 0.001);
    }

    @Test
    public void testComputeWifiConstructor(){
        assertEquals("No", dell.getWifiCapable());
    }

    @Before
    public void createTestLaptop(){
        toshiba = new Laptop(15);
    }

    @Test
    public void testLaptopRamInheritance(){
        assertEquals(8, toshiba.getRam(), 0.001);
    }

    @Test
    public void testLaptopStorageInheritance(){
        assertEquals(128, toshiba.getStorage(), 0.001);
    }

    @Test
    public void testLaptopWifiInheritance(){
        assertEquals("Yes", toshiba.getWifiCapable());
    }

    @Test
    public void testLaptopScreenSizeConstructor(){
        assertEquals(15, toshiba.getScreenSize(), 0.001);
    }

    @Before
    public void createTestSmartphone(){
        samsung = new Smartphone(4000, 8);
    }

    @Test
    public void testSmartphoneInheritance(){
        assertEquals(8, samsung.getRam(), 0.001);
        assertEquals(128, toshiba.getStorage(), 0.001);
        assertEquals("Yes", toshiba.getWifiCapable());
    }

    @Test
    public void testSmartphoneScreenSizeConstructor(){
        assertEquals(8, samsung.getScreenSize(), 0.001);
    }

    @Test
    public void testSmartphoneBatteryCapacityConstructor(){
        assertEquals(4000, samsung.getBatteryCapacity(), 0.001);
    }


}
