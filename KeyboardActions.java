package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	public static void main(String[] args) throws InterruptedException {
		// setup
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		// core
		
		// Sending a text value to the first text box
		driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("Welcome to automation");
		
		Actions actions = new Actions(driver);
		
		Thread.sleep(3000);
		// Selecting text from the first text box.
		actions.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();
		// Copying the selected text to the clipboard
		actions.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).perform();
		// Pressing the tab key to go over to the second text box
		actions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		// Pasting the copied text from the clipboard to the second text box
		actions.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();
		
		Thread.sleep(5000);
		// teardown
		Thread.sleep(5000);
		driver.quit();
	}
}
