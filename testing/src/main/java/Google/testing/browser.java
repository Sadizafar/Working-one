package Google.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class browser {
static WebDriver driver;
	// TODO Auto-generated method stub


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\17034\\eclipse-workspace\\testing\\driver\\chromedriver.exe");
driver=new ChromeDriver();
		
		
		
driver.manage ().window().maximize();	
driver.navigate().back();
driver.navigate().forward();
;

String windows=driver.getWindowHandle();

String K1=driver.getCurrentUrl();
//driver.close();


String title=driver.getTitle();
System.out.println(title);

driver.get("https://www.jquery.com");

WebElement  UserField=  driver.findElement(By.id("email"));
UserField.sendKeys("Sadi");



//WebElement Forgotit=driver.findElement(By.partialLinkText("forgot password"));
//Forgotit.click();

driver.findElement(By.linkText("create new account")).click();

WebElement signbt=driver.findElement(By.xpath("//button[@type='submit']"));  


WebElement WebElement = driver.findElement(By.xpath("//*[contains(text(),'Forgot']"));


		




	}
}
