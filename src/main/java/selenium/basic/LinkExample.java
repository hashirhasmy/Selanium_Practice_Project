package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Link.html");

        //Method 1
        driver.findElement(By.partialLinkText("Home Page")).click();

        //Method 2
        //WebElement test = driver.findElement(By.linkText("Go to Home Page"));
        //test.click();

        //driver.quit();


    }
}
