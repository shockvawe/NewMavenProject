package MavenTestingProject.NewMavenProject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;

import org.testng.annotations.BeforeClass;

import java.awt.desktop.AboutEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class DependenciesExample {
	WebDriver driver;
	@BeforeClass
	@Test
	  public void beforeClass() {
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:\\Users\\satos\\OneDrive\\Desktop\\chromedriver.exe");
			 */
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		
		driver.get("https://www.selenium.dev/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }
  @Test
  (dependsOnMethods ="beforeClass")
  public void testcase1() {
	 driver.findElement(By.xpath("//*[@id='navbarDropdown']")).click();
	WebElement aboutlink=driver.findElement
	(By.xpath("//a[@class='dropdown-item'][normalize-space()='About Selenium']")); 
	 aboutlink.click();
	   }

  @Test
  (dependsOnMethods = "testcase1")
  public void testcase2() {
   driver.findElement(By.xpath("//a[normalize-space()='Read full story']")).click();
	WebElement Text=driver.findElement(By.xpath("//h2[normalize-space()='The story starts in 2004']"));
	 String newtext=Text.getText();
	  System.out.println("Printed Text " + newtext);
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
