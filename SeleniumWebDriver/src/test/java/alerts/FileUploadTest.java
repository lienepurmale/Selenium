package alerts;

import base.Tests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FileUploadTest extends Tests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickonFileUpload();
        uploadPage.clickUploadFile("C:\\Users\\liene\\Desktop\\TA\\Selenium\\SeleniumWebDriver\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe");

    }

}
