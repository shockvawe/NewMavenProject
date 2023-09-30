import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class WebApplicationTest {
	WebDriver driver;
	
	  @Test
	  public void testcase1() {
		  
		  driver.findElement(By.xpath("//*[@id='navbarDropdown']")).click();
		  WebElement Aboutlink=driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='About Selenium']"));
		  Aboutlink.click();
		  String title=driver.getTitle();
		  System.out.println("Expected title is " + title);
		  
		  Assert.assertEquals(title, "About Selenium | Selenium");
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\satos\\OneDrive\\Desktop\\chromedriver.exe");
		   driver=new ChromeDriver();
		  driver.navigate().to("https://www.selenium.dev/");
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
	  }

	  @AfterClass
	  public void afterClass() {
		  
		  driver.quit();
	  }

}
