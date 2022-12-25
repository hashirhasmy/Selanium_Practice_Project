package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");

        WebElement java = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/input[1]"));
        java.click();

        WebElement checked = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/input"));
        boolean status1 = checked.isSelected();
        System.out.println(status1);

        WebElement firstElement = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/input[1]"));
        if (firstElement.isSelected()){
            firstElement.click();
        }

        WebElement secondElement  = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/input[2]"));
        if (secondElement.isSelected()){
            secondElement.click();
        }


        WebElement one = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[1]"));
        WebElement two = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]"));
        WebElement three = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]"));
        WebElement four = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[4]"));
        one.click();
        two.click();
        three.click();
        four.click();


    }
}
