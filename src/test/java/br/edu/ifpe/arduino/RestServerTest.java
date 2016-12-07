package test.java.br.edu.ifpe.arduino;

import br.edu.ifpe.arduino.ArduinoConnection;
import br.edu.ifpe.arduino.RestServer;
import br.edu.ifpe.arduino.SensorAnswer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.stubbing.Answer;

public class RestServerTest {
    
    public RestServerTest() {
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

    @Test
    public void testGetUser() {
        System.out.println("getUser");
        ArduinoConnection aCon = mock(ArduinoConnection.class);
        when(aCon.getSensorAnswer()).then((Answer<?>) new SensorAnswer(15));
        int sensorId = 1;
        RestServer instance = new RestServer();
        SensorAnswer expResult = new SensorAnswer();
        expResult.setValue(15);
        SensorAnswer result = instance.getUser(sensorId);
        assertEquals(expResult, result);
    }
    
}
