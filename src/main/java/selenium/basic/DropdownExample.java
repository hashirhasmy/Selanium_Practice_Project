package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");

        WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
        Select select = new Select(dropdown1);
        select.selectByIndex(4);
        Thread.sleep(3000);
        select.selectByValue("2");
        Thread.sleep(3000);
        select.selectByVisibleText("UFT/QTP");
        Thread.sleep(3000);

        List<WebElement> listofoption =  select.getOptions();
        int size =  listofoption.size();
        System.out.println("Number of elements "+size);

        dropdown1.sendKeys("Appium");

        WebElement multiselect = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
        Select multiselectOption = new Select(multiselect);
        multiselectOption.selectByIndex(1);
        multiselectOption.selectByIndex(2);
        multiselectOption.selectByIndex(3);



        //driver.quit();




//        WebElement test = driver.findElement(By.id("dropdown2"));
//        Select select1 = new Select(test);
//        select1.selectByValue("UFT/QTP");






    }
}
