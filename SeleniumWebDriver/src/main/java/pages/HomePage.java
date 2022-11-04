package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public LoginPage clickFormAuthenticationLink() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public HoversPage clickHover() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }


}
