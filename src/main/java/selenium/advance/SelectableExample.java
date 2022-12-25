package selenium.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SelectableExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/selectable.html");

        List<WebElement> selectable =  driver.findElements(By.xpath("//*[@id='selectable']/li"));
        int size =  selectable.size();
        System.out.println(size);

        //method 01
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).build().perform();

//        method 02
//        Actions getSeleactable = new Actions(driver);
//        getSeleactable.clickAndHold(selectable.get(0));
//        getSeleactable.clickAndHold(selectable.get(1));
//        getSeleactable.clickAndHold(selectable.get(2));
//        getSeleactable.build().perform();
    }
}
