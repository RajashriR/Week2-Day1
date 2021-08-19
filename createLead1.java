package Week2Day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createLead1 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		
		WebElement sub = driver.findElement(By.className("decorativeSubmit"));
		sub.click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Create lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter text in company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raja");
		
		//clearing country code
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("4");
		
		//Clicking create Lead
		driver.findElement(By.className("smallSubmit")).click();
	}

}
