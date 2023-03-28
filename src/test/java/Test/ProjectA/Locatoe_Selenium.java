package Test.ProjectA;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Locatoe_Selenium {
	public static WebDriver driver;
	public static ChromeOptions options;

	@Test
	public void test() {

		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
        driver.get("https://www.rediff.com/");
        
        WebElement referencePoint = driver.findElement(By.xpath("//p[contains(text(),'Password']"));
        String aboveElement = driver.findElement(with(By.tagName("p")));
	}

}
