package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages._01_citizenshipPOM;

import java.util.List;

public class _01_citizenshipSteps {

    _01_citizenshipPOM citizenshipPOM = new _01_citizenshipPOM();
    DialogContent dialogContent = new DialogContent();

    @When("^user clicks on the element on the citizenshipPOM$")
    public void userClicksOnTheElementOnTheCitizenshipPOM(DataTable table) {
        List<String> list = table.asList(String.class);

        for (int i = 0; i < list.size(); i++) {
            citizenshipPOM.findElementAndClick(list.get(i));
        }
    }

    @And("^user enters data on page citizenshipPOM$")
    public void userEntersDataOnPageCitizenshipPOM(DataTable tables) {

        List<List<String>> lists = tables.asLists(String.class);

        for (int i = 0; i < lists.size(); i++) {
            citizenshipPOM.findElementAndSendKeys(lists.get(i).get(0),lists.get(i).get(1));
        }
    }

    @Then("^user sees the message \"([^\"]*)\"$")
    public void userSeesTheMessage(String data)  {
        dialogContent.findElementAndFindVerifyContainsText("message", data);
    }

    @When("^user edits \"([^\"]*)\"$")
    public void userEdits(String data) {
        citizenshipPOM.editItemFunction(data);
    }

    @When("^user deletes \"([^\"]*)\"$")
    public void userDeletes(String data)  {
        citizenshipPOM.deleteItemFunction(data);
    }
}
