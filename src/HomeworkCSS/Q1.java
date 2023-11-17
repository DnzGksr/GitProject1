package HomeworkCSS;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.BaseDriver.driver;

public class Q1 extends BaseDriver {
          @Test
          public void Test1() {
         /**
         * Go to "http://demoqa.com/text-box"
         * Type "Automation" for full name
         * Type "testing@gmail.com" for Email
         * Type "Testing Current Address" for current address
         * Type "Testing Permanent Address" for permanent address
         * Click on Submit button
         * Verify that Full Name has "Automation" in it.
         * Verify that Email has "testing" in it.
         */

        driver.get("http://demoqa.com/text-box");
        WebElement fullName = driver.findElement(By.cssSelector("input[id=\"userName\"]"));
        String name = "Automation";
        fullName.sendKeys(name);

        WebElement mail = driver.findElement(By.cssSelector("input[id=\"userEmail\"]"));
        String email = "testing@gmail.com";
        mail.sendKeys(email);

        WebElement address = driver.findElement(By.cssSelector("textarea[id=\"currentAddress\"]"));
        String currentAddress = "Testing Current Address";
        address.sendKeys(currentAddress);

        WebElement address2 = driver.findElement(By.cssSelector("textarea[id=\"permanentAddress\"]"));
        String permanentAddress = "Testing Permanent Address";
        address2.sendKeys(permanentAddress);

        WebElement submitButton = driver.findElement(By.cssSelector("button[id=\"submit\"]"));
        submitButton.click();

           String expectedText = "Automation";
           Assert.assertEquals(name,expectedText);

           Assert.assertTrue(email.contains("testing"));

           waitAndQuit();
    }
}
