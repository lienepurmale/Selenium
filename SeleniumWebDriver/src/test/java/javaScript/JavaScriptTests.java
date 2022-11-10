package javaScript;

import base.Tests;
import org.testng.annotations.Test;

public class JavaScriptTests extends Tests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeDeepDom().scrollToTable();
    }
}
