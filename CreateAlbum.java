package rtcapmtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class CreateAlbum {
	WebDriver driver;
	@Test(priority=1)
	public void Login()
	{
		/*Enter Username*/
		  driver.findElement(By.name("log")).sendKeys("demo");
		  /*Enter Password*/
		  driver.findElement(By.name("pwd")).sendKeys("demo");
		  /*Click On Login Button*/
		  driver.findElement(By.xpath("//*[@id='bp-login-widget-submit']")).click();
		  driver.findElement(By.xpath("//*[@id='bp_core_login_widget-4']/div[2]/div[1]/a")).click();
          driver.findElement(By.xpath("//*[@id='user-media']")).click();		  
	}
  @Test(priority=2)
  public void CreatenewAlbum() {
	  /*Click On Options*/
	driver.findElement(By.xpath("//*[@id='rtm-media-options-list']/div/div")).click();
	/*Click On Add Album*/
	driver.findElement(By.xpath("//*[@id='rtm-media-options-list']/div/ul/li/a")).click();
	/*Enter Album Title*/
	driver.findElement(By.xpath("//*[@id='rtmedia_album_name']")).sendKeys("Football_Players");
	/*Album Description*/
	driver.findElement(By.xpath("//*[@id='rtmedia_album_description']")).sendKeys("Album Contains The Images of Various Football Players Like Ronaldo , Messi , Hazard Etc");
	/*Click On Create Button*/
	driver.findElement(By.xpath("//*[@id='rtmedia_create_new_album']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","F:/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://qa.rtcamp.net/members/demo/media/album/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
