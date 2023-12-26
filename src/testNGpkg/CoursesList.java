package testNGpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class CoursesList {
	WebDriver driver;

	@BeforeMethod
	@Parameters({ "browser", "url", "username", "password" })
	public void setUp(String browser, String url, String username, String password) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Courses List')]")).click();
	}

	@Test(groups = "CourseList")
	public void coursesListTest1() {

		String actTitle = driver.findElement(By.xpath("//h3[contains(text(),'Courses List')]")).getText();
		System.out.println(actTitle);
		Assert.assertTrue(actTitle.contains("COURSES"), "System is not present in the Courses List Page");

	}

	@Test(priority = 1, groups = "CourseList", invocationCount = 1)
	public void addCourseBtn() {
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]")).click();
		String acttilte = driver.findElement(By.xpath("//h3[contains(text(),'Add Course')]")).getText();
		Assert.assertTrue(acttilte.equals("ADD COURSE"), "System not presented in the add course page");
	}

	@Test(priority = 2, groups = "CourseList", dependsOnMethods = "addCourseBtn", dependsOnGroups = "Category")
	public void addCourse() throws InterruptedException {
		addCourseBtn();
		new Select(driver.findElement(By.name("category_id"))).selectByVisibleText("DevOps");
		driver.findElement(By.name("course_name")).sendKeys("Dev-Ops");
		driver.findElement(By.name("course_slug")).sendKeys("http://www.devops.com");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='TypeHere11_ifr']")));
		driver.findElement(By.xpath("//body/p[1]")).sendKeys("Devops is the deployment technology");
		driver.switchTo().parentFrame();
		driver.findElement(By.name("submit")).click();
		// String successMessage =
		// driver.findElement(By.xpath("/html/body/div/section/div/div/section/div/div/div[1]")).getText();
		// System.out.println(successMessage);
		// driver.navigate().back();
		Thread.sleep(3000);
		boolean course = driver.findElement(By.xpath("//td[contains(text(),'Dev-Ops')]")).isDisplayed();
		// td[contains(text(),'Mulesoft')]
		Assert.assertTrue(course, "Course Not created");
	}

	@Test(groups = "Category")
	public void categoryList() {
		System.out.println("Category List dummy execution");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
