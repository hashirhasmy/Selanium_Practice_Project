package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Button.html");

        WebElement getposition = driver.findElement(By.id("position"));
        Point xypoint =  getposition.getLocation();
        int x =  xypoint.getX();
        int y =  xypoint.getY();
        System.out.println("X position is:" + x + " Y position is:" + y);

        WebElement buttoncolor = driver.findElement(By.xpath("//button[@id='color']"));
        String color =  buttoncolor.getCssValue("background-color");
        System.out.println(color);

        WebElement size = driver.findElement(By.id("size"));
        int height =  size.getSize().getHeight();
        int width =  size.getSize().getWidth();
        System.out.println("height:"+height+" width:"+width);

        WebElement home = driver.findElement(By.id("home"));
        home.click();

        driver.quit();



    }
}
