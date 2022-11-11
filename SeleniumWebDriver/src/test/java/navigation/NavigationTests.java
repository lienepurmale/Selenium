package navigation;

import base.Tests;
import org.testng.annotations.Test;

public class NavigationTests extends Tests {

    @Test
    public void testNavigator(){
        homePage.clickOnDynamicLoading().clickHiddenElementLink();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");

    }

}
