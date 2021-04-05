import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Login extends BaseTest{
	
	  
	  @DataProvider(name="FirstDataProvider")
	  public Object[][] dp() throws IOException, InterruptedException{
			Object[][] data = new Object[2][2];
			int x=0;
			FileInputStream fis= new FileInputStream("F:\\Study Material\\6th SEM\\Test Automation Lab\\Ajio_excel\\testing_selenium.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet login= wb.getSheet("Login");
			String user="";
			String pwd="";
			for(int i=1;i<=login.getLastRowNum();++i) {
				XSSFRow row= login.getRow(i);
				if(row.getCell(0).getCellType()==CellType.NUMERIC) {
					user= row.getCell(0).getRawValue();
				}
				else {
					user=row.getCell(0).toString();
				}
				
				pwd= row.getCell(1).toString();
				
				 data[x][0]=user;
				    data[x][1]= pwd;
				    ++x;
			}
		  
	     
	    //return data
			
	    return data;
	}
	
	
	  @Test(dataProvider = "FirstDataProvider")
	  public void userLogin(String user, String pass) {
		  test.log(LogStatus.INFO, "User Login");
		 

		try {
		  System.setProperty("webdriver.chrome.driver","F:\\Study Material\\6th SEM\\Test Automation Lab\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();  

		  // Launch website  
			 driver.navigate().to("https://www.ajio.com/");
		  
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[1]/ul/li[1]/span")).click();
		  driver.findElement(By.name("username")).sendKeys(user);
		  
		  driver.findElement(By.className("login-btn")).click();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	driver.findElement(By.name("password")).sendKeys(pass);
	driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/div/div[2]/form/div[3]/input\r\n")).click();
    test.log(LogStatus.PASS, "user login pass");

		}catch(Exception e) {
			test.log(LogStatus.FAIL, "Login Fail");
			 test.log(LogStatus.ERROR, e);
		}
	} 
}

