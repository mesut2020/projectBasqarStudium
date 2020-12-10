package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.US_05_POM;

import java.util.List;

public class US_05_Steps {
    US_05_POM pom = new US_05_POM();

    @When("^User click on the element$")
    public void userClickOnTheElement(DataTable elements) {
        List<String> elementList=elements.asList(String.class);

        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i));
            pom.findElementAndClickFunction(elementList.get(i));
        }

    }

    @And("^User sending the keys$")
    public void userSendingTheKeys(DataTable elements) {

        List<List<String>> elementsNameAndValue=elements.asLists(String.class);

        for(int i=0;i<elementsNameAndValue.size();i++) {
            pom.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));
        }

    }

    @Then("^User should see \"([^\"]*)\" message$")
    public void userShouldSeeMessage(String message)  {
        pom.findElementAndFindVerifyContainsText("success/error", message);
    }

    @Then("^User \"([^\"]*)\" \"([^\"]*)\"$")
    public void user(String editorDelete, String value)  {
        pom.editAndDeleteFunction(editorDelete,value);
    }
}
