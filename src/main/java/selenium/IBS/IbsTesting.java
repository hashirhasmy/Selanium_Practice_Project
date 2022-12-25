package selenium.IBS;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IbsTesting {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://qa.insightbusinesssolutions.app/");

        //Dimension d = new Dimension(300,1080);
        //Resize current window to the set dimension


        WebElement loginButton = driver.findElement(By.xpath("//button[@type='button']"));
        loginButton.click();

        WebElement email = driver.findElement(By.id("identifierId"));
        email.sendKeys("mhashir@codimite.com");

        WebElement nextButtonemail = driver.findElement(By.xpath("//*[@id='identifierNext']/div/button"));
        nextButtonemail.click();

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        Thread.sleep(3000);
        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("Harsan#123");

        //Thread.sleep(3000);
        WebElement nextButtonpassword = driver.findElement(By.xpath("//*[@id='passwordNext']/div/button"));
        nextButtonpassword.click();










    }

}
