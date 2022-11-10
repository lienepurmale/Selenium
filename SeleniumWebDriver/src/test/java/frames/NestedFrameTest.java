package frames;

import base.Tests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NestedFrameTest extends Tests {

    @Test
    public void testTextInFrames(){
        var framePage = homePage.clickOnFrames();
        var nestedPage = framePage.clickOnNestedFrames();
        assertEquals(nestedPage.getTextLeftFrame(), "LEFT");
        assertEquals(nestedPage.getTextBottomFrame(), "BOTTOM");


    }
}
