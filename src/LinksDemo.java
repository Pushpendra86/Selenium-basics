import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pcz\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // Constructor

        driver.get("https://www.facebook.com/"); //opening the website

//        driver.findElement(By.partialLinkText("password ?")).click();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);

        driver.quit();

    }
}
