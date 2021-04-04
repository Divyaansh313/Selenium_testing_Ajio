import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchArticle {

	public static void main(String[] args) throws InterruptedException {  

	  // declaration and instantiation of objects/variables  
	  System.setProperty("webdriver.chrome.driver",   "F:\\Study Material\\6th SEM\\Test Automation Lab\\chromedriver.exe");
		
      WebDriver driver=new ChromeDriver();  

	  // Launch website  
	  driver.get("https://www.ajio.com");
	  
	  driver.manage().window().maximize();
	  
	  /*WebElement helloSignIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	  helloSignIn.click();
	  
	  WebElement emailAddress = driver.findElement(By.id("ap_email"));
	  emailAddress.sendKeys("divyaansh03anu@gmail.com");
	  
	  WebElement continueButton = driver.findElement(By.id("continue"));
	  continueButton.click();
	 
	  WebElement password = driver.findElement(By.id("ap_password"));
	  password.sendKeys("**********");
	  
	  WebElement loginButton = driver.findElement(By.id("signInSubmit"));
	  loginButton.click();*/
	  
	  WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[3]/div[2]/form/div/div/input"));
	  search.sendKeys("NIKE Revolution 5 Lace-Up Sports Shoes");
	  
	  WebElement searchbutton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[3]/div[2]/form/div/button/span"));
	  searchbutton.click();

	  WebElement name = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/div/div[2]/div[2]"));
	  name.isDisplayed();
	  
	  WebElement image = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/div/div[1]/img"));
	  image.isDisplayed();
	  
	  WebElement price = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/div/div[2]/div[3]/span"));
	  price.isDisplayed();
	  }  
	}
