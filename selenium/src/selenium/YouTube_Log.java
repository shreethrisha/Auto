package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube_Log {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youTube.com");
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf");
        driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();

		

	}

}
