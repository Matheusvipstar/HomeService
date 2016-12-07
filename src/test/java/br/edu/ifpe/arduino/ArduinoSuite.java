/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.br.edu.ifpe.arduino;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 *
 * @author mathe
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({test.java.br.edu.ifpe.arduino.SensorControllerTest.class,
    test.java.br.edu.ifpe.arduino.ArduinoConnectionTest.class,
    test.java.br.edu.ifpe.arduino.RestServerTest.class, test.java.br.edu.ifpe.arduino.SensorAnswerTest.class})
public class ArduinoSuite {

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
    
}
