package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day3 {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();

	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("mobiles");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,3800)","");
	Thread.sleep(3000);
	WebElement link = driver.findElement(By.linkText("Returns"));
	link.click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	WebElement links = driver.findElement(By.linkText("Gift Certificates"));
	links.click();




}
}
