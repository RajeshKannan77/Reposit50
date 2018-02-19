package step;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {

	public static WebDriver driver;

	public static WebDriver flipkartPage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Desktop\\workspace\\Seleniumprograms\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		Thread.sleep(2000);

		driver.get("https://www.flipkart.com/");

		return driver;

	}

	public static void mouseAction(WebElement element) throws InterruptedException {

		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public static void clickBtn(WebElement element) throws InterruptedException {

		Thread.sleep(2000);
		element.click();
	}

	public static void closeBrowser(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);

		driver.close();
	}

	public static void getData1(WebElement element, WebElement element1, WebElement element2)
			throws InterruptedException {

		Thread.sleep(2000);

		System.out.println(element.getText());
		System.out.println(element1.getText());
		System.out.println(element2.getText());

	}

	public static void getData2(WebElement element, WebElement element1, WebElement element2, WebElement element3)
			throws InterruptedException {

		Thread.sleep(2000);

		System.out.println(element.getText());
		System.out.println(element1.getText());
		System.out.println(element2.getText());
		System.out.println(element3.getText());

	}

	public static void getData3(WebElement element, WebElement element1, WebElement element2, WebElement element3,
			WebElement element4, WebElement element5, WebElement element6, WebElement element7, WebElement element8,
			WebElement element9, WebElement element10, WebElement element11, WebElement element12)
			throws InterruptedException {

		Thread.sleep(2000);

		System.out.println(element.getText());
		System.out.println(element1.getText());
		System.out.println(element2.getText());
		System.out.println(element3.getText());
		System.out.println(element4.getText());
		System.out.println(element5.getText());
		System.out.println(element6.getText());
		System.out.println(element7.getText());
		System.out.println(element8.getText());
		System.out.println(element9.getText());
		System.out.println(element10.getText());
		System.out.println(element11.getText());
		System.out.println(element12.getText());

	}

}
