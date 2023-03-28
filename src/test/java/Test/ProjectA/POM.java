package Test.ProjectA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM {
	
	WebDriver driver = new ChromeDriver();
	@Test
	public void rediff() {
		
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("sally.farag");
		driver.findElement(By.id("password")).sendKeys("10399Mark$");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.className("rd_rediff")).click();
		driver.findElement(By.cssSelector("a.shopicon.relative")).click();
		driver.findElement(By.partialLinkText("rediff")).click();
		driver.findElement(By.className("vdicon")).click();
		driver.findElement(By.xpath("//a[@title='Rediff.com Home']")).click();
		driver.findElement(By.xpath("//a[@class='moneyicon relative']")).click();
		driver.findElement(By.xpath("//div[@id='moremoney']//ul[@class='ul_top_tabs floatL']//li[6]//a[@onclick='return topbar_logurl(this);']")).click();
        String Text =driver.findElement(By.xpath("//a[contains(text(),'Sanjivani parant')]/self::a")).getText();
        System.out.println(Text);
        Text=driver.findElement(By.xpath("//a[contains(text(),'Sanjivani parant')]/parent::td")).getText();
        System.out.println(Text);
        Text=driver.findElement(By.xpath("//a[contains(text(),'Sanjivani parant')]/ancestor::tr")).getText();
        System.out.println(Text);
        int numb =driver.findElements(By.xpath("//a[contains(text(),'Sanjivani parant')]/ancestor::tr/child::td")).size();
		System.out.println(numb);
		numb =driver.findElements(By.xpath("//a[contains(text(),'Sanjivani parant')]/ancestor::tr/descendant::td")).size();
		System.out.println(numb);


		
	}

}
