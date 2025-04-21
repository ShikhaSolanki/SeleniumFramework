//package StepsForHooks;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.en.*;
	//
//public class Hotels_HooksDemo {
//
//	WebDriver driver = null ;
//
//
//	@Before(value="@smoke")
//	public void setUpBrowser() {
//
//		System.out.println("We Are in Broswer Setup");
//
//		String projectPath_Hotels = System.getProperty("user.dir") ; 
//
//		System.getProperty("webDriver.chrome.driver",projectPath_Hotels + "src/test/resources/drivers/chromedriver");
//		driver = new ChromeDriver() ;
//
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS) ;
//		driver.manage().window().maximize();
//
//	}
//
//	@Before(order = 0)
//	public void setUp1() {
//
//		System.out.println(" 1st Before Step");
//
//	}
//
//
//	@After(value = "@smoke", order = 1)
//	public void tearDown() {
//
//		System.out.println(" Quite the Browser ");
//		driver.close();
//		driver.quit();
//
//	}
//	
//	@After(order = 0)
//	public void tearDown2() {
//		
//		System.out.println("-- This is After 2 -- ");
//		
//	}
//
//	@BeforeStep("@smoke")
//	public void beforeStep() {
//
//		System.out.println("-- We are in Before Steps --");
//
//	}
//
//	@AfterStep
//	public void afterStep() {
//
//		System.out.println("-- We Are in After Step -- ");
//
//	}
//
//
//
//	@Given("open the browser")
//	public void open_the_browser() {
//
//	}
//
//	@And("User navigate to MMT Hotels Page")
//	public void user_navigate_to_mmt_hotels_page() {
//
//	}
//
//	@Then("sort Hotels by User Rating")
//	public void sort_hotels_by_user_rating() {
//
//
//	}
//
//	@And("Quite the Browser")
//	public void quite_the_browser() {
//
//
//
//	}
//
//
//
//
//}
