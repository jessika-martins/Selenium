package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandoWebElement {
	static WebDriver driver;
	
	public static void main(String[] args) {
		webElement();

	}
	public static void webElement() {
		System.setProperty("webdriver.chrome.driver","d:/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("erick@email.com");
		
		driver.findElement(By.id("email")).clear();
		
		boolean apareceu;
		
		apareceu = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(apareceu);
		
		boolean habilitado;
		
		habilitado = driver.findElement(By.id("email")).isEnabled();
		System.out.println(habilitado);
		
		
		
		//boolean selecionado = driver.findElement(By.name("sex")).isSelected();
		//System.out.println(selecionado);
		
		
		
		String textoLink;
		
		textoLink = driver.findElement(By.linkText("Esqueceu a senha?")).getText();
		System.out.println(textoLink);
		
		driver.findElement(By.name("login")).submit();
	}

}
