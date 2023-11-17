package HomeworkXPath;

import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.BaseDriver.driver;
import static Utilities.BaseDriver.waitAndQuit;

public class Q4 {
    @Test
    public void test1(){
        /**
        Go to "https://testpages.herokuapp.com/styled/index.html"
        Click on Calculate
        Type a number in the first input
        Type a number in the second input
        Click on Calculate button
        Verify that the result is correct.
        */

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculator = driver.findElement(new By.ByXPath("//a[@id=\"calculatetest\"]"));
        calculator.click();

        WebElement number1 = driver.findElement(new By.ByXPath("//input[@id=\"number1\"]"));
        String enteredNumber1 = "5";
        number1.sendKeys(enteredNumber1);

        WebElement number2 = driver.findElement(new By.ByXPath("//input[@id=\"number2\"]"));
        String enteredNumber2 = "8";
        number2.sendKeys(enteredNumber2);

        WebElement calculate = driver.findElement(new By.ByXPath("//input[@type=\"submit\"]"));
        calculate.click();

        WebElement resultBox = driver.findElement(new By.ByXPath("//span[@id=\"answer\"]"));
        String result = resultBox.getText();

        Assert.assertEquals(result,"13");

        waitAndQuit();
    }

}
