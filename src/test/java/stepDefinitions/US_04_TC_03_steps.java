package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.US_04_Page;

import java.util.List;

public class US_04_TC_03_steps {

    WebDriver driver;
    US_04_Page us_04_page = new US_04_Page();

    @Then("^click on the delete button that belongs to discount that we update before$")
    public void click_on_the_delete_button_that_belongs_to_discount_that_we_update_before()  {
        us_04_page.findElementAndSendKeysFunction("searchDescription","My Discount");
        us_04_page.findElementAndClickFunction("searchButton");
        us_04_page.findElementAndClickFunction("deleteButton");

    }

    @Then("^click on yes button$")
    public void click_on_yes_button(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i =0; i<elementsToClick.size();i++)
        {
            us_04_page.findElementAndClickFunction(elementsToClick.get(i));
        }

    }


}
