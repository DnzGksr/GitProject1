package Day6;
import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Practise extends BaseDriver {
    /**
     * Go to https://www.facebook.com/
     * Click on Create New Account
     * Enter name, lastname and email
     * Verify that an input is displayed that says enter your email again
     * and it was not there at the beginning
     * Re-enter your email
     * Create a password
     * Select date of birth
     * Select Gender
     * And Verify it is selected
     **/

    @Test
    public void facebookTest(){

        driver.get("https://www.facebook.com/");
        WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();
        WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys("Mauro");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Icardi");
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("micardi@gmail.com");

        WebElement emailConfirm = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        Assert.assertTrue(emailConfirm.isDisplayed());
        emailConfirm.sendKeys("micardi@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        password.sendKeys("M123456");

        WebElement month = driver.findElement(By.id("month"));
        Select select = new Select(month);
        select.selectByIndex(1);

        WebElement day = driver.findElement(By.id("day"));
        Select select1 = new Select(day);
        select1.selectByValue("17");

        WebElement year = driver.findElement(By.id("year"));
        Select select2 = new Select(year);
        select2.selectByVisibleText("1981");

        WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        gender.click();
        Assert.assertTrue(gender.isSelected());

        waitAndQuit();
    }
}
