package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {

    private WebDriver driver;
    public By slider = By.className("sliderContainer");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    
}
