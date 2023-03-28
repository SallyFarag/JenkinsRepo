package Test.ProjectA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void facebook() {
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	driver.findElement(By.xpath("//div[@class='large_form']/child::div[11]/button")).click();
		
		
	}

}
