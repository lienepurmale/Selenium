package contextMenu;

import base.Tests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ContextMenuTest extends Tests {

    @Test
    public void testRightClickInBox() {
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickInsideTheBox();
        String text = contextMenuPage.getAlertMessage();
        contextMenuPage.clickOkAlert();
        assertEquals(text, "You selected a context menu");


    }
}
