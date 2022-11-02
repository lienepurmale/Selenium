package dropdown;


import base.Tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class DropdownTest extends Tests {

    @Test
    public void testSelectOption() {
        var dropdownPage = homePage.clickDropDown();
        String option = "Option 1";

        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1, "Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option), "Option not selected");

    }

}
