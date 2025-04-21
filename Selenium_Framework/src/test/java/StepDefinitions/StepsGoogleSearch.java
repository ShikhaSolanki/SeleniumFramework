package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class StepsGoogleSearch {

	
	WebDriver driver = null ;
	
	
	@Given("Open Google Home Page")
	public void open_google_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("StepsMMTFlightsPage.open_google_home_page()");
	    
	    String projectPath = System.getProperty("user.dir");
	    
	    System.getProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver") ;
	    driver = new ChromeDriver() ;
	    driver.get("https://www.google.com/") ;
	    System.out.println("Page is : "+driver.getTitle());
	    
	}
	
	
	

	@When("Search bombay to Delhi Flight")
	public void search_bombay_to_delhi_flight() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("StepsMMTFlightsPage.search_bombay_to_delhi_flight()");
	 WebElement googleSearchBox =  driver.findElement(By.name("q"));
	   
	   //googleSearchBox.click();
	   googleSearchBox.sendKeys("Mumbai to Delhi Flight");
	   googleSearchBox.sendKeys(Keys.ENTER);
	   
	}

	@When("Click on MMT Flights Link")
	public void click_on_mmt_flights_link() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("StepsMMTFlightsPage.click_on_mmt_flights_link()");
	    WebElement MMTLink = driver.findElement(By.xpath("//div[@class='g Ww4FFb vt6azd tF2Cxc asEBEc']/div/div/div/div/span/a[contains(@href,'https://www.makemytrip.com/flights/')]"));
	    
	    MMTLink.click();
	    
	}

	@Then("Verify page tittle is MMT Flights")
	public void verify_page_tittle_is_mmt_flights() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Verify page tittle is MMT Flights");
	    System.out.println("The Page Is : "+ driver.getTitle());
	    
	    driver.quit();
	}

	
	
	
	
	
	
	@When("Click on Clear Trip Flights Link")
	public void click_on_ClearTrip_flights_link() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("StepsMMTFlightsPage.click_on_mmt_flights_link()");
	    WebElement ClearTripLink = driver.findElement(By.xpath("//div[@class='g Ww4FFb vt6azd tF2Cxc asEBEc']/div/div/div/div/span/a[contains(@href,'https://www.cleartrip.com/flight-schedule/')]"));
	    
	    ClearTripLink.click();
	    
	}

	@Then("Verify page tittle is Clear Trip Flights")
	public void verify_page_tittle_is_clearTrip_flights() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Verify page tittle is Clear Trip Flights");
	    System.out.println("The Page Is : "+ driver.getTitle());
	    
	    driver.quit();
	}

	
	
	
	
	
	
	
}
