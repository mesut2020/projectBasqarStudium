package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.US_02_nationalitiesPOM;

import java.util.List;

public class US_02_nationalitiesSteps {

    US_02_nationalitiesPOM nationalitiesPOM = new US_02_nationalitiesPOM();


    @And("^User click on the element in the nationalitiesPOM class$")
    public void userClickOnTheElementInTheNationalitiesPOMClass(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            nationalitiesPOM.findElementAndClickFunction(elementsToClick.get(i));

        }

    }

    @And("^User sending the keys in the nationalitiesPOM class$")
    public void userSendingTheKeysInTheNationalitiesPOMClass(DataTable elements) {
        List<String> list = elements.asList(String.class);

        for (int i = 0; i <list.size()/2 ; i++) {
            nationalitiesPOM.findElementAndSendKeysFunction(list.get(0),list.get(1));
        }

    }


    @Then("^User edit \"([^\"]*)\"$")
    public void userEdit(String value)  {
        nationalitiesPOM.editFunction(value);
    }

    @When("^User delete \"([^\"]*)\"$")
    public void userDelete(String value) {
        nationalitiesPOM.deleteFunction(value);
        nationalitiesPOM.findElementAndClickFunction("yesButton");

    }

    @Then("^User should  \"([^\"]*)\" message$")
    public void userShouldMessage(String message)  {
        nationalitiesPOM.findElementAndFindVerifyContainsText("success/error", message);
    }
}
