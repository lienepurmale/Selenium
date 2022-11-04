package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputLine= By.id("target");
    private By enteredText = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver =driver;
    }

    public void enterText(String text){
        driver.findElement(inputLine).sendKeys(text);
    }

    public String getTextResult(){
        return driver.findElement(enteredText).getText();
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.ALT, "p") + "=3.14");
    }
}
