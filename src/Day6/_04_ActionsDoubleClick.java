package Day6;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionsDoubleClick extends BaseDriver {
    @Test

    public void doubleClickTest(){
            driver.get("https://demoqa.com/buttons");

    WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

    Actions actions = new Actions(driver);
    actions.doubleClick(doubleClickButton).build().perform();


        waitAndQuit();
    }
}
