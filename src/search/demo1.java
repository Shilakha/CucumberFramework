package search;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {

  WebDriver webDriver;

  String expecteTitle = "";
 String actualValue;

 public void launchingIEBrowser() {

   
	 System.setProperty("webdriver.chrome.driver",
				"D:\\SOFTWARES\\New folder\\Drivers\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
  webDriver = new ChromeDriver();
  webDriver.manage().window().maximize();
  webDriver.manage().deleteAllCookies();
  webDriver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

  }



  @Test
 public void testScript() throws InterruptedException {

   webDriver.get("https://www.flipkart.com");
  actualValue = webDriver.getTitle();
  if (actualValue.equalsIgnoreCase(expecteTitle)) {

    Actions a = new Actions(webDriver);
   a.moveToElement(
     webDriver.findElement(By
       .xpath("//span[text()='Electronics']"))).build()
     .perform();
   Thread.sleep(2000);

    // clcik on mobiles
   webDriver
     .findElement(
       By.xpath("//*[@id='submenu_electronics']/div[2]/div[1]/ul[1]/li[1]/a"))
     .click();
   Thread.sleep(2000);

    // click on samsung
   webDriver.findElement(
     By.xpath("//*[@data-tracking-id='Top Brands_Samsung']"))
     .click();
   Thread.sleep(2000);

    // select the price range
   webDriver.findElement(
     By.xpath("//*[@id='price_range']/li[2]/a/span[1]")).click();
   Thread.sleep(3000);

    // click on moblie
   webDriver.findElement(
     By.xpath("//*[@class='pu-visual-section']/a[1]")).click();
   ;
   Thread.sleep(3000);
  }

  }

}