package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class US_12_Attestations_POM extends Parent {

    WebElement myElement;
    List<WebElement> myList;

    public US_12_Attestations_POM() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//span[text()='Human Resources']")   private WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")    private WebElement setupHR;
    @FindBy(xpath = "//span[text()='Attestations']")    private WebElement attestations;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'.ADD')]//button")    private WebElement addButton;
    @FindBy(css = "ms-text-field[formcontrolname='name']>input")    private WebElement name;
    @FindBy(xpath = "//ms-save-button//button")    private WebElement saveButton;
    @FindBy(css = "div#toast-container")    private WebElement message;
    @FindAll({@FindBy(css = "div#toast-container")})    private List<WebElement> messageList;
    @FindAll({@FindBy(css = "ms-delete-button.ng-star-inserted")})    private List<WebElement> deleteButtonList;
    @FindAll({@FindBy(css = "ms-edit-button.ng-star-inserted")})    private List<WebElement> editButtonList;
    @FindAll({@FindBy(css = "tbody>tr>td:nth-child(2)")})    private List<WebElement> nameList;
    @FindBy(css = "button[type='submit']")    private WebElement yesButton;
    @FindBy(xpath = "//span[text()=' Search ']")    private WebElement search;
    @FindBy(css = "input.mat-input-element.mat-form-field-autofill-control")    private WebElement searchName;
    @FindBy(xpath = "//h3[text()='  Attestations ']")    private WebElement attestationsMessage;


    public void findElementAndClickFunction(String element) {
        switch (element) {
            case "humanResources": myElement = humanResources; break;
            case "setupHR": myElement = setupHR; break;
            case "attestations": myElement = attestations; break;
            case "addButton": myElement = addButton; break;
            case "saveButton": myElement = saveButton; break;
            case "yesButton":  myElement = yesButton; break;
            case "search": myElement = search;  break;
        }

        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String element, String value) {
        switch (element) {
            case "name": myElement = name;  break;
            case "searchName": myElement = searchName;  break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findElementAndFindVerifyContainsText(String element, String text) {
        switch (element) {
            case "success/error":  myElement = message; break;

        }
        verifyElementContainsText(myElement, text);
    }

    public void editAndDeleteFunction(String editorDelete, String elementName) {
        if (messageList.size() > 0) {
            //   if (message.isDisplayed())
            wait.until(ExpectedConditions.invisibilityOfAllElements(message));
        }

        switch (editorDelete) {
            case "edit":    myList = editButtonList;      break;
            case "delete":  myList = deleteButtonList;    break;
        }

        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(elementName)) {
                clickFunction(myList.get(i));
                break;
            }
        }
    }

    public void valueCheckList(String value) {
        Assert.assertEquals(nameList.get(0).getText(), value);
    }
}
