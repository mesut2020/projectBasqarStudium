package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.US_01_citizenshipPOM;

import java.util.List;

public class US_01_citizenshipSteps {

    US_01_citizenshipPOM citizenshipPOM = new US_01_citizenshipPOM();
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


    @When("^user edits \"([^\"]*)\"$")
    public void userEdits(String data) {
        citizenshipPOM.editItemFunction(data);
    }

    @When("^user deletes \"([^\"]*)\"$")
    public void userDeletes(String data)  {
        citizenshipPOM.deleteItemFunction(data);
    }

    @Then("^user should see the message \"([^\"]*)\"$")
    public void userShouldSeeTheMessage(String data) {
        dialogContent.findElementAndFindVerifyContainsText("message", data);
    }

    @Then("^\"([^\"]*)\" shouldn't be deleted$")
    public void shouldnTBeDeleted(String data) {
        citizenshipPOM.isItemExist(data);
    }

    @Then("^\"([^\"]*)\" should be not clickable$")
    public void shouldBeNotClickable(String data)  {
        citizenshipPOM.isClickable(data);
    }

}
