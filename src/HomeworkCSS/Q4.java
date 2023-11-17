package HomeworkCSS;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q4 extends BaseDriver {
        @Test
        public void test1(){
        /**
         * Go to "https://testpages.herokuapp.com/styled/index.html"
         * Click on Calculate
         * Type a number in the first input
         * Type a number in the second input
         * Click on Calculate button
         * Verify that the result is correct.
         */

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculate = driver.findElement(By.cssSelector("a[id=\"calculatetest\"]"));
        calculate.click();

        WebElement putNumber = driver.findElement(By.cssSelector("input[id=\"number1\"]"));
        String number1 = "5";
        putNumber.sendKeys(number1);

        WebElement putNumber2 = driver.findElement(By.cssSelector("input[id=\"number2\"]"));
        String number2 = "7";
        putNumber2.sendKeys(number2);

        WebElement calculateButton = driver.findElement(By.cssSelector("input[id=\"calculate\"]"));
        calculateButton.click();

        WebElement resultBox = driver.findElement(By.cssSelector("span[id=\"answer\"]"));
        String result = resultBox.getText();

                Assert.assertEquals(result,"12");

                waitAndQuit();
    }
}
