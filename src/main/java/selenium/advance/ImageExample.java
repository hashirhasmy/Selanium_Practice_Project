package selenium.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ImageExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Image.html");

        WebElement firstImage = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
        firstImage.click();

        WebElement reentertoImagePage = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[4]/a"));
        reentertoImagePage.click();

        //naturalWidth = 0   -> to identify broken images in a web page
        WebElement brokenImage = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
        //brokenImage.click();

        if (brokenImage.getAttribute("naturalWidth").equals("0")){
            System.out.println("image is broken");
        } else {
            System.out.println("image not broken");
        }

        List<WebElement> imgCount =  driver.findElements(By.tagName("img"));
        System.out.println(imgCount.size());



    }
}
