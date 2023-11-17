package Day4;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartTest extends BaseDriver {

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
    public void checkoutTest(){
     driver.get("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement backPack = driver.findElement(By.xpath("//div[@class=\"inventory_item_name \"]"));
        backPack.click();
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();

        driver.navigate().back();
        WebElement tShirt = driver.findElement(By.xpath("//div[text()=\"Sauce Labs Bolt T-Shirt\"]"));
        tShirt.click();
        WebElement addToCartButton2 = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCartButton2.click();
        driver.navigate().back();

        WebElement shoppingCartButton = driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]"));
        shoppingCartButton.click();
        WebElement checkOutButton = driver.findElement(By.id("checkout"));
        checkOutButton.click();
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

        List<WebElement> listPrice = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        Double total = 0.0;
        for (WebElement price : listPrice){
            total += Double.parseDouble(price.getText().substring(1));
        }

        WebElement subTotal = driver.findElement(new By.ByXPath("//div[@class='summary_subtotal_label']"));
        String subTotalString = subTotal.getText().replaceAll("[0-9,.]", "");
       System.out.println(subTotalString);
        Double subTotalDouble = Double.parseDouble(subTotalString);

        Assert.assertEquals(subTotalDouble,total);

       waitAndQuit();

    }
}
