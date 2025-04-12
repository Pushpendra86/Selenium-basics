package QAFOX_Course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pcz\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //Blank browser will be launch
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //The provided URL will be open
        driver.get("https://omayo.blogspot.com//");
        WebElement ifram2 = driver.findElement(By.id("iframes"));
        driver.switchTo().frame(ifram2);

    }
}
