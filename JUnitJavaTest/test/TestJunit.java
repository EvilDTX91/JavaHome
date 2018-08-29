import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestJunit {
    /*
    public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestJunit.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }*/
    
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   //Good
   /*@Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }*/
   
   
   //Fail
   @Test
   public void testPrintMessage() {
      message = "New Word";
      assertEquals(message,messageUtil.printMessage());
   }
}
