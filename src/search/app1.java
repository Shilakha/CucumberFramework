package search;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class app1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SOFTWARES\\New folder\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.cssSelector("._2zrpKA"));
		ele1.sendKeys("shekhusaini30@gmail.com");

		WebElement ele2 = driver.findElement(By.cssSelector("._3v41xv"));
		ele2.sendKeys("hello123");

		WebElement ele3 = driver.findElement(By.cssSelector("._7UHT_c"));
		ele3.click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("laptops");
		
	}
}
