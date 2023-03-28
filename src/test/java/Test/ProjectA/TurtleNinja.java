package Test.ProjectA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TurtleNinja {

	WebDriver driver = new ChromeDriver();
	@Test
	public void TurtleNinj() {
		
	driver.manage().window().maximize();
	driver.get("http://tutorialsninja.com/demo/");
	int sliders=driver.findElements(By.className("dropdown")).size();	
	System.out.println(sliders);
	 int ele=driver.findElements(By.tagName("div")).size();
	 System.out.println(ele);
	driver.findElement(By.xpath("//a[normalize-space()='Cameras']")).click();
    driver.findElement(By.xpath("//img[@title='Samsung Galaxy Tab 10.1']")).click();

	}
}
