package WindowsnFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\\\exeFiles\\\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("/html/body/button")).click();
}
}
