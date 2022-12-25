package selenium.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AleartExample {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Alert.html");

        WebElement aleartBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
        aleartBox.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

        WebElement confirmBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
        confirmBox.click();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(3000);
        alert1.dismiss();

        WebElement promtBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
        promtBox.click();
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(3000);
        alert3.sendKeys("hashir");
        alert3.accept();





    }
}
