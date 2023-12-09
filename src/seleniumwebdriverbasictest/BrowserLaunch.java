package seleniumwebdriverbasictest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException  {
		// TC - 1 launch edge browser
		System.setProperty("webdriver.edge.driver", "D:\\QA_Automation\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		// TC - 2 Go to the test URL
		driver.get("https://www.facebook.com/");
		//specify wait for 5 sec
		Thread.sleep(5000);
		//TC-4 get the title of the page
		System.out.println(driver.getTitle());
	    // String title = driver.getTitle();
	    // System.out.println(title);
		// TC 5 - manage the browser window to maximize
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// TC - 6 manage the brwoser window to minimize
				driver.manage().window().minimize();
				Thread.sleep(5000);
		//TC-3 Close the browser
		driver.close();
		
		}

}

