package XPATH;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;


public class ScreenshotHalf {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G://exeFiles//chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	//driver.get("https://www.facebook.com/");
	driver.get("https://www.naukri.com/login-systems-jobs-careers-795652");
	AShot as= new AShot();
	Screenshot sc =as.takeScreenshot(driver);
	try {
		ImageIO.write(sc.getImage(), "PNG", new File("Screenshots1/thirdAshot.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	driver.quit();
	}
	
	
	 
}

}
