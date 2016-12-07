package test.java.br.edu.ifpe.arduino;

import br.edu.ifpe.arduino.ArduinoConnection;
import br.edu.ifpe.arduino.SensorController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class SensorControllerTest {
    
    public SensorControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    /**
     * Test of getInstance method, of class SensorController.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        SensorController expResult = ;
        SensorController result = SensorController.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getArduinoConnection method, of class SensorController.
     */
    @Test
    public void testGetArduinoConnection() {
        System.out.println("getArduinoConnection");
        Integer sensorId = 1;
        SensorController instance = SensorController.getInstance();
        ArduinoConnection expResult = new ArduinoConnection(1);
        ArduinoConnection result = instance.getArduinoConnection(1);
        assertEquals(expResult, result);
    }
    
}
