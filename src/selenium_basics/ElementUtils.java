package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
	public static boolean isClickable(WebDriver driver, WebElement element) {
		try {
			String cursor = element.getCssValue("cursor");
			return "pointer".equalsIgnoreCase(cursor);
		} catch (Exception e) {
			return false;
		}

	}

}
