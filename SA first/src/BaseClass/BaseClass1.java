package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BaseClass1 {

	public  static void Open() throws IOException{
	FileInputStream fis= new FileInputStream("C:\\Users\\Srini Talasani\\Desktop\\SOUTHAFRICA\\SA first\\OR.properties");
	Properties pro= new Properties();
	pro.load(fis);
	
	
	WebDriver driver = new FirefoxDriver();
	driver.get(pro.getProperty("URL"));
	System.out.println("Website opened");
	System.out.println("getCurrentUrl");
	System.out.println("getTitle");
	driver.manage().window().maximize();
	driver.findElement(By.name("txtUserName")).sendKeys(pro.getProperty("userID"));
	driver.findElement(By.name("txtPassword")).sendKeys(pro.getProperty("pwd"));
	driver.findElement(By.name("Submit")).click();
	System.out.println("loged in");
	Reporter.log("loged in");
		}


}