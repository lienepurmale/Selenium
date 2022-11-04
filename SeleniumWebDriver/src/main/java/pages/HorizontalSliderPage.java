package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {

    private WebDriver driver;
    public By slider = By.cssSelector(".sliderContainer input");
    public By index = By.id("range");


    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }


    public void setSliderValue(String value) {
        while (!getSliderValue().equals(value)) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderValue() {
        return driver.findElement(index).getText();
    }
}
