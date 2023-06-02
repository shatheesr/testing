package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test4 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");

        // Locate the "Featured" element using XPath
        WebElement featuredElement = driver.findElement(By.xpath("//h3[contains(text(), 'Featured')]"));

        // Perform actions on the "Featured" element or verify its presence
        // For example, print the text of the element
        System.out.println(featuredElement.getText());

        // Close the browser
//        driver.quit();
//        
    }

}
