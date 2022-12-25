package selenium.basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
    public static void main(String[] args) throws InterruptedException {

        //ctrl + Alt + L => code format

        //1.open google
        //2.google home

        //1st way this will surport all kind of chrome versions
        WebDriverManager.chromedriver().setup();

        //2nd way
        //System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("premiumservicebrands"+ Keys.ENTER);







        //driver.quit();


    }
}
