package HW;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW4 extends BaseDriver {
    /**
     Go to "https://testpages.herokuapp.com/styled/index.html"

     Click on Search

     Print out the title

     Click on Search Button

     Print out the Url
     */

    @Test
    public void printUrlPage(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement search = driver.findElement(By.id("searchtest"));
        search.click();

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);

        WebElement searchButton = driver.findElement(By.cssSelector("input[type='submit']"));
        searchButton.click();

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
    }

}
