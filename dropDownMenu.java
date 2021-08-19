package Week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownMenu {

	public static void main(String[] args) {
		
             WebDriverManager.chromedriver().setup();
             ChromeDriver driver = new ChromeDriver();
             driver.get("http://leaftaps.com/opentaps");
             String title1= driver.getTitle();
             System.out.println(title1);
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
             
             //Locate Username and enter username
             driver.findElement(By.id("username")).sendKeys("demosalesmanager");
             
             //Locate Pwd and enter pwd
             driver.findElement(By.id("password")).sendKeys("crmsfa");
             
             //Click Login button
             driver.findElement(By.className("decorativeSubmit")).click();
             
             //Select CRM/SFA
             driver.findElement(By.linkText("CRM/SFA")).click();
             
             //Select Leads
             driver.findElement(By.linkText("Leads")).click();
             
             //Select Create Leads
             driver.findElement(By.linkText("Create Lead")).click();
             
             //locate and enter company
             driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
             
             //locate and enter first and last name
             driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raji");
             driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mani");
             
             //For dropdown selection
                WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
     	    	Select drpDwn = new Select(drop1);	
     	    	drpDwn.selectByIndex(1);
     	    	
     	    	WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
     	    	Select drpdwn1 = new Select(drop2);
     	    	drpdwn1.selectByValue("CATRQ_CARNDRIVER");
     	    	
     	    	WebElement drop3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
     	    	Select drpdwn2 = new Select(drop3);
     	    	drpdwn2.selectByVisibleText("Health Care");
     	    	
     	    	WebElement drop4 = driver.findElement(By.id("createLeadForm_currencyUomId"));
     	    	Select drpdwn3 = new Select(drop4);
     	    	drpdwn3.selectByValue("DZD");
     	    	
	}

}
