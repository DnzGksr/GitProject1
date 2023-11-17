package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;

        static {
            closePreviousDrivers();
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        driver = new ChromeDriver();

        driver.manage().window().getSize(); //Expand the driver until the edges of the screen

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        // it waits until our computer downloads all necessary files from the server
        //if it cannot download them in specified time Selenium throws an exception and that means
        //there is a problem with the server side.

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // waits until the browser translate all the documents downloaded and convert them to html codes.
        // if it cannot convert them into html in specified time Selenium throws an exception
        // that means your application is not compatible with the browser
    }
    public static void waitAndQuit(){
        MyMethods.myWait(3);
        driver.quit();
    }

    public static void closePreviousDrivers(){
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
