package selenium.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class frameExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/frame.html");

//       **** frames = html page inside main html page (need to swith one time)
//                html
//                    html
//       ****  nested frames =   need to switch two times
//                html
//                    html
//                        html

        driver.switchTo().frame(0); //index value find out for which frame going to swith through frame tag order | first frame we index as 0
        WebElement button1 = driver.findElement(By.id("Click"));
        button1.click();

        String text = button1.getText();
        System.out.println("first button my method "+text);

        String text1 =  driver.findElement(By.id("Click")).getText();
        System.out.println("first button you tube method "+text1);

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1); //inside into second frame
        driver.switchTo().frame("frame2");
        WebElement button2 = driver.findElement(By.id("Click1"));
        button2.click();
        String text2 =  driver.findElement(By.id("Click1")).getText();
        System.out.println("second button "+text2);

        driver.switchTo().defaultContent();

        List<WebElement> getiframeTagCount =  driver.findElements(By.tagName("iframe"));
        int size = getiframeTagCount.size();
        System.out.println(size);











    }
}
