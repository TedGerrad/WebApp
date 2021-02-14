package guru99BankWebApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class freshaccount { 

	@BeforeClass
	public void befoclass() {
		System.out.println("before executing any methods in the class");
	}
	@Parameters({"URL"})
	@Test
	public void webloginBankPage(String urlname) {
		System.out.println("webloginBank");
		System.out.println(urlname);
	}
	
	//public String baseUrl = "http://www.demo.guru99.com/V4/";
	String driverPath = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver3.exe"; 
	//String driverPath  = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\geckodriver.exe"; 
	
	public WebDriver driver; 
	//public String expected = null; 
	//public String actual = null;
	
	@BeforeTest 
	public void launchBrowser() {
		System.out.println("Launch Chrome browser");
		System.setProperty("webdriver.chrome.driver",driverPath); 
		 driver = new ChromeDriver();  
		//  driver.get(baseUrl);
	}
	
	
	 String launchPageHeading = "//h3[text()='Guru99 Bank']";	
	    final String userName_element = "//input[@name='uid']", password_element = "//input[@name='password']",	
	            signIn_element = "//input[@name='btnLogin']";	
	    final String userName_value = "mngr28642", password_value = "ydAnate";	
	    final String managerID = "//td[contains(text(),'Manger Id')]";	
	    final String newCustomer = "//a[@href='addcustomerpage.php']", fundTransfer = "//a[@href='FundTransInput.php']";	
	
	    /**	
	     * This test case will initialise the webDriver	
	     */	
	    @Test(groups = { "bonding", "strong_ties" })	
	    public void tc01LaunchURL() {	
	        driver.manage().window().maximize();	
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	        driver.get("http://www.demo.guru99.com/V4/");	
	    }	

	    /**	
	     * Will check the presence of Heading on Login Page	
	     */	
	    @Test(groups = { "bonding" })	
	    public void tc02VerifyLaunchPage() {	
	        Assert.assertTrue(driver.findElement(By.xpath(launchPageHeading)).isDisplayed(),	
	                "Home Page heading is not displayed");	
	        System.out.println("Home Page heading is displayed");	
	    }	

	    /**	
	     * This test case will enter User name, password and will then click on	
	     * signIn button	
	     */	
	    @Test(groups = { "bonding", "strong_ties" })	
	    public void tc03EnterCredentials() {	
	        driver.findElement(By.xpath(userName_element)).sendKeys(userName_value);	
	        driver.findElement(By.xpath(password_element)).sendKeys(password_value);	
	        driver.findElement(By.xpath(signIn_element)).click();	
	    }	

	    /**	
	     * This test case will verify manger's ID presence on DashBoard	
	     */	
	    @Test(groups = { "strong_ties" })	
	    public void tc04VerifyLoggedInPage() {	
	        Assert.assertTrue(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).isDisplayed(),	
	                "Manager ID label is not displayed");	
	        System.out.println("Manger Id label is displayed");	
	    }	

	    /**	
	     * This test case will check the presence of presence of New customer link	
	     * And FundTransfer link in Left pannel	
	     */	
	    @Test(groups = { "bonding" })	
	    public void tc05VerifyHyperlinks() {	
	        Assert.assertTrue(driver.findElement(By.xpath(newCustomer)).isEnabled(),	
	                "New customer hyperlink is not displayed");	
	        System.out.println("New customer hyperlink is displayed");	

	        Assert.assertTrue(driver.findElement(By.xpath(fundTransfer)).isEnabled(),	
	                "Fund Transfer hyperlink is not displayed");	
	        System.out.println("Fund Transfer hyperlink is displayed");	
	    }	
    }	



//}
