package MavenTestingProject.NewMavenProject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
public class ParametersExample {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void testcase1(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.navigate().to("http://www.google.com");
			System.out.println("Tested Successfully");
		}else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.navigate().to("http://www.google.com");
			System.out.println("Tested Successfully");
			
		}
		
		
	}

	
}
