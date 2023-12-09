package seleniumwebdriverbasictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firsttest {

	public static void main(String[] args) {
	
			        // Set the path to the ChromeDriver executable (You can use a different browser driver)
		        System.setProperty("webdriver.chromedriver", "C:\\Users\\Vishnu\\eclipse\\chromedriver_win32\\chromedriver");

		        // Initialize the WebDriver instance (in this case, using Chrome)
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the login page URL
		        driver.get("https://mail.google.com");

		        // Find the username and password input fields and the login button by their HTML attributes
		        WebElement usernameField = driver.findElement(By.id("username")); // Change to the actual ID
		       WebElement passwordField = driver.findElement(By.id("password")); // Change to the actual ID
		        WebElement loginButton = driver.findElement(By.id("login-button")); // Change to the actual ID

		        // Enter the username and password
		        usernameField.sendKeys("your_username");
		       passwordField.sendKeys("your_password");

		        // Click the login button
		       loginButton.click();

		        // You can add further validation/assertions here to verify if the login was successful
		        // For example, you can check if the user is redirected to a dashboard page.

		        // Close the browser
		        driver.quit();
		    }
		}
