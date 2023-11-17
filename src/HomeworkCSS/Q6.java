package HomeworkCSS;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q6 extends BaseDriver {
    public static void main(String[] args) {
        /**
         * Go to "https://testpages.herokuapp.com/styled/index.html"
         * Click on Fake Alerts.
         * Click on Show Modal Dialog button.
         * Click on OK.
         * Alert must be closed.
         */

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakeAlerts = driver.findElement(By.cssSelector("a[id=\"fakealerttest\"]"));
        fakeAlerts.click();
        MyMethods.myWait(2);

        WebElement modalDialog = driver.findElement(By.cssSelector("input[id=\"modaldialog\"]"));
        modalDialog.click();
        MyMethods.myWait(2);

        WebElement okButton = driver.findElement(By.cssSelector("button[id=\"dialog-ok\"]"));
        okButton.click();
    }
}
