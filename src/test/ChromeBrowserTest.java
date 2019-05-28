package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleninium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).click();;
	}

}
