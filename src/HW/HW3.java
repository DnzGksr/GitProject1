package HW;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW3 extends BaseDriver {

    /**Go to "https://testpages.herokuapp.com/styled/index.html"

     Click on Find By Playground

     Find the 5th text
     */
    @Test
    public void findTextTest(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement findByButton = driver.findElement(By.id("findbytest"));
        findByButton.click();

        WebElement fifthText = driver.findElement(By.id("p5"));
        System.out.println("fifthText = " + fifthText.getText());
    }
}
