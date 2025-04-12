package QAFOX_Course;
//id
//name;
//className
//linkText
//xpath
//cssSelector

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("web driver.chrome.driver","C:\\Users\\Pcz\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //Blank browser will be launch
        WebDriver driver = new ChromeDriver();
        //The provided URL will be open
        driver.get("https://omayo.blogspot.com/");
//        driver.manage().window().maximize();
//        WebElement element = driver.findElement(By.id("confirm")); //ID locator
//        element.click(); // button will be clicked
//        driver.findElement(By.name("q")).sendKeys("Pushpendra");
//        String text = driver.findElement(By.className("gsc-search-button")).getText();
////        System.out.println(text);
//       String string = driver.getCurrentUrl();
//        System.out.println("url is : " + string);
//        driver.findElement(By.linkText("compendiumdev")).click();
//        String string2 = driver.getCurrentUrl();
//        System.out.println("current url is : " + string2);

//        String txt = driver.findElement(By.id("textbox1")).getAttribute("value");
//        System.out.println(txt);

//        String source = driver.getPageSource();
//        System.out.println(source);






        driver.quit();
    }
}
