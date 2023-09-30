package MavenTestingProject.NewMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class reporterLog {
	WebDriver driver;
	@Test
	public void tc1() {
		Reporter.log("Setting the browser "+ true);
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	}
	
	@Test
	public void tc2() {
		
		WebElement linktext=driver.
	findElement(By.xpath("//span[normalize-space()='Downloads']"));
		linktext.click();
	}
}
