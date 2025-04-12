import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/");

        WebElement img = driver.findElement(By.className("lnXdpd"));

        boolean s1 = img.isDisplayed();
        System.out.println(s1);

        System.out.println(img.isEnabled());
        System.out.println(img.isSelected());
    }
}
