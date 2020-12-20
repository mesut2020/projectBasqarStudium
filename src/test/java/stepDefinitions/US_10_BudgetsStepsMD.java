package stepDefinitions;

import com.codeborne.selenide.Condition;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;

import pages.US_10_BudgetsLocators;

import java.util.List;
import static com.codeborne.selenide.Selenide.*;

public class US_10_BudgetsStepsMD implements US_10_BudgetsLocators {

    @Given("^user goes to basqar \"([^\"]*)\"$")
    public void userGoesToBasqar(String url)  {
        open(url);
    }

    @And("^user login to basqar with credentials$")
    public void userLoginToBasqarWithCredentials() {
        $(username).setValue(uName);
        $(password).setValue(pass);
        $(loginButton).click();
        if($$(gotItButton).size()>0) $(gotItButton).click();
    }

    @Then("^user should see the page title as \"([^\"]*)\"$")
    public void userShouldSeeThePageTitleAs(String text) {
        System.out.println($(pageTitle).shouldHave(Condition.text("D")));
        $(pageTitle).shouldHave(Condition.text("D"));
    }

    @When("^user goes to Budgets page$")
    public void userGoesToBudgetsPage() {
        $(budget).click();
        $(budgets).click();
    }

    @And("^user creates a Budget$")
    public void userCreatesABudget() {
        $(addButton).shouldBe(Condition.enabled).click();
        $(inputDescription).setValue("2020 School budget");
        $(inputYear).setValue("2020");
        $(budgetGroup).click();
        $$(options).get(2).click();
        $(school).click();
        $$(options).get(1).click();
        $(budgetType).click();
        $$(options).get(2).click();
        $(saveButton).click();
    }

    @Then("^user should see the message \"([^\"]*)\" on the screen$")
    public void userShouldSeeTheMessageOnTheScreen(String text)  {
        $(message).shouldBe(Condition.text(text));
    }

    @And("^user types a description$")
    public void userTypesADescription() {
        $(addButton).shouldBe(Condition.enabled).click();
        $(inputDescription).setValue("2021 School budget");
    }

    @But("^save button should not be clickable$")
    public void saveButtonShouldNotBeClickable() {
        System.out.println("Is saveButton disabled? : " + $(saveButton).getAttribute("disabled"));
        $(saveButton).shouldNotBe(Condition.enabled);
    }

    @And("^user delete existing BUdget$")
    public void userDeleteExistingBUdget() {
        $(searchBudgetGroup).click();
        $$(options).get(3).click();
        $(searchSchool).click();
        $$(options).get(2).click();
        $(deleteButton).shouldBe(Condition.appear).click();
        $(yesButton).click();
    }

    @When("^user clicks following element\\(s\\)$")
    public void userClicksFollowingElementS(DataTable dataTable) {
        List<Enum> dataByList = dataTable.asList(Enum.class);
        for (int i = 0; i < dataByList.size(); i++) {

        }
    }
}
