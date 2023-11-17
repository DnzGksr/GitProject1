package HomeworkXPath;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q5 extends BaseDriver {
    public static void main(String[] args) {

//                Go to "https://testpages.herokuapp.com/styled/index.html".
//                Click on Fake Alerts.
//                Click on Show Alert Box.
//                Click on OK.
//                Alert must be closed.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlert = driver.findElement(new By.ByXPath("//a[@id=\"fakealerttest\"]"));
        fakeAlert.click();

        WebElement showAlert = driver.findElement(new By.ByXPath("//input[@id=\"fakealert\"]"));
        showAlert.click();

        WebElement okButton = driver.findElement(new By.ByXPath("//button[@id=\"dialog-ok\"]"));
        okButton.click();

            waitAndQuit();

    }
}
