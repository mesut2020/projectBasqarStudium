package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public class US_10_BudgetPage extends Parent {

    public US_10_BudgetPage() {
        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement budget;

    @FindBy(xpath = "//span[text()='Budgets']")
    private WebElement budgets;

    @FindBy(xpath = "//div/h3")
    private WebElement pageTitle;


    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]")
    private WebElement addFormButton;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.DESCRIPTION']/input")//bulunmazsa sonuna  ekle
    private WebElement formdescription;


    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.YEAR']/input")//bulunmazsa sonuna /input ekle
    private WebElement formYear;


    @FindBy(xpath = "(//mat-select[@formcontrolname='id'])[1]")
    private WebElement formBudgetGroup;

    @FindBy(xpath = "(//mat-select[@formcontrolname='id'])[2]")
    private WebElement formSchool;

    @FindBy(xpath = "//mat-select[@formcontrolname='type']")
    private WebElement formBudgetType;



    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']/button")
    private WebElement formSave;


    @FindBy(xpath = "//mat-select[@role='combobox']")
    private WebElement budgetGroup;


    @FindAll({
            @FindBy(css = "mat-option[role='option']")
    })
    private List<WebElement> optionsList;


    @FindAll({
            @FindBy(css = "tbody>tr>td:nth-child(2)")
    })
    private List<WebElement> nameList;


    @FindAll({
    @FindBy(xpath = "//ms-delete-button[@class='ng-star-inserted']")
    })
    private List<WebElement> deleteButtonList;



    @FindBy(css = "button[type='submit']")
    private WebElement yesButton;

    @FindBy(css = "div[id='toast-container']")
    private WebElement mesaj;



    WebElement myElement;



    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            case "budget":
                myElement=budget;
                break;

            case "budgets":
                myElement=budgets;
                break;


            case "addFormButton":
                myElement = addFormButton;
                break;


            case "formSave":
                myElement = formSave;
                break;



            case "yesButton":
                myElement = yesButton;
                break;

            case "budgetGroup":
                myElement = budgetGroup;
                break;

            case "formBudgetGroup":
                myElement = formBudgetGroup;
                break;

            case "formSchool":
                myElement = formSchool;
                break;

            case "formBudgetType":
                myElement = formBudgetType;
                break;

        }

        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {

            case "formdescription":
                myElement = formdescription;
                break;


            case "formYear":
                myElement = formYear;
                break;




        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndFindVerifyContainsText(String elementName, String text) {

        switch (elementName) {

            case "mesaj":
                myElement = mesaj;
                break;

            case "pageTitle":
                myElement = pageTitle;
                break;
        }
        if (myElement.getText().length() > 0) {
            verifyElementContainsText(myElement, text);
        }
    }




    public void select(String option) {
        for (WebElement element : optionsList) {
            if (element.getText().equalsIgnoreCase(option)) {
                clickFunction(element);
                break;
            }
        }
    }




   public void deleteName(String name){

       for (int i = 0; i <nameList.size() ; i++) {
           if(nameList.get(i).getText().equalsIgnoreCase(name)){
               deleteButtonList.get(i).click();
               break;
           }
       }
   }


public void isClickable(){

    Assert.assertFalse(formSave.isEnabled());
}


}
