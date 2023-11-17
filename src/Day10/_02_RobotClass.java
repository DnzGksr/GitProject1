package Day10;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _02_RobotClass extends BaseDriver {

    // What is robotClass ?
    //it is a class that lets us control the operating system(Windows, Mac)

    // When do you use it ?
    // we use it when we need upload or download files.

    // how do you use it ?
    // We create a robot class object and by using this object we can control our keyboard to control the os.

    @Test
    public void robotClassTest1() throws AWTException {
      driver.get("http://demo.guru99.com/test/upload/");

      WebElement chooseFileButton = driver.findElement(By.id("uploadfile_0"));


      Actions actions = new Actions(driver);
      actions.click(chooseFileButton).build().perform();

        StringSelection filePath = new StringSelection("C:\\Users\\dnz66\\Desktop\\Robot Class  Test Document.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
        //Stores  the path of our document

      MyMethods.myWait(2);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);// press and hold CTRL button
        robot.keyPress(KeyEvent.VK_V); //press and hold V button to paste our path
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        // released V first and control second

        robot.keyPress(KeyEvent.VK_ENTER );
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebElement checkBox = driver.findElement(By.id("terms"));
        checkBox.click();

        WebElement submitButton = driver.findElement(By.id("submitbutton"));
        submitButton.click();

        WebElement message = driver.findElement(By.id("res"));

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOf(message));



        Assert.assertTrue(message.getText().contains("successfully uploaded"));

        waitAndQuit();

    }
}
