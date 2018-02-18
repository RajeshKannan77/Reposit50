package step;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Flipkarttest extends Base {

	// WebDriver drive = flipkartPage();
	Page page = new Page();

	@Test
	public void test1() throws InterruptedException {

		flipkartPage();
				
		Thread.sleep(2000);
		clickBtn(page.getPopup());

		mouseAction(page.getTvsandApps());
	}

	@Test
	public void test2() throws InterruptedException {

		Thread.sleep(2000);
		
		mouseAction(page.getWashingMachine());

		getData(page.getSubModule1());
		getData(page.getSubModule2());
		getData(page.getSubModule3());

		clickBtn(page.getWashingMachine());

	}

	@Test
	public void test3() {

		mouseAction(page.getRefrigerators());

		getData(page.getSubModule4());
		getData(page.getSubModule5());
		getData(page.getSubModule6());
		getData(page.getSubModule7());

		clickBtn(page.getRefrigerators());

	}

	@Test
	public void test4() {
		
		mouseAction(page.getKitchenAppliances());

		getData(page.getSubModule8());
		getData(page.getSubModule9());
		getData(page.getSubModule10());
		getData(page.getSubModule11());
		getData(page.getSubModule12());
		getData(page.getSubModule13());
		getData(page.getSubModule14());
		getData(page.getSubModule15());
		getData(page.getSubModule16());
		getData(page.getSubModule17());
		getData(page.getSubModule18());
		getData(page.getSubModule19());
		getData(page.getSubModule20());



		clickBtn(page.getKitchenAppliances());

	}
	
	@Test
	public void test5() throws InterruptedException {

		closeBrowser();
	}

}
