package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//JSAlert
		driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[1]/button")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();

		// JSConfirm
		driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[2]/button")).click();
		Thread.sleep(5000);
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//alert.dismiss();
		alert.accept();
		String messageString = driver.findElement(By.xpath("//*[@id=\'result\']")).getText();
		if (messageString.equalsIgnoreCase("You clicked: Ok")) {
			System.out.println("JSConfirm Passed!");
		} else { System.out.println("JSConfirm failed!");}
		
		Thread.sleep(3000);
		
		//JSPrompt
		driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[3]/button")).click();
		alert.sendKeys("Good Evening!");
		Thread.sleep(3000);
		alert.accept();
		
		messageString = driver.findElement(By.xpath("//*[@id=\'result\']")).getText();
		
		if (messageString.equalsIgnoreCase("You entered: Good Evening!")) {
			System.out.println("JSPrompt Passed!");
		} else { System.out.println("JSPrompt failed!");}
		Thread.sleep(5000);
		driver.quit();
	}
}
