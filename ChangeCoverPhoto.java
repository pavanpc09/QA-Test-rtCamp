package rtcapmtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ChangeCoverPhoto {
	WebDriver driver;
  @Test(priority=1)
  public void Login() {
	  driver.findElement(By.name("log")).sendKeys("demo");
	  /*Enter Password*/
	  driver.findElement(By.name("pwd")).sendKeys("demo");
	  /*Click On Login Button*/
	  driver.findElement(By.xpath("//*[@id='bp-login-widget-submit']")).click();
  }
  @Test(priority=2)
  public void changephoto() throws InterruptedException, AWTException
  {
	  driver.findElement(By.xpath("//*[@id='bp_core_login_widget-4']/div[2]/div[1]/a")).click();
	  /*Click On Profile*/
	  driver.findElement(By.xpath("//*[@id='user-xprofile']")).click();
	  /*Change Cover Photo*/
	  driver.findElement(By.xpath("//*[@id='change-cover-image']")).click();
	  Thread.sleep(3000);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,400)");
	  Thread.sleep(2000);
	  /*Select Iamge*/
	  String fileName = "ronaldo"; 
		//Transferable File Name declaration
		StringSelection contents = new StringSelection(fileName);
		//Getting toolkit
		Toolkit toolKit = Toolkit.getDefaultToolkit();
		//Getting clipboard as file upload window
		Clipboard clipBoard = toolKit.getSystemClipboard();
		//Copying string file name to the file upload window
		clipBoard.setContents(contents, null);
		System.out.println("File Selection- " +contents);
		Thread.sleep(5000);
		// This will click on Browse button
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/main/article/div/div/div[3]/div[2]/div[1]/div/div/div[1]/div/p[3]/input")).click();
		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	  
	 
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
