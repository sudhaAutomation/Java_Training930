package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileActivities {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		conditionalMethods();
		//download();
		//upload();
	}

	public static void conditionalMethods() {
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		System.out.println(driver.findElement(By.xpath("//textarea[@id='textbox']")).isDisplayed());//true//text area
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Testing sample");
		System.out.println(driver.findElement(By.xpath("//button[@id='createTxt']")).isEnabled());//true//generate button
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@id='link-to-download']")).isDisplayed());//true//downlaod button
		
	}
	public static void download() {
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Testing sample");//text area
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();//generate button
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();//downlaod button
		//driver.switchTo().fr
			}

	public static void upload() {
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Courses List')]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='TypeHere11_ifr']")));
		driver.findElement(By.xpath("//body//p")).sendKeys("this text box exists in side an iframe");
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.name("userfile"))
				.sendKeys("C:\\Users\\SWHIZZ TECHNOLOGIES\\Pictures\\Screenshots\\Screenshot (4).png");

	}
}
