package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.DialogContentBudgetProject;
import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _09_BudgetProjectsPageFunctionalitySteps {

    WebDriver driver;
    DialogContentBudgetProject dContent =new DialogContentBudgetProject();

    @When("^User click on the element at Budget Project$")
    public void userClickOnTheElementAtBudgetProject(DataTable elements) {

        List<String> elementsToClick=elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            dContent.findElementAndClickFunction(elementsToClick.get(i));

        }
    }

    @Then("^Send value to element's inputbox$")
    public void sendValueToElementSInputbox(DataTable elements) {

        List<List<String>> elementsNameAndValue=elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            dContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }

    }


    @Then("^User should see Budget Projects page correctly$")
    public void userShouldSeeBudgetProjectsPageCorrectly() {

        String myText="Budget Projects";
        String title=dContent.titleBudgetProjects.getText();
        System.out.println("Görünmesi gereken string: " + myText);
        System.out.println("Görünen string: " + title);

        Assert.assertEquals(myText,title);
    }

    @Then("^User should see \"([^\"]*)\" message at Budget Project$")
    public void userShouldSeeMessageAtBudgetProject(String alert) {

        dContent.findElementAndFindVerifyContainsText(alert, "success");
    }

    @And("^User delete element name of \"([^\"]*)\"$")
    public void userDeleteElementNameOf(String value) {
        dContent.deleteFunction(value);
    }

    @Then("^check the button as name of \"([^\"]*)\", should be inactive$")
    public void checkTheButtonAsNameOfShouldBeInactive(String elementname) {

        dContent.checkElementActive(elementname);
    }


}
