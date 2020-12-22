package pages;

import org.openqa.selenium.By;

public interface US_10_BudgetsLocators {

    String url = "https://test.basqar.techno.study/";
    String uName = "daulet2030@gmail.com";
    String pass = "TechnoStudy123@";

    By username = By.cssSelector("input[formcontrolname='username']");
    By password = By.cssSelector("input[formcontrolname='password']");
    By loginButton = By.xpath("//span[contains(text(),'LOGIN')]");
    By gotItButton = By.linkText("Got it!");
    By dashboard = By.xpath("//span[text()='Dashboard ']");
    By pageTitle = By.cssSelector("div>h3");

    By budget = By.xpath("//span[text()='Budget']");
    By budgets = By.xpath("//span[text()='Budgets']");

    By addButton = By.xpath("//ms-add-button[contains(@tooltip,'ADD')]");
    By inputDescription = By.cssSelector("input[type='text']");
    By inputYear = By.cssSelector("input[type='number']");
    By budgetGroup = By.xpath("(//mat-select[@formcontrolname='id'])[1]");
    By school = By.xpath("(//mat-select[@formcontrolname='id'])[2]");
    By budgetType = By.xpath("//mat-select[@formcontrolname='type']");
    By options = By.cssSelector("mat-option[role='option']");
    By saveButton = By.cssSelector("ms-save-button.ng-star-inserted>button");
    By closeButton = By.cssSelector("button[aria-label='Close dialog']");

    By searchBudgetGroup = By.xpath("(//mat-select[@role='combobox'])[1]");
    By searchSchool = By.xpath("(//mat-select[@role='combobox'])[2]");

    By deleteButton = By.tagName("ms-delete-button");
    By editButton = By.tagName("ms-edit-button");
    By yesButton = By.cssSelector("button[type='submit']");
    By names = By.cssSelector("tbody>tr>td:nth-child(2)");

    By message = By.cssSelector("#toast-container");

}
