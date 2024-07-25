package TestProgramme;

import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestDemo {
    @Test
    public void testMethod1() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Test 1 was passed", true);
    }

    @BeforeClass
    public void testMethod2()throws InterruptedException
    {
        Thread.sleep(3000);
        Reporter.log("Test 2 was passed", true);
    }

    @Test
    public void testMethod3()throws InterruptedException
    {
        Thread.sleep(3000);
        Reporter.log("Test 3 was passed", true);
    }

    @Test
    public void testMethod4()throws InterruptedException
    {
        Thread.sleep(3000);
        Reporter.log("Test 4 was passed", true);
    }
}
