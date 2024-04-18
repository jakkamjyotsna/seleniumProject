package seleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CreateAccountPage {
	WebDriver driver;
@BeforeSuite
public void openUrl() throws InterruptedException {
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://magento.softwaretestingboard.com/");
	Thread.sleep(3000);
}
@Test
public void createAccount() throws InterruptedException {
	driver.findElement(By.linkText("Create an Account")).click();
	driver.findElement(By.id("firstname")).sendKeys("jyotsna");
	driver.findElement(By.id("lastname")).sendKeys("jakkam");
	driver.findElement(By.id("email_address")).sendKeys("jakkam.jyotsna@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Asdf@1234jk");
	driver.findElement(By.id("password-confirmation")).sendKeys("Asdf@1234jk");
	driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("click here")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("email_address")).sendKeys("jakkam.jyotsna@gmail.com");
	driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
}
	

}
