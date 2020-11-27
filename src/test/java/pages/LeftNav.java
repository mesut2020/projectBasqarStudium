package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(driver, this);
    }


    WebElement myElement;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

        }

        clickFunction(myElement);
    }
}