package Day07;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionsSendkeys extends BaseDriver {

    @Test
    public void sendKeysTest(){
        driver.get("https://demoqa.com/auto-complete\n");

        WebElement multipleColor = driver.findElement(By.cssSelector("div[class$='placeholder']"));
        Actions actions = new Actions(driver);
        Action action = actions.click(multipleColor).
                keyDown(Keys.SHIFT).sendKeys("b").
                keyUp(Keys.SHIFT).sendKeys("lue").build();
        action.perform();

        action = actions.sendKeys(Keys.ENTER).build();
        action.perform();

        waitAndQuit();

    }
}
