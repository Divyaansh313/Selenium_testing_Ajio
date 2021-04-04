import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioLogin {

	public static void main(String[] args) throws InterruptedException {  

	  // declaration and instantiation of objects/variables  
	  System.setProperty("webdriver.chrome.driver", "F:\\Study Material\\6th SEM\\Test Automation Lab\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();  

	  // Launch Website  
	  driver.get("https://www.ajio.com");
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/span")).click();
	  
	  WebElement phonenumber = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div/form/div[2]/div[1]/label/input"));
	  phonenumber.sendKeys("9425847168");
	  
	  WebElement continueButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div/form/div[2]/div[2]/input"));
	  continueButton.click();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	  driver.findElement(By.name("password")).sendKeys("asdfghj");
	  
	  WebElement enterButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div/div/div[2]/form/div[3]/input"));
	  enterButton.click();
	  
	  }  
	}