package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	static WebDriver  driver ;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.switchTo().frame(driver.findElement(
				By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
	//	driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		selectDate("10", "November 2025", true);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		selectDate("20", "June 2020", false);		
	}

	public static void selectDate(String expDt, String expMonthyr, boolean isNext) {
		
		while (true) {
			String actmonthyr = driver.findElement(By.className("ui-datepicker-title")).getText();
			if (actmonthyr.equals(expMonthyr)) {
				driver.findElement(By.xpath("//a[contains(text(),'"+expDt+"')]")).click();
				break;
			} else if(isNext){
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			}
			else {
				driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			}
		}
	}

}
