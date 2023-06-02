package com.example.testing;
import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class exam {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.bigbasket.com/");

    
    WebElement loginButton = driver.findElement(By.xpath("//a[@qa='loginLink']"));
    loginButton.click();
    
    
    String username = "727821tuec278";
    String password = "messi123";

    WebElement usernameField = driver.findElement(By.xpath("//input[@id='otpEmail']"));
    usernameField.sendKeys(username);

    WebElement passwordField = driver.findElement(By.xpath("//input[@id='otpPassword']"));
    passwordField.sendKeys(password);

    WebElement loginSubmitButton = driver.findElement(By.xpath("//button[@qa='loginSubmitBtn']"));
    loginSubmitButton.click();

  
//    WebDriver wait = new WebDriver(driver, 10);
//    wait.until(ExpectedCondition.urlContains("bigbasket.com"));

   
    if (driver.getCurrentUrl().contains("bigbasket.com")) {
        System.out.println("User logged in successfully.");
    } else {
        System.out.println("Login failed.");
    }

   
    WebElement searchBox = driver.findElement(By.xpath("//input[@qa='searchBar']"));
    searchBox.sendKeys("football");

    WebElement searchButton = driver.findElement(By.xpath("//button[@qa='searchButton']"));
    searchButton.click();

   
   
    WebElement productItem = driver.findElement(By.xpath("//div[@qa='productItem']"));
    String productName = productItem.getText();

    if (productName.equalsIgnoreCase("desired product name")) {
        System.out.println("Product search successful.");
    } else {
        System.out.println("Product search failed.");
    }

   
    WebElement sortDropdown = driver.findElement(By.xpath("//select[@qa='sortDropdown']"));
    sortDropdown.sendKeys("Price - Low to High");

   
//    wait.until(ExpectedConditions.attributeToBe(By.xpath("//select[@qa='sortDropdown']"), "value", "price_asc"));

    
    List<WebElement> sortedItems = driver.findElements(By.xpath("//div[@qa='productItem']"));

    System.out.println("First 5 items' names post sorting:");
    for (int i = 0; i < 5 && i < sortedItems.size(); i++) {
        System.out.println(sortedItems.get(i).getText());
    }

   
	}


}
