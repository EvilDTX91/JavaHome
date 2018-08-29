/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junittest.JUnitTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Tomi
 */
public class TestJUnitTest {
    
    public TestJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
	
   public void testAdd() {
      String str = "Junit is working fine";
      assertEquals("Junit is working fine",str);
   }
    @Test
    public void myFirstTest() {
        assertEquals(2, 1 + 1);
    }
    
    @Test
    public void succeedingTest() {
    }

    @Test
    public void failingTest() {
        fail("a failing test");
    }

    @Test
    @Ignore("for demonstration purposes")
    public void skippedTest() {
        // not executed
    }
    
    
    
    /*
    @Test
    public void firstTeszt(){
        
        JUnitTest wordTest = new JUnitTest();
        
        System.out.print("1. Test:");
        String words = "balaton";
        String reverseWords = wordTest.CallStringReverse(words);
        System.out.println(words);
        System.out.println(reverseWords);
        if(words.equals(reverseWords))
        {
             System.out.println("OK");
        }
        else
        {
                System.out.println("NOK");
        }
    }*/
}
