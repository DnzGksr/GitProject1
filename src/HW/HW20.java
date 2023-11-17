package HW;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HW20 extends BaseDriver {
    /**Go to "https://en.wikipedia.org/wiki/FIFA_World_Cup"

     Print out all Hosts in the Attendance table

     */
        @Test
      public void hostNameTest(){

            driver.get("https://en.wikipedia.org/wiki/FIFA_World_Cup");
            driver.findElement(By.xpath("(//a[@class='vector-toc-link'])[19]")).click();

            List<WebElement> teams = driver.findElements(By.cssSelector("td[style='text-align:left']"));
            List<WebElement> teams2 = driver.findElements(By.cssSelector("td[style='text-align: left']"));

            List<String> textList = new ArrayList<>();

            for(WebElement team : teams){
                textList.add(team.getText());
            }
            for(WebElement team : teams2) {
                textList.add(team.getText());
            }
            for(String team : textList){
                System.out.println(team);
            }
            for(String team : textList) {
                System.out.println(team);
            }
            waitAndQuit();
        }

}
