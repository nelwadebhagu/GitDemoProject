package XPATH;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class practies {
	public static void main(String[] args) {
		String path= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"//chromeexe//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ijmeet.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[contains(text(),'Join Meeting')][@class='nav-link font-weight-bold']")).click();
	}
}
