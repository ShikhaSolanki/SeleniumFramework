package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.FlightsPage_PF;

public class StepsFlights {
	
	
	WebDriver driver = null ; 
	FlightsPage_PF flights_Page ;
	
	
	@Given("Open Chrome browser")
	public void open_chrome_browser() {
		System.out.println("== We in Steps Flights Class ===");
		
	   String projectPath = System.getProperty("user.dir");
	   
	   System.getProperty("webdriver.chrome.driver", projectPath +"/src/test/resources/drivers/chromedriver");
	   driver = new ChromeDriver() ;
	   driver.manage().window().maximize() ;
		
	   	
	   
		
	}
	
	
	@When("Navigate to MMTFlights Web Page")
	public void navigate_to_mmt_flights_web_page() {
		
		
	//	flights_Page = new FlightsPage_PF(driver) ;
		driver.get("https://www.makemytrip.com/flights/new_delhi-mumbai-cheap-airtickets.html?srsltid=AfmBOooaAQIr4g_A4jAGeEsIs-HMHMnMiLDE-ubDqnhAc6dsvofllIxf");
	    
		
		
	}

	@Then("Select AirIndia Filter")
	public void select_air_india_filter() {
		
		flights_Page = new FlightsPage_PF(driver) ;
		
		flights_Page.selectAirIndia_checkbox();
	    
	}
	
	
	@And("Close the Browser")
	public void  close_the_browser() {
		
		flights_Page = new FlightsPage_PF(driver) ;
	
		driver.quit();
		
	}


}
