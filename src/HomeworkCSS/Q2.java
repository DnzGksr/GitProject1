package HomeworkCSS;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q2 extends BaseDriver {
    @Test
    public void Test1() {
        /**
        Go to "https://demo.applitools.com/".
         Type "ttechno@gmail.com" for username.
         Type "techno123." for password.
         Click on Sign In button.
        Verify that that "Your nearest branch closes in: 30m 5s" is displayed.
         */

        driver.get("https://demo.applitools.com/");
        WebElement userName = driver.findElement(By.cssSelector("input[id=\"username\"]"));
        String username  = "ttechno@gmail.com";
        userName.sendKeys(username);

        WebElement password = driver.findElement(By.cssSelector("input[id=\"password\"]"));
        String pass  = "techno123.";
        password.sendKeys(pass);

        WebElement submitButton = driver.findElement(By.cssSelector("a[id=\"log-in\"]"));
        submitButton.click();

        WebElement displayedName = driver.findElement(By.cssSelector("h6[id=\"time\"]"));
        Assert.assertTrue(displayedName.isDisplayed());

        waitAndQuit();
    }
}
