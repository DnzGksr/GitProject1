package Day6;

import Utilities.MyMethods;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Utilities.BaseDriver.driver;
import static Utilities.BaseDriver.waitAndQuit;

public class _03_ActionsSingleClick {

    @Test
    public void singleClickTest(){
        driver.get("https://demoqa.com/buttons");
        WebElement singleClickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));

        MyMethods.myWait(2);

        Actions actions = new Actions(driver);
        Action action = actions.click(singleClickButton).build(); // selenium prepares the action for us and waits to perform
        action.perform(); // can perform same action multiple times

        waitAndQuit();

    }
}
