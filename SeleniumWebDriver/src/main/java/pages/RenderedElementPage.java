package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RenderedElementPage {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By text = By.id("finish");

    public RenderedElementPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartButton() {
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.presenceOfElementLocated(text));
    }

    public String getLoadingText() {
        return driver.findElement(text).getText();
    }

    public boolean isStartButtonDisplayed() {
        return driver.findElement(startButton).isDisplayed();
    }


}
