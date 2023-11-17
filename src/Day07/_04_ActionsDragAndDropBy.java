package Day07;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _04_ActionsDragAndDropBy extends BaseDriver {
    @Test
    public void DragAndDropByTest(){

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php\n");

        WebElement leftSlideButton = driver.findElement(By.xpath("//span[@style='left: 20%;']"));

        Actions actions = new Actions(driver);
        Action action = actions.dragAndDropBy(leftSlideButton,100, 0).build();
        action.perform();

        MyMethods.myWait(2);

        action = actions.dragAndDropBy(leftSlideButton, -50,0).build();
        action.perform();

        waitAndQuit();
    }
}
