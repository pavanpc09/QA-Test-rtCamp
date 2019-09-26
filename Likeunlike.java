package rtcapmtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Likeunlike {
	WebDriver driver;
  @Test(priority=1)
  public void Login() {
	  /*Enter Username*/
	  driver.findElement(By.name("log")).sendKeys("demo");
	  /*Enter Password*/
	  driver.findElement(By.name("pwd")).sendKeys("demo");
	  /*Click On Login Button*/
	  driver.findElement(By.xpath("//*[@id='bp-login-widget-submit']")).click();
  }
  @Test(priority=2)
  public void Likenlike() throws InterruptedException
  {
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/main/article/div/div/div[4]/ul/li[1]/div[2]/div[2]/div/ul/li/a/div[1]/img")).click();
	Thread.sleep(2000);
	/*Like*/
	driver.findElement(By.xpath("//*[@id='rtmedia-like-button-1353']/span")).click();
	
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
