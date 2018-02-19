package step;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flipkarttest extends Base {

	@Test
	public void test1() throws InterruptedException {

		flipkartPage();

		WebElement element = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		clickBtn(element);
		WebElement element1 = driver.findElement(By.xpath("//a[@title='TVs & Appliances']"));
		mouseAction(element1);

	}

	@Test
	public void test2() throws InterruptedException {

		WebElement element = driver.findElement(By.xpath("//span[text()='Washing Machine']"));
		mouseAction(element);
		
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Fully Automatic Front Load']"));
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Semi Automatic Top Load']"));
		WebElement element3 = driver.findElement(By.xpath("//span[text()='Fully Automatic Top Load']"));
		
		getData1(element1, element2, element3);
		
		clickBtn(element);
	}

	@Test
	public void test3() throws InterruptedException {

		WebElement element = driver.findElement(By.xpath("//span[text()='Refrigerators']"));
		mouseAction(element);
		
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Single Door']"));
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Double Door']"));
		WebElement element3 = driver.findElement(By.xpath("//span[text()='Triple door']"));
		WebElement element4 = driver.findElement(By.xpath("//span[text()='Side by Side']"));
		
		getData2(element1, element2, element3, element4);
		
		clickBtn(element);

	}

	@Test
	public void test4() throws InterruptedException {

		WebElement element = driver.findElement(By.xpath("//span[text()='Kitchen Appliances']"));
		mouseAction(element);
		
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Microwave Ovens']"));
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Oven Toaster Grills']"));
		WebElement element3 = driver.findElement(By.xpath("//span[text()='Mixer/Juicer/Grinder']"));
		WebElement element4 = driver.findElement(By.xpath("//span[text()='Electric Kettle']"));
		WebElement element5 = driver.findElement(By.xpath("//span[text()='Induction Cooktops']"));
		WebElement element6 = driver.findElement(By.xpath("//span[text()='Hand Blenders']"));
		WebElement element7 = driver.findElement(By.xpath("//span[text()='Sandwich Makers']"));
		WebElement element8 = driver.findElement(By.xpath("//span[text()='Chimneys']"));
		WebElement element9 = driver.findElement(By.xpath("//span[text()='Electric Cookers']"));
		WebElement element10 = driver.findElement(By.xpath("//span[text()='Wet Grinders']"));
		WebElement element11 = driver.findElement(By.xpath("//span[text()='Food Processors']"));
		WebElement element12 = driver.findElement(By.xpath("//span[text()='Coffee Makers']"));
		WebElement element13 = driver.findElement(By.xpath("//span[text()='Dishwashers']"));
		
		getData3(element1, element2, element3, element4, element5, element6, element7, element8, element9, element10,
				element11, element12, element13);

		clickBtn(element);

	}

	@Test
	public void test5() throws InterruptedException {

		closeBrowser(driver);
	}

}
