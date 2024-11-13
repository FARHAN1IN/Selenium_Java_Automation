import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 class Tproject {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hamada Salim G-Trd\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	//driver.manage().window().maximize();
    	driver.get("https://practicetestautomation.com/practice-test-login/");
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	try
    	{
    		WebElement username = driver.findElement(By.id("username"));
    		WebElement password = driver.findElement(By.id("password"));
    		WebElement submit = driver.findElement(By.className("btn"));
    		
    		username.sendKeys("student");
    		password.sendKeys("Password123");
    		submit.click();		
        }
    	catch(Exception e) {
    		System.out.println("Error");
    	}finally {}
    }
}
