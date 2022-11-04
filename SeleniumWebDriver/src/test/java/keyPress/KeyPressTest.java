package keyPress;

import base.Tests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class KeyPressTest extends Tests {

    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("ABC" + Keys.BACK_SPACE);
        assertEquals(keyPage.getTextResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();

    }

}
