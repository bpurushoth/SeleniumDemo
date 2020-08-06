package Google.Google;  
import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  
public class test {  
public String baseUrl1 = "https://www.google.com/";
public String baseUrl2 = "https://twingo.techmahindra.com/"; 
String driverPath2= "/usr/bin/chromedriver";  
String driverPath1 = "chromedriver.exe"; 
public WebDriver driver ;   
@Test(enabled=true)             
public void google() {      
// set the system property for Chrome driver      
System.setProperty("webdriver.chrome.driver", driverPath1);  
// Create driver object for CHROME browser  
ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.addArguments("--headless");
chromeOptions.addArguments("--no-sandbox");

WebDriver driver3 = new ChromeDriver(chromeOptions); 
driver3.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
driver3.manage().window().maximize();  
driver3.get(baseUrl1);  
// get the current URL of the page  
String URL= driver3.getCurrentUrl(); 
String title1 = driver3.getTitle();
String ExpectedTitle1 = "Googl";
Assert.assertEquals(title1, ExpectedTitle1);
System.out.print(URL);  
//get the title of the page  
                  
System.out.println(title1); 
//driver1.quit(); 
}  
@Test(enabled=true)             
public void twingo() {      
// set the system property for Chrome driver      
System.setProperty("webdriver.chrome.driver", driverPath1);  
// Create driver object for CHROME browser  
ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.addArguments("--headless");
chromeOptions.addArguments("--no-sandbox");

WebDriver driver4 = new ChromeDriver(chromeOptions); 
driver4.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
driver4.manage().window().maximize();  
driver4.get(baseUrl2);  
// get the current URL of the page  
String URL= driver4.getCurrentUrl(); 
String title2 = driver4.getTitle();
String ExpectedTitle2 = "Sign in to your account";
Assert.assertEquals(title2, ExpectedTitle2);
System.out.print(URL);  
//get the title of the page  
                  
System.out.println(title2); 
}
@BeforeTest  
public void beforeTest() {    
System.out.println("before test");  
}    
/*@AfterTest  
public void afterTest() {  
driver.quit();  
System.out.println("after test");  
}    */  
}  

