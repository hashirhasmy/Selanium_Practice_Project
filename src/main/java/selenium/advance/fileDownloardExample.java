package selenium.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class fileDownloardExample {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/download.html");

        WebElement downloardlink = driver.findElement(By.linkText("Download Excel"));
        downloardlink.click();
        Thread.sleep(3000);

        File file = new File("C:\\Users\\User\\Downloads");
        File[] totalFiles = file.listFiles();
        for (File findFile : totalFiles) {
            if (findFile.getName().equals("Book1.xlsx")) {
                System.out.println("file is downloaded");
                break;
            }
        }
        driver.quit();

    }
}
