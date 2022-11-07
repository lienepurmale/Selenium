package alerts;

import base.Tests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AlertTests extends Tests {

    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.clickOnAlerts();
        alertsPage.clickJSAlert();
        alertsPage.clickAcceptAlert();
        assertEquals(alertsPage.getAlertMessage(), "You successfully clicked an alert");
    }

    @Test
    public void testCancelButton() {
        var alertsPage = homePage.clickOnAlerts();
        alertsPage.clickJSConfirmButton();
        assertEquals(alertsPage.alert_getText(), "I am a JS Confirm");
        alertsPage.clickCancelButton();
        assertEquals(alertsPage.getCancelMessage(), "You clicked: Cancel");

    }

    @Test
    public void testPromptButton() {
        var alertsPage = homePage.clickOnAlerts();
        alertsPage.clickJSPromptButton();
        String text = "Test 123";
        alertsPage.alert_setInputText(text);
        alertsPage.acceptJSPromptAlert();
        assertEquals(alertsPage.getAlertMessage(), "You entered: " + text);
    }


}
