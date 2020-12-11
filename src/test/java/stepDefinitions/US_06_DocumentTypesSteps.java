package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import pages.DialogContent;
import pages.Parent;
import pages.US_06_DocumentTypesPOM;

import java.util.List;


public class US_06_DocumentTypesSteps extends Parent {

    // WebDriver driver;


    US_06_DocumentTypesPOM document_Types = new US_06_DocumentTypesPOM();


    @When("^User click on the elements in Document Types Page$")
    public void UserClickOnTheElementsInDocumentTypesPage(DataTable elements) {
        List<String> elementList = elements.asList(String.class);

        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i));
            document_Types.findElementAndClickFunction(elementList.get(i));
        }

    }

    @And("^Userr sending the keys$")
    public void userrSendingTheKeys(DataTable elements) {

        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            document_Types.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @Then("^Userr should see \"([^\"]*)\" message$")
    public void userrShouldSeeMessage(String message) {
        document_Types.findElementAndFindVerifyContainsText("success/error", message);
    }

    @Then("^Userr \"([^\"]*)\" \"([^\"]*)\"$")
    public void user(String editorDelete, String value) {
        document_Types.editAndDeleteFunction(editorDelete, value);
    }


}