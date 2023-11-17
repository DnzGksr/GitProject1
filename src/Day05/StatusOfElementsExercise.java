package Day05;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class StatusOfElementsExercise extends BaseDriver {
    @Test
    public void test() {

        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement usingXYZ = driver.findElement(new By.ByCssSelector("select[name='u_Z3C_4597']"));
        Select select = new Select(usingXYZ);
//        select.selectByVisibleText("I'm using XYZ for about a week");
 //       select.selectByValue("I'm using XYZ for a month or more");
            select.selectByIndex(4);

    }
}