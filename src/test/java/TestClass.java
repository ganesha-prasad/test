import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

    public void  TestApp(){
       TestPOMClass pom = new TestPOMClass();
       WebDriverManager.chromedriver().driverVersion("126.0.6478.128").setup();
       WebDriver driver =new ChromeDriver();
       driver.get("https://www.shutterfly.com/");
       driver.manage().window().fullscreen();

      // System.out.println(pom.getCurrentURL(driver));
       System.out.println(pom.getTextBox().getText());
       driver.close();
    }
}
