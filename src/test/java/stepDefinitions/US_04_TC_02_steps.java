package stepDefinitions;

import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.US_04_Page;

public class US_04_TC_02_steps {
    WebDriver driver;
    US_04_Page us_04_page = new US_04_Page();

    @When("^click on the edit button that belongs to discount that we create before$")
    public void click_on_the_edit_button_that_belongs_to_discount_that_we_create_before() {
        us_04_page.findElementAndSendKeysFunction("searchDescription","New Year Discount");
        us_04_page.findElementAndClickFunction("searchButton");
        us_04_page.findElementAndClickFunction("editButton");

    }
}
