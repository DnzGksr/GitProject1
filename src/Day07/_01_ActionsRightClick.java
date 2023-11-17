package Day07;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import com.google.j2objc.annotations.Weak;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static Utilities.BaseDriver.driver;
import static Utilities.BaseDriver.waitAndQuit;

public class _01_ActionsRightClick extends BaseDriver {

    @Test
    public void rightClick() {
        driver.get("https://demoqa.com/buttons");
        WebElement rightClickButton = driver.findElement(By.xpath("//button[text() = 'Right Click Me']"));

        MyMethods.myWait(2);
        Actions actions = new Actions(driver);

        actions.contextClick(rightClickButton).build().perform();

        waitAndQuit();
    }
}
