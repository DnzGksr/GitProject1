package HomeworkCSS;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q5 extends BaseDriver {
    @Test
    public void test1(){
        /**
         * Go to "https://testpages.herokuapp.com/styled/index.html".
         * Click on Fake Alerts.
         * Click on Show Alert Box.
         * Click on OK.
         * Alert must be closed.
         */

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakeAlerts = driver.findElement(By.cssSelector("a[id=\"fakealerttest\"]"));
        fakeAlerts.click();
        MyMethods.myWait(2);

        WebElement showAlert = driver.findElement(By.cssSelector("input[id=\"fakealert\"]"));
        showAlert.click();
        MyMethods.myWait(2);

        WebElement okButton = driver.findElement(By.cssSelector("button[id=\"dialog-ok\"]"));
        okButton.click();



    }
}
