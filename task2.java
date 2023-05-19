package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//    //enter the username "Tester"//enter the password "test"//get the title of the webPage and confirm that it is  "Web Orders Login"
  //    //------------------__------__**happy coding *** (edited)
public class task2 {
  public static void main(String[] args) throws InterruptedException {


    WebDriver driver = new ChromeDriver();
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
    driver.manage().window().maximize();
    driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
    driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
    Thread.sleep(3000);


    String title = driver.getTitle();

    System.out.println(title);

    if (title.equals("Web Orders Login")) {

      System.out.println("the title is correct");

  }else{
      System.out.println("the title is incorrect");
    }
    driver.quit();

}}
