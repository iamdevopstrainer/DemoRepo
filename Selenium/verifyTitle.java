package selTesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTitle {
	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://www.edureka.co");
       String x = driver.getTitle();
       System.out.println(x);
	}
}
