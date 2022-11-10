package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By hiddenElementLink = By.linkText("Example 1: Element on page that is hidden");
    private By renderedElementLink = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public HiddenElementPage clickHiddenElementLink(){
        driver.findElement(hiddenElementLink).click();
        return new HiddenElementPage(driver);
    }
}