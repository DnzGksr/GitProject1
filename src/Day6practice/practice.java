package Day6practice;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class practice extends BaseDriver {

    @Test
    public void clickTest(){
        driver.get("https://demoqa.com/buttons");

        WebElement singleClickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        MyMethods.myWait(2);

        Actions actions = new Actions(driver);
        Action action = actions.click(singleClickButton).build();
        action.perform();

        waitAndQuit();
    }

}
