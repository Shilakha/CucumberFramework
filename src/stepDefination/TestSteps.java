package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TestSteps {
	public static WebDriver driver;

	
	@Given("^user navigates to https://www\\.flipkart\\.com/$")
	public void user_navigates_to_https_www_flipkart_com() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shilakha\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		// driver.manage().window().maximize();

	}

	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" to LogIn$")
	
	public void user_enters_and_to_LogIn(String arg1, String arg2) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
		System.out.println(arg2);
		driver.findElement(By.cssSelector("._2zrpKA")).sendKeys("shekhusaini30@gmail.com");
		driver.findElement(By.cssSelector("._3v41xv")).sendKeys("hello123");

		Thread.sleep(1000);

	}

	

	
	@When("^user logins into the site$")
	public void clicks_on_login_button() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		driver.findElement(By.cssSelector("._7UHT_c")).click();
		Thread.sleep(9000);

	}

	
	@Given("^User enters the product name to be search and add it to cart$")
	public void user_enters_the_product_name_to_be_search() throws Exception {

		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement e = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		e.sendKeys("laptops");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 40);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title='HP']//div[@class='_1p7h2j']")));
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//div[@title='HP']//div[@class='_1p7h2j']")).click();

		Thread.sleep(5000);

		List<WebElement> element = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));

		element.get(0).click();

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()= 'BUY NOW' or text() = 'Buy']")).click();

	}
}
