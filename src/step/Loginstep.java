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

public class Loginstep {

	public WebDriver driver;
	
	@Given("^User is on the Demoqa page$")
	public void user_is_on_the_Demoqa_page() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Desktop\\workspace\\Seleniumsample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
	}

	@When("^User selects five countries \"([^\"]*)\"$")
	public void user_selects_five_countries(String a, DataTable b) {
		
		WebElement element = driver.findElement(By.id("dropdown_7"));
		Select v = new Select(element);
		v.selectByVisibleText(a);
	}

	@Then("^User clicks submit button$")
	public void user_clicks_submit_button() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.name("pie_submit")).click();
	}


}
