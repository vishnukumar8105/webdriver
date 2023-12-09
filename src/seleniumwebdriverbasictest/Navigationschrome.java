package seleniumwebdriverbasictest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigationschrome {

		public static void main(String[] args) throws InterruptedException {
			// TC - 1 lauch chrome browser
			 System.setProperty("webdriver.chromedriver", "C:\\Users\\Vishnu\\eclipse\\chromedriver_win32\\chromedriver");
			 WebDriver driver = new ChromeDriver();

			// TC - 2 Go to the test URL
			driver.get("https://www.facebook.com/login.php");
			//driver.get("https://www.guru99.com/software-testing.html");
		   Thread.sleep(5000);

			//manage the window to maximize
		driver.manage().window().maximize();
		Thread.sleep(5000);

			//TC 3 navigate to URL "https://www.selenium.dev/"
			//driver.navigate().to("https://www.selenium.dev");
			driver.navigate().to("https://www.javatpoint.com");
			
			Thread.sleep(5000);

		//tC 4 - navigate back
		 driver.navigate().back();
			Thread.sleep(5000);

			//tC - 5 refresh browser window
			driver.navigate().refresh();
			Thread.sleep(5000);

			//TC - 6 navigate farward
			driver.navigate().forward();
			Thread.sleep(5000);

			//TC - 7 close the browser
			driver.close();		

		}

	}


