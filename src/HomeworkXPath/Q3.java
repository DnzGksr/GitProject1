package HomeworkXPath;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q3 extends BaseDriver {
    @Test
    public void Test1() {
//                Go to "https://www.snapdeal.com/".
//                Type "teddy bear" into the search box and click Search button.
//                Verify that "We've got 297 results for 'teddy bear'" is displayed.
//                Note: The number might be different in this text. Verify some part of the text

        driver.get("https://www.snapdeal.com");

        WebElement searchElement = driver.findElement(new By.ByXPath("//input[@id=\"inputValEnter\"]"));
        String enteredName = "teddy bear";
        searchElement.sendKeys(enteredName);

        WebElement searchButton = driver.findElement(new By.ByXPath("//span[@class=\"searchTextSpan\"]"));
        searchButton.click();

        WebElement displayedName = driver.findElement(new By.ByXPath("//span[text()=\"We've got 298 results for teddy bear\"]"));

        Assert.assertTrue(displayedName.isDisplayed());

        waitAndQuit();
    }
}
