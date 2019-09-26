package rtcapmtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class test {
	WebDriver driver;
	/*This Test Will Login With  Valid Credintials */
  @Test(priority=1)
  public void Loginvalid() {
	  /*Enter Username*/
	  driver.findElement(By.name("log")).sendKeys("demo");
	  /*Enter Password*/
	  driver.findElement(By.name("pwd")).sendKeys("demo");
	  /*Click On Login Button*/
	  driver.findElement(By.xpath("//*[@id='bp-login-widget-submit']")).click();
	  /*Click On Logout Button*/
	  driver.findElement(By.xpath("//*[@id='bp_core_login_widget-4']/div[2]/div[2]/a")).click();
  }
  @Test(priority=2)
  /*This Test is to check the login functionality with invalid username and password*/
  public void Logininvalid(){
	  /*Enter Username*/
	  driver.findElement(By.name("log")).sendKeys("demo");
	  /*Enter Password*/
	  driver.findElement(By.name("pwd")).sendKeys("demooo");
	  /*Click On Login Button*/
	  driver.findElement(By.xpath("//*[@id='bp-login-widget-submit']")).click();
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","F:/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://qa.rtcamp.net/activity/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
  }

}
