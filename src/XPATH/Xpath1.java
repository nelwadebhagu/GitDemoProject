package XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\exeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("firstname")).sendKeys("Bhagyashri");
		driver.findElement(By.name("lastname")).sendKeys("jasd");
		driver.findElement(By.name("reg_email__")).sendKeys("9815427653");
		driver.findElement(By.name("reg_passwd__")).sendKeys("989a#@45");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByIndex(4);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select select = new Select(month);
		select.selectByValue("5");
		WebElement year = driver.findElement(By.id("year"));
		Select select1 = new Select(year);
		select1.selectByValue("1995");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}
}
// name id class linkText css-selector classname partialLinkText xpath tagname