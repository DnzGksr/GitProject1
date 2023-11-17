package Day02;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_FindByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/232258017946157");

        //Locators in Selenium

        //By.id              -> 1st choice because it is unique for each element
        //By.name            ->
        //By.className
        //linkText          -> if the element is a link(a tag)
        //partialLinkText   -> if the element is a link(a tag)
        //tagName
        //cssSelector
        //xpath              -> last choice. because it works slower than others. but it is the most efficient one

        MyMethods.myWait(2);
        WebElement firstName = driver.findElement(By.name("q3_fullName3[first]"));
        firstName.sendKeys("John");

        MyMethods.myWait(2);
        WebElement lastName = driver.findElement(By.name("q3_fullName3[last]"));
        lastName.sendKeys("Snow");

        MyMethods.myWait(2);
        firstName.clear(); // if there is a text in the input field deletes it
        firstName.sendKeys("George");

        MyMethods.myWait(2);
        lastName.clear();
        lastName.sendKeys("Clooney");

        MyMethods.myWait(2);
        driver.quit();


    }


}
