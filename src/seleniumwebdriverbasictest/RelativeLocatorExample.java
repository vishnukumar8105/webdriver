package seleniumwebdriverbasictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorExample {

	public static void main(String[] args) throws InterruptedException {
		// TC - 1 lauch edge browser
		  System.setProperty("webdriver.edge.driver", "D:\\QA_Automation\\msedgedriver.exe");  // webdriver.chrome.driver
		WebDriver driver = new EdgeDriver(); // new ChromeDriver()

		// TC - 2 Go to the test URL
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(5000);

		// manage the window to maximize
		driver.manage().window().maximize();

		// TC 3 -click on Sign up for Facebook link then it will move to signup page
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(3000);

		By maleRB = RelativeLocator.with(By.tagName("input")).below(By.name("birthday_month"));

		driver.findElement(maleRB).click();
		Thread.sleep(3000);

		// TC -4 close the browser
		driver.close();

	}

}