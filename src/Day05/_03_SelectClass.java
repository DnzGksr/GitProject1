package Day05;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_SelectClass extends BaseDriver {

    /**
     * It is a class that allows us to handle select tags(dropdown menu)
     * note: some dropdown menus might not be select tag
     * we create a select object and then we use this object to handle select elements
     */

    @Test
    public void test1(){
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement discoverXYZ = driver.findElement(By.cssSelector("select[aria-required='true']"));

        Select select = new Select(discoverXYZ);
  //      select.selectByVisibleText("Referred by Existing Customer");
  //      select.selectByValue("Offline Advertising");

        int randomIndex = ((int)(Math.random()*5))+1;
        select.selectByIndex(randomIndex);

        waitAndQuit();
    }
}
