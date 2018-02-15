package step;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class StepDef {

	public WebDriver driver;

	@Given("^User is on the Demoqa page$")
	public void user_is_on_the_Demoqa_page() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Desktop\\workspace\\Seleniumsample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
	}

	@When("^User selects five countries Albania$")
	public void user_selects_five_countries_Albania(DataTable a) {

		List<String> asList = a.asList(String.class);
		WebElement element = driver.findElement(By.id("dropdown_7"));
		Select s = new Select(element);

		String b = "Albania";
		s.selectByVisibleText(b);

		String c = element.getAttribute("value");
		Assert.assertTrue(b.contains(c));

	}

	@When("^User selects five countries Algeria$")
	public void user_selects_five_countries_Algeria(DataTable a) {

		List<String> asList = a.asList(String.class);
		WebElement element = driver.findElement(By.id("dropdown_7"));
		Select s = new Select(element);

		String b = "Algeria";
		s.selectByVisibleText(b);

		String c = element.getAttribute("value");
		Assert.assertTrue(b.contains(c));

	}

	@When("^User selects five countries Australia$")
	public void user_selects_five_countries_Australia(DataTable a) {

		List<String> asList = a.asList(String.class);
		WebElement element = driver.findElement(By.id("dropdown_7"));
		Select s = new Select(element);

		String b = "Australia";
		s.selectByVisibleText(b);

		String c = element.getAttribute("value");
		Assert.assertTrue(b.contains(c));

	}

	@When("^User selects five countries Brazil$")
	public void user_selects_five_countries_Brazil(DataTable a) {

		List<String> asList = a.asList(String.class);
		WebElement element = driver.findElement(By.id("dropdown_7"));
		Select s = new Select(element);

		String b = "Brazil";
		s.selectByVisibleText(b);

		String c = element.getAttribute("value");
		Assert.assertTrue(b.contains(c));

	}

	@When("^User selects five countries India$")
	public void user_selects_five_countries_India(DataTable a) {

		List<String> asList = a.asList(String.class);
		WebElement element = driver.findElement(By.id("dropdown_7"));
		Select s = new Select(element);

		String b = "India";
		s.selectByVisibleText(b);

		String c = element.getAttribute("value");
		Assert.assertTrue(b.contains(c));

	}

	@Then("^User closes the window$")
	public void user_closes_the_window() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.close();
	}

}