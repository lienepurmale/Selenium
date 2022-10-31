package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

        System.out.println(driver.getTitle());
        driver.quit();


    }

    public static void main(String args[]) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
