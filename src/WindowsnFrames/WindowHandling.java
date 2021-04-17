package WindowsnFrames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\exeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
	/*	String parenthandle = driver.getWindowHandle();
		
		Set<String> child = driver.getWindowHandles();
		for (String child1 : child) {
			if(!parenthandle.equals(child1))
			{
				driver.switchTo().window(child1).close();
			}
		}*/driver.switchTo().frame(0);
		driver.findElement(By.xpath(""));
}}