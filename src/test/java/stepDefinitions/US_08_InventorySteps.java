package stepDefinitions;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.LeftNav;
import pages.US_08_InventoryPages;

import java.util.List;
public class US_08_InventorySteps {

    US_08_InventoryPages inventoryPages = new US_08_InventoryPages();

    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();

    @And("^Click on the element in the left class$")
    public void clickOnTheElementInTheLeftClass(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);

        for(int i=0;i<elementsToClick.size();i++) {

            System.out.println(   elementsToClick.get(i)   );
            inventoryPages.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @And("^Click on the element in the content class$")
    public void clickOnTheElementInTheContentClass(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);

        for(int i=0;i<elementsToClick.size();i++) {

            System.out.println(   elementsToClick.get(i)   );
            inventoryPages.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^User sending the keys in the form content class$")
    public void userSendingTheKeysInTheFormContentClass(DataTable elements) {

        List< List<String> >  elementsNameAndValue = elements.asLists(String.class);

        for(int i=0;i<elementsNameAndValue.size();i++) {
            inventoryPages.findElementAndSendKeysFunction( elementsNameAndValue.get(i).get(0),
                    elementsNameAndValue.get(i).get(1));
        }
    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed() {

        inventoryPages.findElementAndVerifyContainsText("msjContainer","successfully");

    }


    @When("^User delete the \"([^\"]*)\"$")
    public void user_delete_the(String name) {

        inventoryPages.editAndDeleteFunction(name, "delete");



    }

    @When("^Positions User edit the \"([^\"]*)\"$")
    public void positionsUserEditThe(String name)  {

        inventoryPages.editAndDeleteFunction(name, "edit");
    }
}
