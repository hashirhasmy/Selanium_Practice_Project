package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExamples {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Edit.html");


        WebElement emailbox = driver.findElement(By.id("email"));
        emailbox.sendKeys("hashirhasmy111@gmail.com");

        WebElement appendtext = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
        appendtext.sendKeys("text sample");

        WebElement gettext = driver.findElement(By.name("username"));
        String value = gettext.getAttribute("value");
        System.out.println(value);

        WebElement cleartext = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
        cleartext.clear();

        WebElement disable = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
        boolean enabled =  disable.isEnabled();
        System.out.println(enabled);


    }
}
