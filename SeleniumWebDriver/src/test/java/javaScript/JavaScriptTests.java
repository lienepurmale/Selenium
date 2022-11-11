package javaScript;

import base.Tests;
import org.testng.annotations.Test;

public class JavaScriptTests extends Tests {

    @Test
    public void testScrollToTable() {
        homePage.clickLargeDeepDom().scrollToTable();
    }

    @Test

    public void testScrollToSixstParag(){
        homePage.clickOnInfiniteScroll().scrollToParagraph(6);
    }
}
