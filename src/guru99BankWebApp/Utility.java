package guru99BankWebApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Utility {
	public String driverPath = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver3.exe";
		public String baseURL = "http://www.demo.guru99.com/V4/";
		public static WebDriver open (String browserName) {
			if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath);
			return new ChromeDriver(); 
			}else if(browserName.equals("mozilla")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\geckodriver2.exe");
			return new FirefoxDriver();
			}else {
				return new ChromeDriver();
			}
		}
		}
		
		
	
		