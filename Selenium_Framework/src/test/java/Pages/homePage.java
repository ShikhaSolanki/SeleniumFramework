package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	WebDriver driver = null ;

	
	By menu_flights = By.xpath("//li[@class='menu_Flights']") ;
	By menu_Items = By.xpath("//nav/ul/li[contains(@class,'menu')]") ;
	By select_oneWayTrip = By.xpath("//li[@data-cy='oneWayTrip']") ;
	By select_roundTrip = By.xpath("//li[@data-cy='roundTrip']") ;
	By select_multiCityTrip = By.xpath("//li[@data-cy='mulitiCityTrip']") ;
	By date_box_return = By.xpath("//label[@for='return']/input[@id='return']") ; 
	By button_AddCity = By.xpath("(//button[@class='btnAddCity'])[2]") ;
	public homePage(WebDriver driver) {
		this.driver = driver ;
	}
	
	public void clickFlights() {
		driver.findElement(menu_flights).click();
	}
	
	public void getClassofMenuItems() {
		
		List<WebElement> menu = driver.findElements(menu_Items) ;
		String menu_name = "" ;
		
		int i ;
		
		for(i = 0 ; i < menu.size() ; i++) {
			
			menu_name = menu.get(i).getText();
			System.out.println(menu_name);
		}
		
	}
	
	
	public boolean selectOneWayTrip() {
		
		driver.findElement(select_oneWayTrip).click();
		boolean oneWay_Selected = driver.findElement(date_box_return).isEnabled() ;
		
		return oneWay_Selected ;
		
	}
	
	public boolean selectRoundTrip() {
		
		driver.findElement(select_roundTrip).click();
		boolean roundTrip_Selected = driver.findElement(date_box_return).isEnabled() ;
		
		return roundTrip_Selected ;
		
	}
	
	public Boolean selectMultiCityTrip() {
		
		driver.findElement(select_multiCityTrip).click();
		
		boolean addCitybuttonIsEnabled = driver.findElement(button_AddCity).isEnabled() ;
		
		return addCitybuttonIsEnabled ;
		
		
		
	}
	
}

