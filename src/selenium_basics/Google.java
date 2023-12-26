package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		// driver.findElement(By.linkText("Gmail")).click();
		WebElement searchbox = driver.findElement(By.id("APjFqb"));
		int linksinthehomepage = driver.findElements(By.tagName("a")).size();
		System.out.println("linksinthehomepage are " + linksinthehomepage);
		// searchbox.sendKeys("images of software Testing");
		// searchbox.sendKeys(Keys.ENTER);

		// driver.findElement(By.partialLinkText("Imag")).click();
		driver.close();
	}

}
