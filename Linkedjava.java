package Week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkedjava {
 public static void main(String[] args) {
	 
	WebDriverManager.chromedriver().setup();
	
	//Launch chrome browser
	ChromeDriver driver=new ChromeDriver();
	
	//Load an url->get
	driver.get("http://leaftaps.com/opentaps");
	
	//Print thet title
	String title1 = driver.getTitle();
	//maximize
	System.out.println(title1);driver.manage().window().maximize();
	//wait for defined elements
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
//Locate thr username 
	WebElement webUser = driver.findElement(By.id("username"));
	webUser.sendKeys("demosalesmanager");
	//locate pwd
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
//login button
	driver.findElement(By.className("decorativeSubmit")).click();
	//click on crm
	driver.findElement(By.linkText("CRM/SFA")).click();
	//verify home page
	String hometitle = driver.getTitle();
	String title="My home | opentags CRM";
	if(title.equals(hometitle))
	{
		System.out.println("In home page");
	}
	else
		System.out.println("Not in home page" );
	
}

}
