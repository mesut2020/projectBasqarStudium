package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_04_Page extends Parent{

    WebElement myElement;

    public US_04_Page() {

        PageFactory.initElements(driver, this);
    }


   @FindBy(xpath = "(//span[text()='Setup'])[1]")
   private WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement discounts;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addDiscount;

    @FindBy(xpath = "//input[@id='ms-text-field-2']")
    private WebElement description;

    @FindBy(xpath = "//input[@id='ms-text-field-3']")
    private WebElement integraitonCode;

    @FindBy(xpath = "//input[@id='ms-text-field-4']")
    private WebElement priority;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    private WebElement saveButton;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    private WebElement searchDescription;

    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement searchButton;

    @FindBy(xpath = "(//ms-edit-button[@class='ng-star-inserted'])[1]")
    private WebElement editButton;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted'])[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;














    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "setup":
                myElement=setup;
                break;
            case "parameters":
                myElement=parameters;
                break;
            case "discounts":
                myElement=discounts;
                break;
            case "addDiscount":
                myElement=addDiscount;
                break;
            case "saveButton":
                myElement=saveButton;
                break;
            case "searchButton":
                myElement=searchButton;
                break;
            case "editButton":
                myElement=editButton;
                break;
            case "deleteButton":
                myElement=deleteButton;
                break;
            case "yesButton":
                myElement=yesButton;
                break;

        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {
            case "description":
                myElement=description;
                break;
            case "integrationCode":
                myElement=integraitonCode;
                break;
            case "priority":
                myElement=priority;
                break;
            case "searchDescription":
                myElement=searchDescription;
                break;


        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndFindVerifyContainsText(String elementName, String text) {
        switch (elementName) {

        }

        verifyElementContainsText(myElement, text);
    }




}

