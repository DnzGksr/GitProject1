package Day08;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Alerts extends BaseDriver {

    @Test
    public void sendKeysToAlerts(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickForPromptButton = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        clickForPromptButton.click();
        String ourMessage = "our batch is the best";
        MyMethods.myWait(2);

        driver.switchTo().alert().sendKeys(ourMessage);
        MyMethods.myWait(2);

        driver.switchTo().alert().accept();

        WebElement message = driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(message.getText().contains(ourMessage));

        waitAndQuit();
}
}