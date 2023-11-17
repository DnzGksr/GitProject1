package HomeworkXPath;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.BaseDriver.driver;
import static Utilities.BaseDriver.waitAndQuit;

public class Q6 extends BaseDriver {
    public static void main(String[] args) {
        /**
        Go to "https://testpages.herokuapp.com/styled/index.html"
        Click on Fake Alerts.
        Click on Show Modal Dialog button.
        Click on OK.
                Alert must be closed.
         */

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fake = driver.findElement(new By.ByXPath("//a[@id=\"fakealerttest\"]"));
        fake.click();

        WebElement dialogButton = driver.findElement(new By.ByXPath("//input[@id=\"modaldialog\"]"));
        dialogButton.click();

        WebElement okButton = driver.findElement(new By.ByXPath("//button[@id=\"dialog-ok\"]"));
        okButton.click();

        waitAndQuit();

    }
}
