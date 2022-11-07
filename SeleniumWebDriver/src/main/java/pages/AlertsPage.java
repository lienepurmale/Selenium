package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AlertsPage {

    private WebDriver driver;

    public By JSAlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    public By alertConfirmationText = By.id("result");
    public By JSConfirmButton = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    public By JSPromptButton = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickJSAlert() {
        driver.findElement(JSAlertButton).click();
    }

    public void clickAcceptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getAlertMessage() {
        return driver.findElement(alertConfirmationText).getText();
    }

    public void clickJSConfirmButton() {
        driver.findElement(JSConfirmButton).click();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void clickCancelButton() {
        driver.switchTo().alert().dismiss();
    }

    public String getCancelMessage(){
        return driver.findElement(alertConfirmationText).getText();
    }

    public void clickJSPromptButton(){
        driver.findElement(JSPromptButton).click();
    }

    public void alert_setInputText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public void acceptJSPromptAlert(){
        driver.switchTo().alert().accept();
    }


}
