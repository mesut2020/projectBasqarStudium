package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US_05_POM extends Parent{

    WebElement myElement ;
    List<WebElement> myList ;

    public US_05_POM() {
        PageFactory.initElements(driver,this);

    }

    @FindBy (xpath = "//span[text()='Setup']")  private WebElement setup;
    @FindBy (xpath = "//span[text()='Parameters']")  private WebElement parameters;
    @FindBy (xpath = "//span[text()='Grade Levels']")  private WebElement gradeLevels;
    @FindBy (xpath = "//ms-add-button[contains(@tooltip,'.ADD')]//button")  private WebElement addButton;
    @FindBy (css = "ms-text-field[formcontrolname='name']>input")  private WebElement name;
    @FindBy (css = "ms-text-field[formcontrolname='shortName']>input")  private WebElement shortName;
    @FindBy (css = "ms-text-field[formcontrolname='order']>input")  private WebElement order;
    @FindBy (xpath = "//ms-save-button//button")  private WebElement saveButton;
    @FindBy (css = "div#toast-container")    private WebElement message;
    @FindAll({@FindBy (css = "div#toast-container")})  private List<WebElement> messageList;
    @FindAll({ @FindBy (css = "ms-delete-button.ng-star-inserted") })  private List<WebElement> deleteButtonList;
    @FindAll({ @FindBy (css = "ms-edit-button.ng-star-inserted") })  private List<WebElement> editButtonList;
    @FindAll({ @FindBy (css = "tbody>tr>td:nth-child(2)") })  private List<WebElement> nameList;
    @FindBy(css = "button[type='submit']")    private WebElement yesButton;


    public void findElementAndClickFunction(String element){
        switch (element){
            case "setup" : myElement = setup; break;
            case "parameters" : myElement = parameters; break;
            case "gradeLevels" : myElement = gradeLevels; break;
            case "addButton" : myElement = addButton; break;
            case "saveButton" : myElement = saveButton; break;
            case "yesButton" : myElement = yesButton; break;

        }

        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String element, String value){
        switch (element){
            case "name" : myElement = name; break;
            case "shortName" : myElement = shortName; break;
            case "order" : myElement = order; break;

        }

        sendKeysFunction(myElement,value);
    }

    public void findElementAndFindVerifyContainsText(String element,String text){
        switch (element) {
            case "success/error": myElement = message;break;

        }
        verifyElementContainsText(myElement, text);
    }

    public void editAndDeleteFunction(String editorDelete,String  elementName) {
        if (messageList.size() > 0) {
            //   if (message.isDisplayed())
            wait.until(ExpectedConditions.invisibilityOfAllElements(message));
        }

        switch (editorDelete) {
            case "edit":
                myList = editButtonList;
                break;

            case "delete":
                myList = deleteButtonList;
        }


        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(elementName)) {
                clickFunction(myList.get(i));
                break;
            }
        }
    }
}
