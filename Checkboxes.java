package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		WebElement greenButton = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[5]"));
		greenButton.click();
		
		List<WebElement> colorList = driver.findElements(By.xpath("//*[@id='Content']/div[1]/blockquote[1]/form/input"));
		
		for (WebElement myElement : colorList) {
			String colorString = myElement.getAttribute("value");
			
			if (colorString.equalsIgnoreCase("red")) {
				myElement.click();
			}
			
			else if (colorString.equalsIgnoreCase("blue")) {
				myElement.click();
			}
		}
				
		Thread.sleep(5000);
		driver.quit();
	}
}
