package seleniumwebdriverbasictest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunchchrome {

	public static void main(String[] args) throws InterruptedException  {
		// TC - 1 launch chrome browser
		 System.setProperty("webdriver.chromedriver", "C:\\Users\\Vishnu\\eclipse\\chromedriver_win32\\chromedriver");
		WebDriver driver = new ChromeDriver();
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

