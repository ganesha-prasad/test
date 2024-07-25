import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class TestPOMClass {
    @FindBy(xpath = "//div[@class='searchbar-desktop-wrapper ']//div[@class='SearchText']")
    private WebElement searchbox;


    public WebElement getTextBox() {
        return searchbox;
    }

    public String getCurrentURL(WebDriver driver) {
        return driver.getTitle();
    }
}