import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.*;

public class LaunchSite {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pcz\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        ChromeOptions co = new ChromeOptions();
//        co.setBinary("C:\\Users\\Pcz\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(); // Constructor

        driver.get("https://www.facebook.com/"); //opening the website
//        driver.close();
    }
}
