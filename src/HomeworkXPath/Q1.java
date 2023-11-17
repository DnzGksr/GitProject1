package HomeworkXPath;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q1 extends BaseDriver {
    @Test
    public void test1() {
        /**
        Go to "http://demoqa.com/text-box"
        Type "Automation" for full name
        Type "testing@gmail.com" for Email
        Type "Testing Current Address" for current address
        Type "Testing Permanent Address" for permanent address
        Click on Submit button
        Verify that Full Name has "Automation" in it.
        Verify that Email has "testing" in it.
         */

        driver.get("http://demoqa.com/text-box");
        WebElement username = driver.findElement(new By.ByXPath("//input[@id=\"userName\"]"));
        String  enteredName = "Automation";
        username.sendKeys(enteredName);

        WebElement email = driver.findElement(new By.ByXPath("//input[@id=\"userEmail\"]"));
        String enteredEmail = "testing@gmail.com";
        email.sendKeys(enteredEmail);

        WebElement address = driver.findElement(new By.ByXPath("//textarea[@id=\"currentAddress\"]"));
        String enteredAddress= "Testing Current Address";
        address.sendKeys(enteredAddress);

        WebElement address2 = driver.findElement(new By.ByXPath("//textarea[@id=\"permanentAddress\"]"));
        String enteredAddress2= "Testing Permanent Address";
        address2.sendKeys(enteredAddress2);

        WebElement submitButton = driver.findElement(new By.ByXPath("//button[@id=\"submit\"]"));
        submitButton.click();

        String expectedText = "Automation";
        Assert.assertEquals(enteredName,expectedText);




    }
}
