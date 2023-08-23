package Day6;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_SelectPractice extends BaseDriver {
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
    public void Selector(){
    driver.get("https://www.facebook.com");
    WebElement newAccount = driver.findElement(new By.ByCssSelector("a[data-testid^='open-registration']"));
    newAccount.click();

    WebElement firstName = driver.findElement(new By.ByCssSelector("input[name='firstname']"));
    firstName.sendKeys("Deniz");

    WebElement lastName = driver.findElement(new By.ByCssSelector("input[name='lastname']"));
    lastName.sendKeys("Baykal");

    WebElement email = driver.findElement(new By.ByCssSelector("input[name='reg_email__']"));
    email.sendKeys("fsdfg@gmail.com");

    WebElement emailConfirm = driver.findElement(new By.ByCssSelector("input[name='reg_email_confirmation__']"));
    Assert.assertTrue(emailConfirm.isDisplayed());
    emailConfirm.sendKeys("fsdfg@gmail.com");

    WebElement putPassword = driver.findElement(new By.ByCssSelector("input[name='reg_passwd__']"));
    putPassword.sendKeys("Techno123.");

    WebElement Month = driver.findElement(By.id("month"));
    Select selectMonth = new Select(Month);
    selectMonth.selectByIndex(2);

    WebElement birthDay = driver.findElement(By.id("day"));
    Select Day = new Select(birthDay);
    Day.selectByValue("27");

    WebElement birthYear = driver.findElement(By.id("year"));
    Select Year = new Select(birthYear);
    Year.selectByVisibleText("2001");

    WebElement gender = driver.findElement(new By.ByCssSelector("span[data-type='radio']"));


}
}
