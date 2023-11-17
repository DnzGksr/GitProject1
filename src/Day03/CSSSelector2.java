package Day03;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.BaseDriver.driver;

public class CSSSelector2 extends BaseDriver {
    /**
     * Go to "https://formsmarts.com/form/yu?mode=h5"
     * Select Business
     * Click on Discover XYZ and select Online Advertising
     * Select Every Day
     * Select Good
     * Click on XYZ and select the 3rd option
     * Use Css Selector only
     ***/
    public static void main(String[] args) {
    driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement selectInput = driver.findElement(By.cssSelector("input[type=\"radio\"]"));
        selectInput.click();

        WebElement selectOption = driver.findElement(By.cssSelector("option[value=\"Online Advertising\"]"));
        selectOption.click();

        WebElement selectInput2 = driver.findElement(By.cssSelector("input[value=\"Every Day\"]"));
        selectInput2.click();

        WebElement selectInput3 = driver.findElement(By.cssSelector("input[value=\"Good\"]"));
        selectInput3.click();

        WebElement selectOption2 = driver.findElement(By.cssSelector("option[value*=\"month\"]"));
        selectOption2.click();

        waitAndQuit();

  }
}
