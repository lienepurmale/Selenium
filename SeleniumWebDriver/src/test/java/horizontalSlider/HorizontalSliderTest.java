package horizontalSlider;

import base.Tests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HorizontalSliderTest extends Tests {

    @Test
    public void testHorizontalSlider() {

        String value = "4";
        var horizontalPage = homePage.clickHorizontalSlider();
        horizontalPage.setSliderValue(value);
        assertEquals(horizontalPage.getSliderValue(), value);
    }
}
