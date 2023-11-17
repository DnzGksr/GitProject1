package HW;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class HW5 extends BaseDriver {
    /**
     Go to "https://testpages.herokuapp.com/styled/index.html"

     Click on Calculate

     Enter random numbers into the first and second input fields

     Click on Calculate Button

     Print out the result

     Check if the result is correct
     */

    @Test
    public void calculationTest(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculate = driver.findElement(By.id("calculatetest"));
        calculate.click();
        Random random = new Random();

        int randomNumber = random.nextInt(20);
        int randomNumber2 = random.nextInt(20);

        WebElement number1 = driver.findElement(By.id("number1"));
        number1.sendKeys(Integer.toString(randomNumber));

        WebElement number2 = driver.findElement(By.id("number2"));
        number2.sendKeys(Integer.toString(randomNumber2));

        WebElement calculateButton = driver.findElement(By.id("calculate"));
        calculateButton.click();

        WebElement result = driver.findElement(By.id("answer"));

        int actualResult = Integer.parseInt(result.getText());


    }
}

