package search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class demo {
	
	private static final String ADDRESS = "http://www.flipkart.com";
	private static final String SEARCH_BOX = "fk-top-search-box";
	private static final String SEARCH_RESULT = "//li[contains(text(),'in')]//span";
	private static final String BOOK_NAME = "//a[contains(text(),' Design Patterns and Best Practices (English) (Paperback) ')]";
	private static final String ADD_TO_CART = "input[data-buy-listing-id='LSTBOK9781783982707JPMTAC'][value='Add to Cart']";
	private static final String VIEW_CART_CSS = "a[href='/viewcart']";
	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shilakha\\eclipse-workspace\\myApp\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		
		driver.get(ADDRESS);
		
		//driver.manage().window().maximize();
		
		login(driver);
		
		driver.findElement(By.id(SEARCH_BOX)).sendKeys("Selenium");
		
		WebElement seleniumSearchResult = fluentWait(By.xpath(SEARCH_RESULT), driver);
		
		seleniumSearchResult.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BOOK_NAME)))
			.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(ADD_TO_CART)))
			.click();
		
		fluentWait(By.cssSelector(VIEW_CART_CSS), driver).click();
		fluentWait(By.cssSelector("form[id='view-cart-form'] button"), driver).click();
		fluentWait(By.xpath("//a[text() = 'Continue']"), driver).click();
		fluentWait(By.cssSelector("input[ng-model='paymentConfig.cod.captchaValue']"), driver).sendKeys("xxxx");
	}
	
	public static WebElement fluentWait(final By locator, WebDriver driver)
	{
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
									 .withTimeout(30,TimeUnit.SECONDS)
									 .pollingEvery(5, TimeUnit.SECONDS)
									 .ignoring(NoSuchElementException.class);
		
		
		WebElement element = wait.until(new Function<WebDriver,WebElement>() {

			@Override
			public WebElement apply(WebDriver arg0) {
				return arg0.findElement(locator);
			}

		});
		
		return element;
	}
	
	public static void login(WebDriver driver)
	{
		//driver.findElement(By.linkText("Login")).click();
		
		//TODO: Give your username and password of flipkart
		fluentWait(By.cssSelector("input[placeholder='Enter email/mobile']"), driver).sendKeys("shekhusaini30@gmail.com");
		fluentWait(By.cssSelector("input[placeholder='Enter password']"), driver).sendKeys("hello123");
		fluentWait(By.cssSelector("input[value='Login'][class='submit-btn login-btn btn']"), driver).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
