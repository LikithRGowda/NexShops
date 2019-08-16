package Testing_realTime_Project;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Limiting_webDriver {
static {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

}
@Test
public void test1() throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://nexshops.com");
	List<WebElement> footetLinks = driver.findElements(By.xpath("//div[@class=\"custom_block\"]/descendant::li"));
	Iterator<WebElement>id =footetLinks.iterator();
			for (int i = 0; i < footetLinks.size(); i++) {
				id.next();
				footetLinks.get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
				
			 
			}

}
}
