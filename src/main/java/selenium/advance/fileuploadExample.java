package selenium.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class fileuploadExample {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/upload.html");

        WebElement uploadclick = driver.findElement(By.name("filename"));
        //uploadclick.sendKeys("C:\\Users\\User\\Downloads\\Book2.xlsx");            first method
        uploadclick.click();



        String data = "C:\\Users\\User\\Downloads\\Book2.xlsx";
        StringSelection selection = new StringSelection(data);
        //copying the path to clipboad
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);









    }
}
