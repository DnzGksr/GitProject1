package HW;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HW1 extends BaseDriver {
 /**  Go to "https://testpages.herokuapp.com/styled/index.html"

    Click on Alerts

    Print out the Url
*/
    @Test
    public void printOutTest(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement alerts = driver.findElement(By.id("alerttest"));
        alerts.click();

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);


    }
}
