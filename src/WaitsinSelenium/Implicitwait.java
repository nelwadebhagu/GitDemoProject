package WaitsinSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\exeFiles\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

}
}
