/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Noemí
 */
public class NumerosTest {
    
    public NumerosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testPositivo() {
        System.out.println("positivo");
        int num = -1;
        boolean expResult = false;
        boolean result = Numeros.positivo(num);
        assertEquals(expResult, result);
        int num1=12;
        boolean expResult1=true;
        boolean result1=Numeros.positivo(num1);
        assertEquals(expResult1,result1);
        
    }
    @Disabled
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Numeros.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
