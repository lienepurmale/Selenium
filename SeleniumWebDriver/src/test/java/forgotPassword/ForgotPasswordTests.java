package forgotPassword;

import base.Tests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.AssertJUnit.assertEquals;


public class ForgotPasswordTests extends Tests {

    @Test
    public void testForgotPassword() {
        var forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.enterEmail("test123@example.com");
        var emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertEquals(emailSentPage.confirmMessage(), "Your e-mail's been sent!", "Message is incorrect");


    }
}
