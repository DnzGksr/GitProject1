package HomeworkCSS;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q3 extends BaseDriver {
    @Test
    public void test1() {
        /**
        Go to "https://www.snapdeal.com/".
         Type "teddy bear" into the search box and click Search button.
        Verify that "We've got 297 results for 'teddy bear'" is displayed.
        Note: The number might be different in this text. Verify some part of the text
         */

        driver.get("https://www.snapdeal.com/");
        WebElement searchBox = driver.findElement(By.cssSelector("input[name=\"keyword\"]"));
        String typedWord = "teddy bear";
        searchBox.sendKeys(typedWord);

        WebElement searchButton = driver.findElement(By.cssSelector("span[class=\"searchTextSpan\"]"));
        searchButton.click();

        WebElement displayedText = driver.findElement(By.cssSelector("span[style^=\"color\"]"));
        String text = displayedText.getText();

        Assert.assertEquals(text, "We've got 298 results for teddy bear");

        waitAndQuit();

    }
}
