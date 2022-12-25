package selenium.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutocompleteExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/autoComplete.html");

        WebElement input = driver.findElement(By.id("tags"));
        input.sendKeys("s");
        Thread.sleep(4000);

        List<WebElement> optionList =  driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
        System.out.println("count of the labels :"+ optionList.size());

        for (WebElement webelement: optionList) {

            if (webelement.getText().equals("Selenium")){
                System.out.println("Selecting :"+webelement.getText());
                webelement.click();
              break;
            } else {
                System.out.println("iteration happaning");
            }

        }







    }

}
