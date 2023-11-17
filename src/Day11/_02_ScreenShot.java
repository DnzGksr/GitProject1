package Day11;

import Utilities.BaseDriver;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _02_ScreenShot extends BaseDriver {

    @Test
    public void takeScreenShot() throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("sdfsdfg");

        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
        submitButton.click();

        try {
            WebElement dashboard = driver.findElement(By.cssSelector("h6[class*='oxd-topbar-header']"));

            Assert.assertTrue(dashboard.isDisplayed());

        }catch (NoSuchElementException e) {
            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM_dd_yyyy_gg_mm_ss_SSS");
            System.out.println("localDateTime = " + localDateTime);

            TakesScreenshot takesScreenshot = (TakesScreenshot) driver; //takes the screenshot
            File screenshotInTemporaryFile = takesScreenshot.getScreenshotAs(OutputType.FILE);//stores it in  a temporary file
            FileUtils.copyFile(screenshotInTemporaryFile, new File("screenShots/screenshot"+localDateTime.format(formatter)+".png"));
        }
        waitAndQuit();
    }
}
