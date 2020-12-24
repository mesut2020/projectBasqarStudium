package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.US_12_Attestations_POM;

import java.util.List;

public class US_12_AttestationsSteps {

    US_12_Attestations_POM pom = new US_12_Attestations_POM();

    @When("^User click on the element Attestations$")
    public void userClickOnTheElementAttestations(DataTable elements) {
        List<String> elementList=elements.asList(String.class);

        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i));
           pom.findElementAndClickFunction(elementList.get(i));
        }
    }

    @Then("^User should see \"([^\"]*)\" Page$")
    public void userShouldSeePage(String message)  {
        pom.findElementAndFindVerifyContainsText("attestationsMessage", message);
    }

    @And("^User sending the keys Attestations$")
    public void userSendingTheKeysAttestations(DataTable elements) {

        List<List<String>> elementsNameAndValue=elements.asLists(String.class);

        for(int i=0;i<elementsNameAndValue.size();i++) {
            pom.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));
        }
    }

    @Then("^User should see \"([^\"]*)\" message Attestations$")
    public void userShouldSeeMessageAttestations(String message)  {
        pom.findElementAndFindVerifyContainsText("success/error", message);
    }

    @Then("^User should see search List \"([^\"]*)\" Attestations$")
    public void userShouldSeeSearchListAttestations(String value)  {

        pom.valueCheckList(value);

    }

    @Then("^User \"([^\"]*)\" \"([^\"]*)\" Attestations$")
    public void userAttestations(String editorDelete, String value)  {
        pom.editAndDeleteFunction(editorDelete,value);
    }
}
