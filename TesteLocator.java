package framework.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLocator {

	static WebDriver driver;

	public static void main(String[] args) {
		TesteText();

	}

	public static void TesteFacebook() {

		System.setProperty("webdriver.chrome.driver", "d:/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("email@email.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
	}

	public static void TesteTagEClass() {
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		List<WebElement> input = driver.findElements(By.tagName("input"));

		for (WebElement webElement : input) {
			System.out.println(webElement.getText());
		}

	}

	public static void TesteClass() {
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.hoteis.com");
		
		driver.findElement(By.className("dark-bg")).click();
	}
	
	public static void TesteText() {
		
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		driver.findElement(By.partialLinkText("senha")).click();
	}
}
