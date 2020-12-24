package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_03_FeesPage extends Parent {

    public US_03_FeesPage() {
        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath = "//span[text()='Setup'][1]")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addFormButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement formFeeName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement formCode;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='priority']/input")
    private WebElement formpriority;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    private WebElement formSave;

    @FindBy(css = "div[id='toast-container']")
    private WebElement mesaj;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement searchName;

    @FindBy(css = "button[class='mat-focus-indicator mat-raised-button mat-button-base mat-accent']")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button/button") //?
    private WebElement formEditButton;

    @FindBy(xpath = "//ms-delete-button[@class='ng-star-inserted']") //?
    private WebElement deleteButton;

    @FindBy(css = "button[type='submit']")
    private WebElement yesButton;

    @FindBy(css = "tbody>tr>td:nth-child(2)")
    private WebElement name;


    WebElement myElement;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            case "setup":
                myElement=setup;
                break;

            case "parameters":
                myElement=parameters;
                break;

            case "fees":
                myElement=fees;
                break;

            case "addFormButton":
                myElement = addFormButton;
                break;


            case "formSave":
                myElement = formSave;
                break;

            case "searchButton":
                myElement = searchButton;
                break;

            case "formEditButton":
                myElement = formEditButton;
                break;

            case "deleteButton":
                myElement = deleteButton;
                break;

            case "yesButton":
                myElement = yesButton;
                break;

        }

        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {

            case "formFeeName":
                myElement = formFeeName;
                break;


            case "formCode":
                myElement = formCode;
                break;

            case "formpriority":
                myElement = formpriority;
                break;

            case "searchName":
                myElement = searchName;
                break;
        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndFindVerifyContainsText(String elementName, String text) {


        switch (elementName) {

            case "mesaj":
                myElement = mesaj;
                break;

            case "name":
                myElement = name;
                break;
        }
        if (myElement.getText().length() > 0)
            verifyElementContainsText(myElement, text);


        verifyElementContainsText(myElement, text);



    }


}
