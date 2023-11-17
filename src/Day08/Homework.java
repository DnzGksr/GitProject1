package Day08;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homework extends BaseDriver {
    @Test
    public void test(){

        driver.get("https:///www.demoblaze.com/index.html");
        WebElement GalaxyS6 = driver.findElement(By.xpath("//a[text()='Samsung galaxy S6')"));
        GalaxyS6.click();

        WebElement addToCArtButton = driver.findElement(By.cssSelector("a[class=\"btn btn-success btn-lg\"]"));
        addToCArtButton.click();
        MyMethods.myWait(2);
        driver.switchTo().alert().accept();

        WebElement productStoreButton = driver.findElement(By.id("nava"));
        productStoreButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("index.html"));

        Assert.assertTrue(driver.getCurrentUrl().contains("index.html"));

        waitAndQuit();
    }
}
