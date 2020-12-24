package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US_14_dismissalArticlesPOM extends Parent {

    WebElement myElement;
    List<WebElement> myList;

    public US_14_dismissalArticlesPOM() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupHR;
    @FindBy(xpath = "//span[contains(text(),'Human Resources')]")
    private WebElement hummanResources;
    @FindBy(xpath = "//span[contains(text(),'Dismissal Articles')]")
    private WebElement dismissalArticles;

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
    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement search;
    @FindBy(css = "input.mat-input-element.mat-form-field-autofill-control")
    private WebElement searchName;
   // @FindBy(css = "ms-text-field[formcontrolname ='description']")
    @FindBy(xpath = "(//input[contains(@id,'ms-text-field')])[3]")
   // @FindBy (css = "input[data-placeholder='Description']")
    private WebElement description;


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

            case "setupHR":
                myElement = setupHR;
                break;
            case "hummanResources":
                myElement = hummanResources;
                break;
            case "dismissalArticles":
                myElement = dismissalArticles;
                break;

            case "addButton":
                myElement = addButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "editButton":
                myElement = editButton;
                break;
            case "yesButton":
                myElement = yesButton;
                break;
            case "closeButton":
                myElement = closeButton;

                break;
            case "search":
                myElement = search;
                break;

        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {
        switch (elementName) {

            case "name":
                myElement = name;
                break;
            case "searchName":
                myElement = searchName;
                break;
            case "description":
                myElement = description;
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

//        if (messageList.size() > 0) {
//            // if (message.isDisplayed())
//           // wait.until(ExpectedConditions.invisibilityOfAllElements(message));
//
//        }

        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(value)) {
                clickFunction(deleteButtonList.get(i));
                break;
            }
        }
    }

    public void editFunction(String value) {

       // if (messageList.size() > 0) {
            // if (message.isDisplayed())
            //wait.until(ExpectedConditions.invisibilityOfAllElements(message));

      // }
            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("tbody>tr>td:nth-child(2)"),0));
        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(value)) {
                System.out.println(nameList.get(i)+ "  is found");
                clickFunction(editButtonList.get(i));
                break;
            }
        }
    }


}


