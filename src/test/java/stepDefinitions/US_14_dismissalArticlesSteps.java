package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.US_14_dismissalArticlesPOM;

import java.util.List;

public class US_14_dismissalArticlesSteps {
    US_14_dismissalArticlesPOM dismissalArticlesPOM = new US_14_dismissalArticlesPOM();


    @And("^User click on the element in the dismissalArticlesPOM class$")
    public void userClickOnTheElementInTheDismissalArticlesPOMClass(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);
        for (int i = 0; i <elementsToClick.size() ; i++) {
            System.out.println(elementsToClick.get(i));
            dismissalArticlesPOM.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @And("^User sending the keys in the dismissalArticlesPOM class$")
    public void userSendingTheKeysInTheDismissalArticlesPOMClass(DataTable elements) {

        List<String> list = elements.asList(String.class);

        for (int i = 0; i <list.size()/2 ; i++) {
            dismissalArticlesPOM.findElementAndSendKeysFunction(list.get(0),list.get(1));
        }

    }

    @Then("^User should give a \"([^\"]*)\" message$")
    public void userShouldGiveAMessage(String message) {
        dismissalArticlesPOM.findElementAndFindVerifyContainsText("success/error",message);
    }

    @Then("^User edit in \"([^\"]*)\"$")
    public void userEditIn(String value)  {
      dismissalArticlesPOM.editFunction(value);
    }

    @When("^User delete \"([^\"]*)\"$")
    public void userDelete(String value)  {
        dismissalArticlesPOM.deleteFunction(value);
        dismissalArticlesPOM.findElementAndClickFunction("yesButton");
    }
}
