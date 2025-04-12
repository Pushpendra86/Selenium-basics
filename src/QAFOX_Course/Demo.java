package QAFOX_Course;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pcz\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //Blank browser will be launch
        WebDriver driver = new ChromeDriver();
        //The provided URL will be open
        driver.get("https://www.google.co.uk/");
        driver.manage().window().maximize();  //maximize the window

    }
}
