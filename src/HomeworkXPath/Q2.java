package HomeworkXPath;

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
                Go to "http://demoqa.com/text-box".
                Type "ttechno@gmail.com" for username.
                Type "techno123." for password.
                Click on Sign In button.
                Verify that that "Your nearest branch closes in: 30m 5s" is displayed.
                 */

        driver.get("https://demo.applitools.com/");
        WebElement userName = driver.findElement(new By.ByXPath("//input[@id=\"username\"]"));
        String name = "ttechno@gmail.com";
        userName.sendKeys(name);

        WebElement password = driver.findElement(new By.ByXPath("//input[@id=\"password\"]"));
        String keyword  = "techno123.";
        password.sendKeys(keyword);

        WebElement submitButton = driver.findElement(new By.ByXPath("//a[@id=\"log-in\"]"));
        submitButton.click();

        WebElement displayedName = driver.findElement(new By.ByXPath("//h6[text()=\"Your nearest branch closes in: 30m 5s\"]"));

        Assert.assertTrue(displayedName.isDisplayed());

        waitAndQuit();
    }
}
