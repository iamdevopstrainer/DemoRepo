package SelJavaProj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selwebelements {

	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	   ChromeDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   driver.get("https://www.facebook.com/");
	   driver.findElement(By.id("u_0_m")).sendKeys("Devops");
	   driver.findElement(By.id("u_0_o")).sendKeys("Trainer");
	   driver.findElement(By.name("reg_email__")).sendKeys("iamdevopstrainer@gmail.com");
	   driver.findElement(By.name("reg_email_confirmation__")).sendKeys("iamdevopstrainer@gmail.com");
	   driver.findElement(By.name("reg_passwd__")).sendKeys("Sample@123");
	   driver.findElement(By.name("birthday_day")).sendKeys("01");
	   driver.findElement(By.name("birthday_month")).sendKeys("Jan");
	   driver.findElement(By.name("birthday_year")).sendKeys("1980");
	   WebElement radio_male = driver.findElement(By.id("u_0_7"));
	   radio_male.click();
	   //driver.findElement(By.name("websubmit")).click();
	}

}