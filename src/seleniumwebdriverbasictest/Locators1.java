package seleniumwebdriverbasictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {

		// TC 1- lauch edge browser and navigate to facebook URL
		System.setProperty("webdriver.edge.driver", "D:\\QA_Automation\\msedgedriver.exe"); 
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login.php");

		// TC 2 -click on Sign up for Facebook link then it will move to signup page
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(5000);

		// TC 3 -enter required deatils of user

		// id = "u_0_b_5z"
		// name = "firstname"
		// tagname="input" ------>Ignore muultplie tagnames with input
		// classname="inputtext _58mg _5dba _2ph-"

		// firstname text box
		driver.findElement(By.name("firstname")).sendKeys("Siri");
		Thread.sleep(4000);

		// surname textbox
		driver.findElement(By.name("lastname")).sendKeys("Siri123");
		Thread.sleep(4000);

		// email id text box
		driver.findElement(By.name("reg_email__")).sendKeys("supraja@test.com");
		Thread.sleep(4000);

		// password textbox
		driver.findElement(By.id("password_step_input")).sendKeys("12345678");
		Thread.sleep(4000);

		// TC 4 close the browser

		driver.close();

	}

}