package Test.ProjectA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test_A {
	public static WebDriver driver;
	public static ChromeOptions options;

	@Test
	public static void t1() throws InterruptedException {

		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("fromCity"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder = 'from']")).sendKeys("NEW YORK");
        Thread.sleep(2000);        
        driver.findElement(By.id("toCity")).click();
        driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("BOSTON");

	}

}
