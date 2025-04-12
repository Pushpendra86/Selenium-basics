import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTheApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pcz\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // Constructor

        driver.get("https://www.facebook.com/"); //opening the website

        // Getting information of the webpage
        String title = driver.getTitle();
        System.out.println(title);

        System.out.println(driver.getCurrentUrl());
        String expectTitle = "Facebook – log in or sign up";
        if (title.matches(expectTitle)){
            System.out.println("Valid app");
        }
        else {
            System.out.println("Invalid app");
        }
        if (driver.getCurrentUrl().matches("https://www.facebook.com/")){
            System.out.println("Valid url");
        }
        else {
            System.out.println("invalid url");
        }

        //Login functionality
        WebElement unm = driver.findElement(By.id("email"));
        unm.sendKeys("user1");

//        driver.findElement(By.id("email")).sendKeys("user2"); // one line statement

        WebElement pswd = driver.findElement(By.name("pass"));
        pswd.sendKeys("test");
        pswd.clear();
        pswd.sendKeys("aaa");

        WebElement log = driver.findElement(By.name("login"));
        log.click();


    }
}
