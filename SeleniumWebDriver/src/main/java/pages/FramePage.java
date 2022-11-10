package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {

    private WebDriver driver;
    private By nestedLink = By.linkText("Nested Frames");

    public FramePage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramePage clickOnNestedFrames(){
        driver.findElement(nestedLink).click();
        return new NestedFramePage(driver);
    }
}
