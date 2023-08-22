package Project1;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utilities.BaseDriver.driver;

public class P1_3 extends BaseDriver {
    @Test
    public void test1(){
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        WebElement elementToHover = driver.findElement(By.cssSelector("ul[id=\"sessionLocation\"]"));
        Actions actions = new Actions(driver);
        MyMethods.myWait(2);
        actions.moveToElement(elementToHover).perform();
        MyMethods.myWait(2);

        driver.quit();

    }
}
