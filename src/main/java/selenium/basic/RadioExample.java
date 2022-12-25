package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//      driver.get("http://www.leafground.com/pages/radio.html");
        driver.get("http://testleaf.herokuapp.com/pages/radio.html");

        WebElement first = driver.findElement(By.xpath("//input[@id='yes']"));
        first.click();

        WebElement unchecked = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[1]"));
        WebElement checked = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[2]"));
        boolean status1 =  unchecked.isSelected();
        boolean status2 =  checked.isSelected();
        System.out.println("Unchecked:" + status1);
        System.out.println("Unchecked:" + status2);


    }
}
