package frames;

import base.Tests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EditorTest extends Tests {

    @Test
    public void testFrame(){
        var framePage = homePage.clickOnEditor();
        framePage.clearTextArea();

        String text1 = "Hello";
        String text2 = "world!";

        framePage.sentTextArea(text1);
        framePage.clickIncreaseIndentButton();
        framePage.sentTextArea(text2);
        assertEquals(framePage.readText(), text1 + text2);

    }

}

