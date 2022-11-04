package hovering;

import base.Tests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class HoveringTest extends Tests {

    @Test
    public void testHoveringUser1() {
        var hoversPage = homePage.clickHover();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption noy displayed");
        assertEquals(caption.getTitle(), "name: user1", "caption title incorrect" );
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect ");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link is incorrect");



    }
}
