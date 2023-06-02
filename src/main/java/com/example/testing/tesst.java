package com.example.testing;

import java.net.URL;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
public class tesst {





    public static void main( String[] args ) throws MalformedURLException

    {

      

//        RemoteWebDriver driver;
//
//        ChromeOptions chromeOptions = new ChromeOptions();
//
//        driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);

    // Fill your code
    WebDriver driver2 = new ChromeDriver();
    driver2.get("https://www.makemytrip.com/");
    driver2.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div")).click();

    // Locate the elements on the page
    WebElement fromCity = driver2.findElement(By.id("fromCity"));
    WebElement toCity = driver2.findElement(By.id("toCity"));
    WebElement departureDate = driver2.findElement(By.id("departure"));
    WebElement passengers = driver2.findElement(By.id("passengerAndClass"));

    // Enter the flight search details
    fromCity.sendKeys("Origin Airport");
    toCity.sendKeys("Destination Airport");
    departureDate.sendKeys("2023-06-01");  // Assuming the format is YYYY-MM-DD
    passengers.click();  // Open the passengers dropdown
    WebElement adultCount = driver2.findElement(By.id("adults-1"));  // Assuming there is an element with id "adults-1" for adult count
    adultCount.sendKeys("1");  // Enter the number of adult passengers

    // Submit the search form
    WebElement searchButton = driver2.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
    searchButton.click();

    // Perform assertions or verifications on the search results page
    // For example, you can verify if the search results are displayed correctly

    // Close the browser
    driver2.quit();
    }

}


