package HW;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW21 extends BaseDriver {
    /**Go to "https://en.wikipedia.org/wiki/FIFA_World_Cup"

     Click on "World Football – All time table"    in the Contents

     Print out participation count of Argentina

     Not: This table might change in time. Don't print the absolute location
     */

    @Test
    public void countTest(){

     //   driver.get("https://en.wikipedia.org/wiki/FIFA_World_Cup");
        driver.get("https://www.worldfootball.net/alltime_table/wm/");
      //  driver.findElement(By.xpath("//a[@href='http://www.worldfootball.net/alltime_table/wm/']")).click();

        WebElement argentina = driver.findElement(By.xpath("(//td[@class='hell'])[14]"));

        System.out.println("argentina = " + argentina.getText());

    }

}
