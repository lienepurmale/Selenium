package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManagement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Tests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\liene\\Desktop\\TA\\Selenium\\SeleniumWebDriver\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);
    }

    //To make sure that Tests in AlertTests page go to the homepage after each test
    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public WindowManagement getWindowManager() {
        return new WindowManagement(driver);
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("disable-infobars");
        return options;
    }

}
