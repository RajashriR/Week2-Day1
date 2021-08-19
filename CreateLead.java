package Week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {

		// Step 1
		WebDriverManager.chromedriver().setup();

		// Step 2
		// Launch chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Step 3
		// Load an url->get
		driver.get("http://leaftaps.com/opentaps");

		// Step 4
		// Print the title
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		// maximize the window
		driver.manage().window().maximize();

		// wait for defined elements
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step 5:Locate the user name and enter user name as demosalesmanager

		WebElement webUser = driver.findElement(By.id("username"));
		webUser.sendKeys("demosalesmanager");

		// Step6:Locate the password amd enter the password as CRMSFA
		WebElement webPwd = driver.findElement(By.id("password"));
		webPwd.sendKeys("crmsfa");

		// Step7:Locate and click the Login button * // login button
		WebElement sub = driver.findElement(By.className("decorativeSubmit"));
		sub.click();

		// Step 8:Locate and click on CRMSFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//check if we have landed on the correct login page
		String title ="My Home | opentaps CRM";
		String homeTitle = driver.getTitle();
        if (title.equals(homeTitle))
        {
        	System.out.println("We have landed on the correct homepage");
        }
        else
        {
        	System.out.println("It is not the correct home page");
        }
        	/*
		 * /create lead driver.findElementByLinkText("create lead").click();
		 * driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf1"
		 * ); driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raji");
		 * driver.findElement(By.id("createLeadForm_lastName")).sendKeys("mmjn");
		 * WebElement webElement1 =
		 * driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		 * webElement1.clear();
		 * driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys(
		 * "91");
		 * 
		 * 
		 * driver.findElement(By.)t
		 */
	}

}
