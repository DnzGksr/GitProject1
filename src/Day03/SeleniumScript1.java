package Day03;

import Utilities.BaseDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumScript1 extends BaseDriver {
    public static void main(String[] args)
    {

        driver.get("http://www.google.com");
        String title=driver.getTitle();
        if(title.equals("Google"))
        {
            System.out.println("Pass:Title is Google");
        }
        else
        {
            System.out.println("Fail:Title is not Google: actual title is"+title);
        }
        driver.get("http://www.google.co.in");
        String url=driver.getCurrentUrl();
        if(url.contains("google.co.in"))
        {
            System.out.println("Pass: url has co.in");
        }
        else
        {
            System.out.println("Fail:url don't have co.in "+url);
        }
    }
}
