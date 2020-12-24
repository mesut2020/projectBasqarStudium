package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.US_10_BudgetPage;

import java.util.List;

public class US_10_BudgetStepDefinition {

    US_10_BudgetPage us_10_budgetPage=new US_10_BudgetPage();

    @When("^user click on the element in the Budget Page$")
    public void userClickOnTheElementInTheBudgetPage(DataTable dataTable) {
        List<String> dataList= dataTable.asList(String.class);
        for (int i = 0; i < dataList.size(); i++) {
            us_10_budgetPage.findElementAndClickFunction(dataList.get(i));
        }

    }


    @When("^user send the keys on the element in the Budget Page$")
    public void userSendTheKeysOnTheElementInTheBudgetPage(DataTable dataTable) {

        List<List<String>> dataList=dataTable.asLists(String.class);
        for (int i = 0; i < dataList.size(); i++) {
            us_10_budgetPage.findElementAndSendKeysFunction(dataList.get(i).get(0),dataList.get(i).get(1));

        }
    }


    @Then("^Page title   should be \"([^\"]*)\"$")
    public void pageTitleShouldBe(String text) {
        us_10_budgetPage.findElementAndFindVerifyContainsText("pageTitle",text);
    }


    @Then("^Save button should not be clickable$")
    public void saveButtonShouldNotBeClickable() {
        us_10_budgetPage.isClickable();
    }




    @Then("^\"([^\"]*)\" message should be displayed$")
    public void messageShouldBeDisplayed(String text) {
        us_10_budgetPage.findElementAndFindVerifyContainsText("mesaj",text);

    }



    @And("^user select \"([^\"]*)\"$")
    public void userSelect(String option)  {
        us_10_budgetPage.select(option);
    }



    @And("^user delete Budget$")
    public void userDeleteBudget() {
        us_10_budgetPage.deleteName("2021 Butcesi");
    }
}
