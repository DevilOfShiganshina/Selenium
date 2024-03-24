package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownWithSelectTag {
	public static void main(String[] args) throws InterruptedException {
		// setup
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// core
		WebElement selectTagElement = driver.findElement(By.xpath("//*[@id=\"country-list\"]"));
		Select selectObjSelect = new Select(selectTagElement);
		selectObjSelect.selectByVisibleText("France");
		// teardown
		
		Thread.sleep(5000);
		driver.quit();
	}
}
