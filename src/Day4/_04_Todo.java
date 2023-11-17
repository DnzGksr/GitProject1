package Day4;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _04_Todo extends BaseDriver {

    /**
     * *Go to "https://www.saucedemo.com/"
     * Login
     * click on sauce labs backpack and add it to cart
     * go back
     * click on Sauce Labs Bolt T-Shirt and add it to cart
     * go back
     * click on Cart
     * click on check out
     * verify that total amount is equal to the sum of the products in the carts
     * <p>
     * Use Xpath
     */

    @Test
    public void checkOutTest() {

        driver.get("https://www.saucedemo.com");
        WebElement username = driver.findElement(new By.ByXPath("//input[@placeholder='Username']"));
        String enteredUsername = "standard_user";
        username.sendKeys(enteredUsername);

        WebElement password = driver.findElement(new By.ByXPath("//input[@id='password']"));
        String enteredPassword = "secret_sauce";
        password.sendKeys(enteredPassword);

        WebElement login = driver.findElement(new By.ByXPath("//input[@type='submit']"));
        login.click();

        WebElement selectBackpack = driver.findElement(new By.ByXPath("//img[@alt='Sauce Labs Backpack']"));
        selectBackpack.click();

        WebElement addToCart = driver.findElement(new By.ByXPath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        addToCart.click();

        driver.navigate().back();

        WebElement product2 = driver.findElement(new By.ByXPath("//div[text()=\"Sauce Labs Bolt T-Shirt\"]"));
        product2.click();

        WebElement selectTshirt = driver.findElement(new By.ByXPath("//button[starts-with(@id,\"add-to-cart\")]\n"));
        selectTshirt.click();

        driver.navigate().back();

        WebElement cart = driver.findElement(new By.ByXPath("//a[@class='shopping_cart_link']"));
        cart.click();

        WebElement checkOut = driver.findElement(new By.ByXPath("//button[@name='checkout']"));
        checkOut.click();

        WebElement name = driver.findElement(new By.ByXPath("//input[@id='first-name']"));
        String firstName = "Deniz";
        name.sendKeys(firstName);

        WebElement lastname = driver.findElement(new By.ByXPath("//input[@data-test='lastName']"));
        String lastName = "Baykal";
        lastname.sendKeys(lastName);

        WebElement zip = driver.findElement(new By.ByXPath("//input[@data-test='postalCode']"));
        String zipCode = "07646";
        zip.sendKeys(zipCode);

        WebElement continued = driver.findElement(new By.ByXPath("//input[@id='continue']"));
        continued.click();

        List<WebElement> priceList = driver.findElements(new By.ByXPath("//div[@class='inventory_item_price']"));

        Double total =0.0;
        for(WebElement element:priceList){
         total+= Double.parseDouble(element.getText().substring(1));
       }
         WebElement subtotal = driver.findElement(new By.ByXPath("//div[@class='summary_subtotal_label']"));
         String subTotalString = subtotal.getText().replaceAll("[^0-9,.]", "");//it replaces everything other than numbers
         Double subTotalDouble = Double.parseDouble(subTotalString);

         Assert.assertEquals(subTotalDouble,total);
         //Assert.assertTrue(subTotalDouble==total);

        waitAndQuit();
    }

}
