package guru99BankWebApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NegativeTestScenarioUserLogin {
	@Parameters({"UserID","password"})
	@Test 
	public void Demo(String UserID,String password) {
		//1. Navigate to homepage
		String baseURL = "http://www.demo.guru99.com/V4/"; 
		//String driverPath = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver3.exe";
		String driverPath  = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\geckodriver2.exe";
	
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver;
		driver = new FirefoxDriver();
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		/*
		System.setProperty("webdriver.chrome.driver", driverPath); 
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get(baseURL);
		*/
//2. Enter user credentials 
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(UserID);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(password);
		
//3. Login with credentials
		driver.findElement(By.cssSelector("body > form:nth-child(21) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > input:nth-child(1)")).click();
		
//5. Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//4. Validate Login 
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("/html/head/title")).getText());
		System.out.println(UserID);
		System.out.println(password);
	}
}
