package sachin.addressbook;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class addContact {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver;
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		//driver = new ChromeDriver();
	    driver.get("http://35.222.9.186:9090/addressbook");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    			
		System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");
		
		driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("SampleA");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("SampleB");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("9876543210");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
				
		Thread.sleep(5000);
		
		driver.close();
		
		}

}
