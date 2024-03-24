package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {
	public static void main(String[] args) throws InterruptedException {
		// setup
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		// core
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span")).click();
		
		List<WebElement> elems = driver.findElements(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/ul/li"));
		
		for(WebElement myElement:elems) {
			System.out.println(myElement.getText());
			if(myElement.getText().equalsIgnoreCase("Java")) {
				myElement.click();
			}
		}
		
		// teardown
		Thread.sleep(5000);
		driver.quit();
	}
}
