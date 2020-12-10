package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class US_08_InventoryPages extends Parent{
    WebElement myElement;

    public US_08_InventoryPages () {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Inventory']")
    private WebElement Inventory;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setup4;

    @FindBy(xpath = "//span[text()='Item Categories']")
    private WebElement ItemCategories ;


    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;

    @FindAll({

            @FindBy(xpath = "//ms-delete-button/button")
    })
    public List<WebElement> deleteButtonList;

    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    public List<WebElement> editButtonList;

    @FindBy(xpath = "(//span[@class='Item Categories']")
    private WebElement ItemCategory;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;



    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(css  = "div.mat-chip-list-wrapper")
    private WebElement userType;

    @FindBy(xpath = "(//mat-option[@role='option'])[1]")
    private WebElement option1;

    @FindBy(xpath = "(//mat-option[@role='option'])[2]")
    private WebElement option2;


    @FindBy(css = "button[type='submit']") private WebElement yesButton;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    public List<WebElement> nameList;



    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "Inventory":
                myElement = Inventory;
                break;

            case "setup4":
                myElement = setup4;
                break;

            case "itemCategories":
                myElement = ItemCategories;
                break;

            case "addButton":
                myElement = addButton;
                break;

            case "userType":
                myElement = userType;
                break;

            case "option1":
                myElement = option1;
                break;

                case "option2":
                myElement = option2;
                break;


            case "saveButton":
                myElement = saveButton;
                break;

            case "ItemCategory":
                myElement =ItemCategory;
                break;

          case "yesButton":
                myElement =yesButton;
                break;


        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {

            case "ItemCategory":
                myElement = ItemCategory;
                break;

            case "nameInput":
                myElement = nameInput;
                break;




        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;

        }

        verifyElementContainsText(myElement, msg);
    }

    public void editAndDeleteFunction(String Name, String editOrDelete) {

        // invisible olma beklemesini, display ise şartına bağladık, yani
        // gözüküyorsa kaybolana kadar bekle.

        if (msjContainers.size() > 0) {
            if (msjContainer.isDisplayed())
                wait.until(ExpectedConditions.invisibilityOfAllElements(msjContainer));
        }


        List<WebElement> btnList = new ArrayList<>();

        if (editOrDelete.equalsIgnoreCase("delete"))
            btnList = waitVisibleListAllElement(deleteButtonList);
        else
            btnList = waitVisibleListAllElement(editButtonList);


        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).getText().equalsIgnoreCase(Name)) {
                clickFunction(btnList.get(i));
            }
        }
            }


    public void findElementAndFindVerifyContainsText(String dashboard, String dashboard1) {
    }
}
