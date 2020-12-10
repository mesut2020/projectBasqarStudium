package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US_02_nationalitiesPOM extends Parent {

    WebElement myElement;
    List<WebElement> myList;

    public US_02_nationalitiesPOM() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;
    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//ms-add-button[contains(tooltip,ADD)]")
   // @FindBy(css = "//ms-add-button[contains(@tooltip,'TITLE')]//button")
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement name;
    @FindBy(xpath = "//span[contains(text(),'Save')]")
    private WebElement saveButton;
    @FindBy(css = "div#toast-container")
    private WebElement message;
    @FindBy(css = "//ms-edit-button")
    private WebElement editButton;
    @FindBy(css = "ms-delete-button.ng-star-inserted")
    private WebElement deleteButton;
    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeButton;
    @FindBy (xpath = "//span[text()=' Search ']")
    private WebElement search;
    @FindBy(css = "input.mat-input-element.mat-form-field-autofill-control")
    private WebElement searchName;


    @FindAll({@FindBy(css = "ms-delete-button.ng-star-inserted>button")})
    private List<WebElement> deleteButtonList;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;
    @FindAll({@FindBy(css = "ms-edit-button.ng-star-inserted>button")})
    private List<WebElement> editButtonList;
    @FindAll({@FindBy(css = "tbody>tr>td:nth-child(2)")})
    private List<WebElement> nameList;
    @FindAll({@FindBy(css = "div#toast-container")})
    private List<WebElement> messageList;




    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            case "setup": myElement = setup;
            break;
            case "parameters": myElement = parameters;
            break;
            case "nationalities": myElement = nationalities;
            break;

            case "addButton": myElement = addButton;
            break;
            case "saveButton": myElement = saveButton;
            break;
            case "deleteButton": myElement = deleteButton;
            break;
            case "editButton": myElement = editButton;
            break;
            case "yesButton": myElement = yesButton;
            break;
            case "closeButton": myElement = closeButton;

            break; case "search": myElement = search;
            break;

        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {
        switch (elementName) {

            case "name": myElement = name;
                break;
            case "searchName": myElement = searchName;
                break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findElementAndFindVerifyContainsText(String elementName, String mesaj) {
        switch (elementName) {
            case "success/error":
                myElement = message;
                break;
        }
        verifyElementContainsText(myElement, mesaj);
    }

    public void deleteFunction(String value) {

        if (messageList.size() > 0) {
//            if (message.isDisplayed())
            wait.until(ExpectedConditions.invisibilityOfAllElements(message));
        }

        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(value)) {
                clickFunction(deleteButtonList.get(i));
                break;
            }
        }
    }

    public void editFunction(String value) {

        if (messageList.size() > 0) {
//            if (message.isDisplayed())
            wait.until(ExpectedConditions.invisibilityOfAllElements(message));
        }

        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(value)) {
                clickFunction(editButtonList.get(i));
                break;
            }
        }
    }


}








