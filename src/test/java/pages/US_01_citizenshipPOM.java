package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_01_citizenshipPOM extends Parent {

    WebElement element;

    public US_01_citizenshipPOM(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]") private WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']") private WebElement parameters;
    @FindBy(xpath = "//span[text()='Citizenships']") private WebElement citizenships;

    @FindBy(xpath = "//ms-add-button[contains(tooltip,ADD)]") private WebElement addButton;
    @FindBy(css = "ms-text-field[formcontrolname='name']>input") private WebElement name;
    @FindBy(css = "ms-text-field[formcontrolname='shortName']>input") private WebElement shortName;
    @FindBy(css = "ms-save-button.ng-star-inserted>button") private WebElement saveButton;
    @FindBy(css = "button[type='submit']") private WebElement yesButton;
    @FindBy(xpath = "//span[text()=' No ']") private WebElement noButton;

    @FindAll({    @FindBy(css = "ms-edit-button.ng-star-inserted>button")     }) private List<WebElement> editButtons;
    @FindAll({    @FindBy(css = "ms-delete-button.ng-star-inserted>button")   }) private List<WebElement> deleteButtons;

    @FindBy(css = "input.mat-input-element.mat-form-field-autofill-control") private WebElement searchName;
    @FindBy(css = "button[class='mat-focus-indicator mat-raised-button mat-button-base mat-accent']") private WebElement searchButton;
    @FindAll({ @FindBy (css = "tbody>tr>td:nth-child(2)") })  private List<WebElement> nameList;


    public void findElementAndClick(String elementName){
        switch(elementName){
            case "setup" : element = setup; break;
            case "parameters" : element = parameters; break;
            case "citizenships" : element = citizenships; break;

            case "addButton" : element = addButton; break;

            case "saveButton" : element = saveButton; break;
            case "yesButton" : element = yesButton; break;
            case "noButton" : element = noButton; break;
        }
        clickFunction(element);
    }

    public void findElementAndSendKeys(String elementName, String data){
        switch (elementName){
            case "name" : element = name; break;
            case "shortName" : element = shortName; break;
        }
        sendKeysFunction(element, data);
    }

    public void deleteItemFunction(String value){

        sendKeysFunction(searchName, value);
        clickFunction(searchButton);

        for (int i = 0; i < nameList.size(); i++) {
            if(nameList.get(i).getText().equalsIgnoreCase(value)) {
                System.out.println(nameList.get(i).getText() + " has been found...");
                clickFunction(deleteButtons.get(i));break;
            }
        }

    }

    public void editItemFunction(String value){
        sendKeysFunction(searchName, value);
        clickFunction(searchButton);

        for (int i = 0; i < nameList.size(); i++) {
            if(nameList.get(i).getText().equalsIgnoreCase(value)) {
                System.out.println(nameList.get(i).getText() + " has been found...");
                clickFunction(editButtons.get(i));break;
            }
        }
    }

    public void isItemExist(String value){
        sendKeysFunction(searchName, value);
        clickFunction(searchButton);

        for (int i = 0; i < nameList.size(); i++) {
            if(nameList.get(i).getText().equalsIgnoreCase(value)) {
                System.out.println(nameList.get(i).getText() + " has been found...");
                element=nameList.get(i);break;
            }
        }
        verifyElementContainsText(element, value);
    }

}
