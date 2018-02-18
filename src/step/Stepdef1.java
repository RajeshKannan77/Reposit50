package step;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef1 extends Flipkarttest {

	public WebDriver driver;
	public Actions act;

	@Given("^User is on the Flipkart page and moves the cursor towards Tvs & Appliances$")
	public void user_is_on_the_Flipkart_page_and_moves_the_cursor_towards_Tvs_Appliances() throws InterruptedException {

		test1();
	}

	@When("^User moves the cursor towards Washine Machine and clicks Washine Machine$")
	public void user_moves_the_cursor_towards_Washine_Machine_and_clicks_Washine_Machine(DataTable arg1)
			throws Exception {

		List<String> asList = arg1.asList(String.class);
		Thread.sleep(2000);

		test2();
	}

	@When("^User moves the cursor towards Refrigerators and clicks Refrigerators$")
	public void user_moves_the_cursor_towards_Refrigerators_and_clicks_Refrigerators(DataTable arg1) throws Exception {

		List<String> asList = arg1.asList(String.class);
		Thread.sleep(2000);

		test3();
	}

	@When("^User moves the cursor towards Kitchen Appliances and clicks Kitchen Appliances$")
	public void user_moves_the_cursor_towards_Kitchen_Appliances_and_clicks_Kitchen_Appliances(DataTable arg1)
			throws Exception {

		List<String> asList = arg1.asList(String.class);
		Thread.sleep(2000);

		test4();
	}

	@Then("^User closes the Flipkart page$")
	public void user_closes_the_Flipkart_page() throws InterruptedException {

		test5();
	}

}
