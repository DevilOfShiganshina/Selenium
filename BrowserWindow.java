package practiceSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindow {
	public static void main(String[] args) throws InterruptedException {
		// setup
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// core
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		Set<String> windIDSet = driver.getWindowHandles();
		
		List<String> myList = new ArrayList(windIDSet);
		
		String parentIdString =  myList.get(0);
		String childIDString = myList.get(1);
		
		// Waits five seconds and switches to parent tab
		Thread.sleep(5000);
		driver.switchTo().window(parentIdString);
		// Waits five seconds and switches to child tab
		Thread.sleep(5000);
		driver.switchTo().window(childIDString);
		// Waits five seconds and switches to parent tab
		Thread.sleep(5000);
		driver.switchTo().window(parentIdString);
		// Waits five seconds and closes the parent tag
		Thread.sleep(5000);
		driver.close();
		
		
		// teardown
		Thread.sleep(5000);
		driver.quit();
	}
}
