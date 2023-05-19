package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
 //HW1:
    //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    //fill out the form
    //close the browser
    //Note: use name or id as locators
 public static void main(String[] args) throws InterruptedException {

     WebDriver driver=new ChromeDriver();
     driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
driver.manage().window().maximize();

driver.findElement(By.id("customer.firstName")).sendKeys("Diana");

driver.findElement(By.id("customer.lastName")).sendKeys("Schwichtenberg");

driver.findElement(By.id("customer.address.street")).sendKeys("2345 Sawgrass");

driver.findElement(By.id("customer.address.city")).sendKeys("Fredericksburg");

driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");

driver.findElement(By.id("customer.address.zipCode")).sendKeys("22320");

driver.findElement(By.id("customer.phoneNumber")).sendKeys("8765678900");

driver.findElement(By.id("customer.ssn")).sendKeys("660-95-6598");

driver.findElement(By.id("customer.username")).sendKeys("angeldana");
driver.findElement(By.id("customer.password")).sendKeys("ffrreett");
driver.findElement(By.id("repeatedPassword")).sendKeys("ffrreett");
Thread.sleep(5000);
driver.quit();



 }

}
