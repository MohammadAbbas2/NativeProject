package dropdownmenu;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DropDownTest extends BaseTests {

    @Test
    public void testSelectOption (){
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.selectOption("Option 2");
        List<String> selectedOptions = dropDownPage.getSelectedOptions();
        Assertions.assertTrue(selectedOptions.contains("Option 2"),"Wrong Selected");

    }
}
