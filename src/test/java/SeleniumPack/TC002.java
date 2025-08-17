package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("Automtion Testing Tools");
		Thread.sleep(3000);
		search.sendKeys(Keys.ENTER);
		search.submit();
		System.out.println("Title: "+driver.getTitle());
	}

}
