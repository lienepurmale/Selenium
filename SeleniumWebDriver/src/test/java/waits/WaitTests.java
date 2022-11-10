package waits;

import base.Tests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class WaitTests extends Tests {

    @Test
    public void testHiddenElement() {
        var dynamicElemPage = homePage.clickOnDynamicLoading();
        var hiddenElemPage = dynamicElemPage.clickHiddenElementLink();
        hiddenElemPage.clickStartButton();
        assertEquals(hiddenElemPage.getLoadedText(), "Hello World!");

    }
}
