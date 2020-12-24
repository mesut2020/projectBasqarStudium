package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.US_09_DialogContentBudgetProject;

import java.util.List;

public class US_09_BudgetProjectsPageFunctionalitySteps {

    WebDriver driver;
    US_09_DialogContentBudgetProject dContent =new US_09_DialogContentBudgetProject();

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
