package Day08;

import Utilities.BaseDriver;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Omayo extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://omayo.blogspot.com/");

        Select select = new Select(driver.findElement(By.id("multiselect1")));

        select.selectByVisibleText("volvo");
        select.selectByValue("Hyundaix");

//        Assertions.assertTrue(option1.isSelected());
//        Assertions.assertTrue(option2.isSelected());

    }


}
