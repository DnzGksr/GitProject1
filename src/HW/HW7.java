package HW;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW7 extends BaseDriver {
    /**Go to "https://testpages.herokuapp.com/styled/index.html"

     Click on Fake Alerts

     Click on Show modal dialog.

     Click on Ok

     Check if the alert is closed
     */

    @Test
    public void modalTEst(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.id("fakealerttest")).click();

        driver.findElement(By.id("modaldialog")).click();
        MyMethods.myWait(2);
        driver.findElement(By.id("dialog-ok")).click();

        WebElement alertBox = driver.findElement(By.xpath("//div[@role='dialog']"));

        Assert.assertFalse(alertBox.isDisplayed());

        waitAndQuit();
    }

}
