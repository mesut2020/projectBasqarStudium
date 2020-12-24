package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US_07_Notifications extends Parent {


    WebElement myElement;

    public US_07_Notifications() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Got it!")    private WebElement gotItButton;
    @FindAll({@FindBy(linkText = "Got it!") })   private List<WebElement> gotItBtns;
    @FindBy (xpath = "//span[text()='Dashboard ']")  private WebElement dashboard;


    //TODO LeftNavn kismi

    @FindBy(xpath = "//span[text()='Messaging']") private WebElement messaging;
    @FindBy(xpath = "//span[text()='Notifications']") private WebElement notifications;
    @FindBy(xpath = "//span[text()='Human Resources']") private WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]") private WebElement setupHR;
    @FindBy(xpath = "//span[text()='Position Categories']") private WebElement positionCategories;


    //TODO DIalogContent kismi

    @FindBy (css = "ms-text-field[formcontrolname='name']>input")    private WebElement name;
    @FindBy (css = "mat-select[formcontrolname='type']") public WebElement type;
    @FindBy (xpath = "//ms-add-button[contains(@tooltip,'.ADD')]")    private WebElement addButton;
    @FindBy(xpath = "//ms-save-button//button")    private WebElement saveButton;
    @FindBy(xpath = "//span[text()=' Student Payment Time ']")    private WebElement studentPayment;
    @FindBy(xpath = "//button[@style='width: 40px;']")    private WebElement backNotification;
    @FindBy (css = "div#toast-container")    private WebElement message;
    @FindAll({ @FindBy (css = "tbody>tr>td:nth-child(2)") })  private List<WebElement> nameList;
    @FindAll({ @FindBy (css = "ms-delete-button.ng-star-inserted") })  private List<WebElement> deleteButtonList;
    @FindAll({ @FindBy (css = "ms-edit-button.ng-star-inserted") })  private List<WebElement> editButtonList;
    @FindBy(css = "button[type='submit']")    private WebElement yesButton;
    @FindBy(xpath = "//span[text()=' No ']") private WebElement noButton;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "gotItButton":   if (gotItBtns.size() == 0) return; myElement = gotItButton; break;
            case "addButton": myElement = addButton;break;
            case "saveButton": myElement = saveButton;break;
            case "type": myElement = type;break;
            case "studentPayment": myElement = studentPayment;break;
            case "backNotification": myElement = backNotification;break;
            case "messaging": myElement = messaging;break;
            case "notifications": myElement = notifications;break;
            case "yesButton": myElement = yesButton;break;
            case "noButton": myElement = noButton;break;
            case "positionCategories": myElement = positionCategories;break;
            case "setupHR": myElement = setupHR;break;
            case "humanResources": myElement = humanResources;break;


        }

        clickFunction(myElement);//
    }


    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {

            case "name": myElement = name; break;
        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndFindVerifyContainsText(String elementName, String mesaj) {
        switch (elementName) {
            case "dashboard": myElement = dashboard;break;
            case "success/error": myElement = message;break;
        }
        verifyElementContainsText(myElement, mesaj);
    }


    public WebElement randomSelectFromList(List<WebElement> elementsList) {
        return elementsList.get((int)(Math.random() * elementsList.size()));
    }

    public void deleteFunction(String value){

        if (message.getText().length() > 0) {
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

    public void editFunction(String value){

        if (message.getText().length() > 0) {
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


