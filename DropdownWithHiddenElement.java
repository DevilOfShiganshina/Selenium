package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithHiddenElement {
	public static void main(String[] args) throws InterruptedException {
		// setup
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		driver.manage().window().maximize();
		
		// core
		// sending the keys for the username
		driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		// sending the keys for the password
		driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		// clicking login
		driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		// clicking directory
		driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a/span")).click();
		//clicking dropdown
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]")).click();
		// clicking automation tester
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[3]/span")).click();
		// teardown
		Thread.sleep(5000);
		driver.quit();
	}
}
