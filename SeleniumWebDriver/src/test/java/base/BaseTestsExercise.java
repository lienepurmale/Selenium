package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTestsExercise {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\liene\\Desktop\\TA\\Selenium\\SeleniumWebDriver\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("shifting_content")).click();
        driver.findElement(By.linkText(("Example 1: Menu Element"))).click();

        List<WebElement> elementMenu = driver.findElements(By.tagName("li"));
        System.out.println(elementMenu.size());

        driver.quit();

    }

    public static void main(String args[]) {
        BaseTests test = new BaseTests();
        test.setUp();
    }

}
