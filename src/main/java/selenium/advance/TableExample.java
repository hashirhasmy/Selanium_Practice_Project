package selenium.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TableExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/table.html");


        //###### 1) Get the count of number of columns

        List<WebElement> countofColumns = driver.findElements(By.tagName("th"));
        System.out.println("Count of columns : " + countofColumns.size());

        //###### 2) Get the count of number of rows

        List<WebElement> countofRows = driver.findElements(By.tagName("tr"));
        System.out.println("Count of rows : " + countofRows.size());


        //###### 3) Get the progress value of 'Learn to interact with Elements'

        WebElement progressValue = driver.findElement(By.xpath("//td[normalize-space()= 'Learn to interact with Elements']//following :: td[1]"));
        String valueText = progressValue.getText();
        System.out.println("progress value of the Learn to interact with Elements :" + valueText);


        //###### 4) Check the vital task for the least completed progress.

        List<WebElement> allprogress = driver.findElements(By.xpath("//td[2]"));
        List<Integer> numberList = new ArrayList<>();

        for (WebElement webElement : allprogress) {
            String individualValues = webElement.getText().replace("%", "");
            //change the string value to integer value
            //Integer.parseInt(individualValues);
            numberList.add(Integer.parseInt(individualValues));
        }
        System.out.println("Final result :" + numberList);

        Integer minvalue = Collections.min(numberList);
        System.out.println(minvalue);

        String smallvalueString =  Integer.toString(minvalue)+"%";


        //td[normalize-space()='20%']//following :: td[1]
        String XPATHfornextTosmallvaluestingchackbox = "//td[normalize-space()=" + "\"" + smallvalueString +  "\"" +  "]" + "//following :: td[1]" ;
        System.out.println(XPATHfornextTosmallvaluestingchackbox);

        WebElement tickthesmallestvalueTextBox = driver.findElement(By.xpath(XPATHfornextTosmallvaluestingchackbox));
        tickthesmallestvalueTextBox.click();









    }
}
