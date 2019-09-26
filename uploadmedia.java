package rtcapmtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class uploadmedia {
	WebDriver driver;
  @Test
  public void Login() {/*Enter Username*/
	  driver.findElement(By.name("log")).sendKeys("demo");
	  /*Enter Password*/
	  driver.findElement(By.name("pwd")).sendKeys("demo");
	  /*Click On Login Button*/
	  driver.findElement(By.xpath("//*[@id='bp-login-widget-submit']")).click();
	  /*Click On Profile Name*/
	  driver.findElement(By.xpath("//*[@id='bp_core_login_widget-4']/div[2]/div[1]/a")).click();
	  /*Click On Media*/
	  driver.findElement(By.xpath("//*[@id='user-media']")).click();
  }
  @Test
  
  public void Uploadmedia() throws InterruptedException, AWTException{
	  driver.findElement(By.xpath("//*[@id='rtm_show_upload_ui']")).click();
	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	  /*Select AlbumName*/
	  Select AlbumName = new Select(driver.findElement(By.xpath("//*[@class='rtmedia-user-album-list']")));
		AlbumName.selectByVisibleText("Football_Players");
		Thread.sleep(3000);
	/*Select Files*/
		//WebElement pic1 = driver.findElement(By.xpath("//*[@id='rtMedia-upload-button']"));
		//pic1.click();
		//pic1.sendKeys("C:/Users/Lenovo/neymar.jpg");
		String fileName = "neymar"; 
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
		driver.findElement(By.xpath("//*[@id='rtMedia-upload-button']")).click();
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
		
		/*Second Image*/
		String fileName1 = "ronaldo"; 
		//Transferable File Name declaration
		StringSelection contents1 = new StringSelection(fileName1);
		//Getting toolkit
		Toolkit toolKit1 = Toolkit.getDefaultToolkit();
		//Getting clipboard as file upload window
		Clipboard clipBoard1 = toolKit1.getSystemClipboard();
		//Copying string file name to the file upload window
		clipBoard1.setContents(contents1, null);
		System.out.println("File Selection- " +contents1);
		Thread.sleep(5000);
		// This will click on Browse button
		driver.findElement(By.xpath("//*[@id='rtMedia-upload-button']")).click();
		Robot robot1 = new Robot();
		Thread.sleep(1000);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
	
	
		/*Third Image*/
		String fileName2 = "klopp"; 
		//Transferable File Name declaration
		StringSelection contents2 = new StringSelection(fileName2);
		//Getting toolkit
		Toolkit toolKit2 = Toolkit.getDefaultToolkit();
		//Getting clipboard as file upload window
		Clipboard clipBoard2 = toolKit2.getSystemClipboard();
		//Copying string file name to the file upload window
		clipBoard2.setContents(contents2, null);
		System.out.println("File Selection- " +contents2);
		Thread.sleep(5000);
		// This will click on Browse button
		driver.findElement(By.xpath("//*[@id='rtMedia-upload-button']")).click();
		Robot robot2 = new Robot();
		Thread.sleep(1000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
	
		/*Fourth Image*/
		String fileName3 = "hazard"; 
		//Transferable File Name declaration
		StringSelection contents3 = new StringSelection(fileName3);
		//Getting toolkit
		Toolkit toolKit3 = Toolkit.getDefaultToolkit();
		//Getting clipboard as file upload window
		Clipboard clipBoard3 = toolKit3.getSystemClipboard();
		//Copying string file name to the file upload window
		clipBoard3.setContents(contents3, null);
		System.out.println("File Selection- " +contents3);
		Thread.sleep(5000);
		// This will click on Browse button
		driver.findElement(By.xpath("//*[@id='rtMedia-upload-button']")).click();
		Robot robot3 = new Robot();
		Thread.sleep(1000);
		robot3.keyPress(KeyEvent.VK_ENTER);
		robot3.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot3.keyPress(KeyEvent.VK_CONTROL);
		robot3.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot3.keyRelease(KeyEvent.VK_CONTROL);
		robot3.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot3.keyPress(KeyEvent.VK_ENTER);
		robot3.keyRelease(KeyEvent.VK_ENTER);
	
		/*Fifth Image*/
		String fileName4 = "messi"; 
		//Transferable File Name declaration
		StringSelection contents4 = new StringSelection(fileName4);
		//Getting toolkit
		Toolkit toolKit4 = Toolkit.getDefaultToolkit();
		//Getting clipboard as file upload window
		Clipboard clipBoard4 = toolKit4.getSystemClipboard();
		//Copying string file name to the file upload window
		clipBoard4.setContents(contents1, null);
		System.out.println("File Selection- " +contents4);
		Thread.sleep(5000);
		// This will click on Browse button
		driver.findElement(By.xpath("//*[@id='rtMedia-upload-button']")).click();
		Robot robot4 = new Robot();
		Thread.sleep(1000);
		robot4.keyPress(KeyEvent.VK_ENTER);
		robot4.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot4.keyPress(KeyEvent.VK_CONTROL);
		robot4.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot4.keyRelease(KeyEvent.VK_CONTROL);
		robot4.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot4.keyPress(KeyEvent.VK_ENTER);
		robot4.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	
	/*Click On Upload Button*/
		driver.findElement(By.xpath("//*[@id='drag-drop-area']/input")).click();
	
  }
  
		
		 	
  
  @BeforeTest
  public void beforeTest() { System.setProperty("webdriver.chrome.driver","F:/chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("https://qa.rtcamp.net/members/demo/media/album/");
  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
