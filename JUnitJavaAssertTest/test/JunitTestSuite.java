import junit.framework.*;

public class JunitTestSuite {
    public static void main(String[] args) {
        //add the test's in the suite
        TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class, TestJunit3.class);
        TestResult result = new TestResult();
        suite.run(result);
        
        suite.setName("SuiteTestName");
        System.out.println("\nTestSuite Name: " + suite.getName());
        
        System.out.println("Number of test Cases = " + result.runCount());
    }
}