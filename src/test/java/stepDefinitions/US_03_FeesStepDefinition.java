package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.US_03_FeesPage;

import java.util.List;

public class US_03_FeesStepDefinition {

    US_03_FeesPage us_03_feesPage=new US_03_FeesPage();

    @When("^user click on the element in the FeesPage$")
    public void userClickOnTheElementInTheFeesPage(DataTable dataTable) {
        List<String> dataList= dataTable.asList(String.class);
        for (int i = 0; i < dataList.size(); i++) {
          us_03_feesPage.findElementAndClickFunction(dataList.get(i));
        }

    }


    @When("^user send the keys on the element in the FeesPage$")
    public void userSendTheKeysOnTheElementInTheFeesPage(DataTable dataTable) {
       List<List<String>> dataList=dataTable.asLists(String.class);
        for (int i = 0; i < dataList.size(); i++) {
            us_03_feesPage.findElementAndSendKeysFunction(dataList.get(i).get(0),dataList.get(i).get(1));

        }

    }

    @Then("^\"([^\"]*)\" message should be displayed$")
    public void messageShouldBeDisplayed(String text) {
        us_03_feesPage.findElementAndFindVerifyContainsText("mesaj",text);

    }


}
