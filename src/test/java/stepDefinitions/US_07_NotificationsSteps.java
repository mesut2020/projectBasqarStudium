package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.US_07_Notifications;
import utilities.Driver;

import java.util.List;

public class US_07_NotificationsSteps {

    US_07_Notifications us_07_notifications=new US_07_Notifications();
    WebDriver driver= Driver.getDriver();

    @Then("^User should see \"([^\"]*)\" message$")
    public void userShouldSeeMessage(String message){

        us_07_notifications.findElementAndFindVerifyContainsText("success/error", message);

    }

    @When("^User click on the element in the USNotifications class$")
    public void userClickOnTheElementInTheUSNotificationsClass(DataTable elements) {
        List<String> elementList=elements.asList(String.class);

        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i));
            us_07_notifications.findElementAndClickFunction(elementList.get(i));
        }
    }

    @And("^User sending the keys in the USNotifications class$")
    public void userSendingTheKeysInTheUSNotificationsClass(DataTable elements) {

        List<List<String>> elementsNameAndValue=elements.asLists(String.class);

        for(int i=0;i<elementsNameAndValue.size();i++) {
//            System.out.println(elementsNameAndValue.get(i).get(0));  // elemenaın adı
//            System.out.println(elementsNameAndValue.get(i).get(1));  // elemanın gönderilecek değeri
            us_07_notifications.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));
        }
    }

    @When("^User go to previous page$")
    public void userGoToPreviousPage() {
        driver.navigate().back();
    }

    @And("^User edit \"([^\"]*)\"$")
    public void userEdit(String value)  {
        us_07_notifications.editFunction(value);
    }

    @And("^User delete \"([^\"]*)\"$")
    public void userDelete(String value)  {
        us_07_notifications.deleteFunction(value);
    }
}

