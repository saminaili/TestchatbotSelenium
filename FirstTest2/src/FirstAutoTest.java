import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstAutoTest {
@Test
	public void logintest() {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://chatbotmanager.netlify.app/#/home");
		//driver.findElement(By.xpath("dffhgjghggfbgfhthhtrgrgdg")).click();
		driver.findElement(By.id("input-23")).sendKeys("guppul@gmail.com");
		driver.findElement(By.id("sign-in")).click();
		String Message =driver.findElement(By.id("create")).getText();
assertEquals(Message,"Please sign in");	


}
	
	
}
