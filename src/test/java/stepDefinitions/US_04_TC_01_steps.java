package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.DialogContent;
import pages.US_04_Page;
import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class US_04_TC_01_steps {
    WebDriver driver;
    US_04_Page us_04_page = new US_04_Page();

    @Given("^Navigate to https://test\\.basqar\\.techno\\.study/$")
    public void navigate_to_https_test_basqar_techno_study()  {
        driver= Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    @Given("^click on Setup$")
    public void click_on_Setup(DataTable elements)  {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i =0; i<elementsToClick.size();i++)
        {
            us_04_page.findElementAndClickFunction(elementsToClick.get(i));
        }

    }

    @Given("^click on  Parameters$")
    public void click_on_Parameters(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i =0; i<elementsToClick.size();i++)
        {
            us_04_page.findElementAndClickFunction(elementsToClick.get(i));
        }

    }

    @Given("^click  on Discounts$")
    public void click_on_Discounts(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i =0; i<elementsToClick.size();i++)
        {
            us_04_page.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^click on Add Discount$")
    public void click_on_Add_Discount(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i =0; i<elementsToClick.size();i++)
        {
            us_04_page.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @Then("^type description on Description Box$")
    public void type_description_on_Description_Box(DataTable elements) {
        List<List<String>> elementsNameAndValue=elements.asLists(String.class);

        for(int i=0;i<elementsNameAndValue.size();i++) {
//
            us_04_page.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));
        }

    }

    @Then("^type numbers on Integraiton Code Box$")
    public void type_numbers_on_Integraiton_Code_Box(DataTable elements)  {
        List<List<String>> elementsNameAndValue=elements.asLists(String.class);

        for(int i=0;i<elementsNameAndValue.size();i++) {

            us_04_page.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));
        }

    }

    @Then("^type number on Priority Box$")
    public void type_number_on_Priority_Box(DataTable elements)  {
        List<List<String>> elementsNameAndValue=elements.asLists(String.class);

        for(int i=0;i<elementsNameAndValue.size();i++) {
            us_04_page.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));
        }
    }

    @Then("^click on Save button$")
    public void click_on_Save_button(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i =0; i<elementsToClick.size();i++)
        {
            us_04_page.findElementAndClickFunction(elementsToClick.get(i));
        }

    }

}
