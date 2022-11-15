package navigation;

import base.Tests;
import org.testng.annotations.Test;

public class NavigationTests extends Tests {

    @Test
    public void testNavigator() {
        homePage.clickOnDynamicLoading().clickHiddenElementLink();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");

    }

    @Test
    public void testSwitchTab() {
        homePage.clickOnMultipleWindows().clickHere();
        getWindowManager().switchTab("New Window");
    }

    @Test //To finish this test
    public void testRightClick() {
        var dynamicPage = homePage.clickOnDynamicLoading();
        dynamicPage.clickOnRenderedElementLink();
        dynamicPage.rightClick();

    }

}
