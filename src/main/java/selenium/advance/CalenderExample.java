package selenium.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Calendar.html");

        WebElement datepicker = driver.findElement(By.id("datepicker"));
        //method 1 -> using send keys
//        datepicker.sendKeys("08/22/2022" + Keys.ENTER);
//        Thread.sleep(5000);

        //method 2
        datepicker.click();
        Thread.sleep(3000);

        WebElement nextbutton = driver.findElement(By.xpath("//a[@title='Next']"));
        nextbutton.click();
        Thread.sleep(3000);

        WebElement pickdate = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
        pickdate.click();






    }

}
