package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {
	WebDriver driver;
	
  @Test//(threadPoolSize =3,invocationCount = 3, timeOut = 3000 )
  public void testcase1() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.navigate().to("http://www.google.com");
	  System.out.println("Test case 1 " + Thread.currentThread().getId());
	  
  }
  
  @Test//(threadPoolSize =3,invocationCount = 3, timeOut = 3000 )
  public void testcase2() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.navigate().to("http://www.google.com");
	  System.out.println("Test case 2 " + Thread.currentThread().getId());
	  
  }
  
  
}
