package seleniumProject1;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class whatNewTab {
WebDriver driver;

@BeforeSuite
public void openBrowser() throws InterruptedException
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://magento.softwaretestingboard.com/");
	Thread.sleep(3000);
}
@Test(priority=1)
public void whatsNewTab()
{
	driver.findElement(By.id("ui-id-3")).click();
}
@Test(priority=2)
public void women()
{
	driver.findElement(By.id("ui-id-4")).click();
	driver.findElement(By.linkText("Tees")).click();
}
	@Test(priority=3)
	public void style() throws InterruptedException
	{
		List<WebElement>Style=driver.findElements(By.xpath("//div[@id='narrow-by-list']/child::div[@class='filter-options-item']"));
		Thread.sleep(3000);
		System.out.println("total number of styles "+Style.size());
		for(int i=0;i<Style.size();i++)
		{
			String StyleNames=Style.get(i).getText();
			System.out.println(StyleNames);
		}
	}
	@Test(priority=4)
	public void selectStyle() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@id='narrow-by-list']/child::div[@class='filter-options-item'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Tiffany Fitness Tee")).click();
		driver.findElement(By.xpath("//div[@id=\"option-label-size-143-item-169\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"option-label-color-93-item-59\"]")).click();
		
		WebElement quantity=driver.findElement(By.id("qty"));
		quantity.clear();
		quantity.sendKeys("2");
		quantity.click();
		
		
		WebElement addToCart=driver.findElement(By.xpath("//button[@title=\"Add to Cart\"]"));
		
		if(addToCart.isEnabled())
		{
			System.out.println("AddToCart is enabled");
		}
		else
		{
			System.out.println("AddToCart is not enabled");
		}
		addToCart.click();
		Thread.sleep(3000);
	}
	
		@Test(priority=5)
		public void women1()
		{
			driver.findElement(By.id("ui-id-4")).click();
			driver.findElement(By.linkText("Pants")).click();
			driver.findElement(By.linkText("Cora Parachute Pant")).click();
			driver.findElement(By.id("id=\"option-label-size-143-item-172\"")).click();
			driver.findElement(By.id("id=\"option-label-color-93-item-59\"")).click();
			driver.findElement(By.xpath("//button[@title=\"Add to Cart\"]")).click();
			
		}

	@Test(priority=6)
	public void cart() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		}
	@Test(priority=7)
	public void proceedCheckOut()
	{
		driver.findElement(By.linkText("View and Edit Cart")).click();
	}
	
	
}
	
	

