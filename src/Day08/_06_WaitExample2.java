package Day08;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _06_WaitExample2 extends BaseDriver {

    /**
     * Go to http://demo.seleniumeasy.com/ajax-form-submit-demo.html
     * Type Name and a Comment
     * Click on Submit Button
     * Verify you see "Success" keyword.
     **/

    @Test
    public void waitTest2(){

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement nameInput = driver.findElement(By.id("title"));
        nameInput.sendKeys("Deniz");

        WebElement comment = driver.findElement(By.id("description"));
        comment.sendKeys("BATCH 9");

        WebElement submitButton = driver.findElement(By.id("btn-submit"));
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"), "Form submitted Successfully!"));

        WebElement successMessage = driver.findElement(By.id("submit-control"));

        Assert.assertTrue(successMessage.getText().contains("Successfully"));

        waitAndQuit();
    }
}
