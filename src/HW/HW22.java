package HW;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class HW22<Int> extends BaseDriver {
    /**Go to "https://testsheepnz.github.io/BasicCalculator.html"
     Generate 2 random numbers between 0-100
     Run all the functions of the calculator with these numbers
     Check the if the results are correct
     Repeat these steps 5 times with different numbers
     */

    @Test
    public void calculatorTest(){
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        WebElement number1 = driver.findElement(By.id("number1Field"));
        Random random = new Random();
        int randomNumber = random.nextInt(100);


    }

}
