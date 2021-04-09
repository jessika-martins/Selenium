package framework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandosBrowser {

		static WebDriver driver; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comandosBrowser();
	}

	public static void comandosBrowser() {
		System.setProperty("webdriver.chrome.driver","d:/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		String titulo = driver.getTitle();
		
		System.out.println(titulo);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//String codigoFonte = driver.getPageSource();
		//System.out.println(codigoFonte);
		
		driver.close();
	}
}
