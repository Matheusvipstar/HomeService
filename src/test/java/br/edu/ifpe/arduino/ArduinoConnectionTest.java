package test.java.br.edu.ifpe.arduino;

import br.edu.ifpe.arduino.ArduinoConnection;
import br.edu.ifpe.arduino.SensorAnswer;
import java.io.DataInputStream;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ArduinoConnectionTest {
    
    public ArduinoConnectionTest() {
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
     * Test of getSensorAnswer method, of class ArduinoConnection.
     * @throws java.io.IOException
     */
    @Test
    public void testGetSensorAnswer() throws IOException {
        System.out.println("getSensorAnswer");
        DataInputStream entrada = mock(DataInputStream.class);
        when(entrada.readLine()).then(11);
        ArduinoConnection instance = new ArduinoConnection(1);
        SensorAnswer expResult = new SensorAnswer(11);
        SensorAnswer result = instance.getSensorAnswer();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdConnection method, of class ArduinoConnection.
     */
    @Test
    public void testGetIdConnection() {
        System.out.println("getIdConnection");
        ArduinoConnection instance = null;
        Integer expResult = null;
        Integer result = instance.getIdConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdConnection method, of class ArduinoConnection.
     */
    @Test
    public void testSetIdConnection() {
        System.out.println("setIdConnection");
        Integer idConnection = null;
        ArduinoConnection instance = null;
        instance.setIdConnection(idConnection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
