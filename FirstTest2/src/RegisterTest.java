

		
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class RegisterTest {
	WebDriver driver;
	@BeforeTest
	void Setup() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://chatbotmanager.netlify.app/#/home");	
	}
	@Test
public void RegisterWithoutEmailAndPssword() {
		
		
		driver.findElement(By.xpath("Register")).click();
		(driver.findElement(By.id("input-13")).sendKeys("Sami")));
		
		driver.findElement(By.id("register")).click();
		String Message =driver.findElement(By.id("ErrorsMessage")).getText();
assertEquals(Message,"Please sign in");	


}
public void RegisterWithoutNameAndPssword() {
		
	
		driver.findElement(By.xpath("Register")).click();
		(driver.findElement(By.id("input-13")).sendKeys("nnaili.sami@gmail.com")));
		
		driver.findElement(By.id("register")).click();
		String Message =driver.findElement(By.id("ErrorsMessage")).getText();
assertEquals(Message,"Please sign in");	


}
public void RegisterWithoutEmailAndName() {
	
	
	driver.findElement(By.xpath("Register")).click();
	(driver.findElement(By.id("input-13")).sendKeys("125dhtre5844")));
	
	driver.findElement(By.id("register")).click();
	String Message =driver.findElement(By.id("ErrorsMessage")).getText();
assertEquals(Message,"Please sign in");	


}
@AfterTest
public void Testdown(){
	driver.close();
	
}
	
}
