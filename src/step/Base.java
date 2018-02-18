package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {

	public static WebDriver driver;
	public static Actions act;

	public static WebDriver flipkartPage() throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Desktop\\workspace\\Seleniumprograms\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com/");

		return driver;

	}

	public static void mouseAction(WebElement element)  {


		act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public static void clickBtn(WebElement element)  {

		element.click();
	}

	public static void closeBrowser() throws InterruptedException  {

		Thread.sleep(2000);

		driver.close();
	}

	public static void getData(WebElement element)  {


		System.out.println(element.getText());

	}

}
