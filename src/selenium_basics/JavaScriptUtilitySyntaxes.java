package selenium_basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JavaScriptUtilitySyntaxes {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		// driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.location='https://html.com/input-type-file/'");
		driver.get("https://html.com/input-type-file/");

		// js.executeScript("arguments[0].scrollIntoView()",
		// driver.findElement(By.xpath("//input[@id='fileupload']")));
		// driver.findElement(By.xpath("//input[@id='fileupload']"))
		// .sendKeys("C:\\Users\\SWHIZZ
		// TECHNOLOGIES\\Downloads\\Testing\\pics\\Admin.html");
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("alert('url lunached to input-type-file')");
		driver.switchTo().alert().accept();
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//input[@id='fileupload']")));
		js.executeScript("arguments[0].style.border='solid 3px green'",
				driver.findElement(By.xpath("//input[@id='fileupload']")));
		ScreenshotBySelenium.getScreenShot(driver, "inputfile");
		js.executeScript("argumnets[0].scrollIntoView()",driver.findElement(By.xpath("")));
		js.executeScript("arguments[0].style.border='solid 3px Green");
		js.executeScript("alert('url launched succesfully')");
	}

}
