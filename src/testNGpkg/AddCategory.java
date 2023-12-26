package testNGpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class AddCategory {
	WebDriver driver;

	@BeforeMethod

	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@admin.com");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");

		driver.findElement(By.xpath("//input[@name='submit']")).click();

	}

	@Test(dataProvider = "dp")
	public void addcategory(String categoryName, String sortOrder, String metaTitle, String metaDesc, String metakey,
			String Results) throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Categories List')]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]")).click();

		String title = "";                                         

		driver.findElement(By.name("category_name")).sendKeys(categoryName);// category name

		driver.findElement(By.name("sort_order")).sendKeys(sortOrder);// sort_order

		driver.findElement(By.name("category_meta_title")).sendKeys(metaTitle);// category_meta_title

		driver.findElement(By.name("category_meta_desc")).sendKeys(metaDesc);// category_meta_desc

		driver.findElement(By.name("category_meta_keywords")).sendKeys(metakey);// category_meta_keywords

		driver.findElement(By.name("submit")).click();// save

		String exptitle = "Category added successfully.";
		if (Results.equals("pass")) {
			String acttitle = driver
					.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]"))
					.getText();
			Assert.assertTrue(acttitle.contains(exptitle), "Category added successfully");
		} else {
			Assert.assertFalse(title.isEmpty(), "Category added successfully");
		}

	}

	public String[][] getdata() throws IOException {
		XLUtility xl = new XLUtility("C:\\Users\\SWHIZZ TECHNOLOGIES\\eclipse-workspace1\\Java_Training930\\excelSheets\\testdata.xlsx");
		int rowcount = xl.getRowCount("addCategory");
		int cellcount = xl.getCellCount("addCategory", 2);
		String testdata[][] = new String[rowcount - 1][cellcount];
		for (int i = 2; i <= rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				testdata[i - 2][j] = xl.getCellData("addCategory", i, j);
				//System.out.println(Arrays.toString(testdata));
			}
		}
		return testdata;
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

	@DataProvider
	public Object[][] dp() throws IOException {
		return getdata();

	}
}
