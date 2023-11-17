package Day02;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _06_findByTagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://form.jotform.com/232258017946157");
        List<WebElement> linksOnJotForm = driver.findElements(By.tagName("label"));
        // locates all the element that have the same tag name



        for(WebElement link: linksOnJotForm) {
            System.out.println(link.getText() + ": ");
        }
        MyMethods.myWait(2);
        driver.quit();
    }
}
