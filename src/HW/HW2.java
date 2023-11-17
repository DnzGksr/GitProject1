package HW;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW2 extends BaseDriver {
    /**Go to "https://testpages.herokuapp.com/styled/index.html"

     Click on Alerts

     Print out the Url

     Go back

     Print out the Url

     Click on Basic Ajax

     Print out the Url
     */

    @Test
    public void printOutUrlTest(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement alerts = driver.findElement(By.id("alerttest"));
        alerts.click();

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        driver.navigate().back();

        String currentUrl2 = driver.getCurrentUrl();
        System.out.println("Current URL2: " + currentUrl2);

        WebElement basicAjaxButton = driver.findElement(By.id("basicajaxtest"));
        basicAjaxButton.click();

        String currentUrl3 = driver.getCurrentUrl();
        System.out.println("Current URL3: " + currentUrl3);

    }
}
