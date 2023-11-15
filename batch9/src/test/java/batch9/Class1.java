package batch9;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(3000);
		
		//product clicked
		driver.findElement(By.className("inventory_item_name")).click();
		Thread.sleep(3000);
		
		//add to cart
		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000);
		
		//go to cart
		driver.findElement(By.cssSelector("div#shopping_cart_container")).click();
		Thread.sleep(3000);
		
		//checkout
		driver.findElement(By.cssSelector("button#checkout")).click();
		Thread.sleep(3000);
		
		//checkout information input
		driver.findElement(By.id("first-name")).sendKeys("standard");
		driver.findElement(By.id("last-name")).sendKeys("user");
		driver.findElement(By.id("postal-code")).sendKeys("1208");
		Thread.sleep(3000);
		
		//continue button
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		
		//finish button
		driver.findElement(By.cssSelector("button#finish")).click();
		Thread.sleep(2000);
		
		//back to home
		driver.findElement(By.cssSelector("button#back-to-products")).click();
		
		
		

	}

}
