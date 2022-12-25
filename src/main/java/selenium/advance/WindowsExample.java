package selenium.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Window.html");

        String oldWindow = driver.getWindowHandle();
//1)
        WebElement firstButton = driver.findElement(By.id("home"));
        firstButton.click();
        Thread.sleep(3000);

        Set<String> handles = driver.getWindowHandles();

        for (String newWindow : handles) {
            driver.switchTo().window(newWindow);
        }

        WebElement editbutton = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a"));
        editbutton.click();
        driver.close();

        driver.switchTo().window(oldWindow);
//2)
        WebElement multiWindow = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
        multiWindow.click();
        Thread.sleep(3000);
                                                                                    //method 01 my one i think this one wrong
                                                                                    //int howmanywindows =  handles.size();
                                                                                    //System.out.println(howmanywindows);
        //method 02 learn automation online
        int howmanywindows = driver.getWindowHandles().size();
        System.out.println("No of windows open : " + howmanywindows);


//3)
        WebElement dontcloseMe = driver.findElement(By.id("color"));
        dontcloseMe.click();
        Thread.sleep(3000);

        Set<String> newWindowsHandle =  driver.getWindowHandles();
        for (String allWindows: newWindowsHandle) {
            if (!allWindows.equals(oldWindow)){
                driver.switchTo().window(allWindows);
                driver.close();
            }
        }

        driver.switchTo().window(oldWindow);

//4) need to ask this from jayashan  --fixed reasion is fiorgot to switch to main window
        Thread.sleep(3000);
        WebElement waitficeSecond = driver.findElement(By.xpath("//button[contains(text(),'Wait for 5 seconds')]"));
        waitficeSecond.click();





    }

}
