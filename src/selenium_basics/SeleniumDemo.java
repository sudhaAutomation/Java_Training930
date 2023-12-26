package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\geckodriver.exe");
//
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
//		driver.manage().window().maximize();
//		
//		System.setProperty("webdriver.edge.driver",
//				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\msedgedriver.exe");
//
//		WebDriver driver1 = new EdgeDriver();
//		driver1.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
//		driver1.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.manage().window().maximize();
//		driver.close();
//		driver1.close();
//		driver2.close();
//		

	}

}
