import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit {
    
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);
    
    @Test(timeout = 1000)
    public void testPrintMEssage() {
        System.out.println("Inside testPrintMessage()");
        messageUtil.printMessage();
    }
    
    @Test
    public void testSalutuionMessage() {
        System.out.println("Inside testSalutionMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}