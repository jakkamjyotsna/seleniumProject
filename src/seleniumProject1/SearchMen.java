package seleniumProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SearchMen {
	WebDriver driver;

	@BeforeSuite
	public void menSearch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void men() {
		driver.findElement(By.id("ui-id-5")).click();
	}

	@Test(priority = 2)
	public void bottoms() throws InterruptedException {
		driver.findElement(By.linkText("Bottoms")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void men1() {
		driver.findElement(By.id("ui-id-5")).click();
	}

	@Test(priority = 4)
	public void tops() {
		driver.findElement(By.linkText("Tops")).click();
	}

	@Test(priority = 5)
	public void catogery() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='filter-options']/child::div[1]")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void jackets() throws InterruptedException {
		driver.findElement(By.xpath(
				"//ol[@class='items']/child::li[@class='item']/child::a[@href='https://magento.softwaretestingboard.com/men/tops-men.html?cat=14']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Proteus Fitness Jackshirt")).click();
	}

	@Test(priority = 7)
	public void addToCart() throws InterruptedException {
		driver.findElement(By.id("option-label-size-143-item-168")).click();
		driver.findElement(By.xpath("//div[@option-label='Blue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();

	}
}
