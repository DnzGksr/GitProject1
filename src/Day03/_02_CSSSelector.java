package Day03;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_CSSSelector extends BaseDriver {
    /**
     * Go to "http://demo.seleniumeasy.com/basic-first-form-demo.html"
     * Type your message into the input box
     * Click on Show Message button
     * Check if the message shown next to Your Message and the message you sent are the same
     **/
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement messageInput = driver.findElement(By.cssSelector("input[class=\"form-control\"]"));
        String enteredMessage = "Hello Batch 9";
        messageInput.sendKeys(enteredMessage);

        WebElement showMessageButton = driver.findElement(By.cssSelector("button[onclick=\"showInput();\"]"));
        showMessageButton.click();

        WebElement displayedMessage = driver.findElement(By.cssSelector("span[title=\"text message\"]"));

        if (displayedMessage.getText().equals(enteredMessage)){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is failed");
        }
        driver.close();
    }

    }

