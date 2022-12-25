package selenium.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinkadvanceExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //navigate().to() -> we can refresh the page, back and forward
        //get() -> we can do refresh, back and forward
        driver.navigate().to("http://testleaf.herokuapp.com/pages/Link.html");

        WebElement homepagelink = driver.findElement(By.linkText("Go to Home Page"));
        homepagelink.click();
        driver.navigate().back();

        WebElement wheretoGo = driver.findElement(By.partialLinkText("Find where am"));
        String path = wheretoGo.getAttribute("href");
        System.out.println("path is: " +path);

        WebElement brokenLink = driver.findElement(By.partialLinkText("Verify am I"));
        brokenLink.click();

        String title = driver.getTitle();
        if (title.contains("404")){
            System.out.println("link is broken");
        } else {
            System.out.println("not broken");
        }

        driver.navigate().back();

        WebElement homepagelink1 = driver.findElement(By.linkText("Go to Home Page"));
        homepagelink1.click();
        driver.navigate().back();


        List<WebElement> countofLinks = driver.findElements(By.tagName("a"));
        System.out.println("Counts of the links :"+ countofLinks.size());


    }
}
