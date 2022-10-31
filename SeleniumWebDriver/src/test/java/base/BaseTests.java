package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\liene\\Desktop\\TA\\Selenium\\SeleniumWebDriver\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //to increase the windows size
        driver.manage().window().maximize();

        //to set size to for example the mobile device
        // driver.manage().window().setSize(new Dimension(390, 844));

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();
        driver.quit();


    }

    public static void main(String args[]) {
        BaseTests test = new BaseTests();
        test.setUp();
    }


}
