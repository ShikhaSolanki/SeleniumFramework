package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage_PF {

	
	@FindBy(xpath = "(//div[@class='filtersOuter']/div/label/div/span[@class='makeFlex hrtlCenter']/span[@title='Air India'])[2]")
	WebElement airIndia_CheckBox ;
	
	
	@FindBy(xpath = "(//div[@class='filtersOuter']/div/label/div/span[@class='makeFlex hrtlCenter']/span[@title='IndiGo'])[2]")
	WebElement indiGo_CheckBox ;
	
	WebDriver driver ; 
	
	public FlightsPage_PF(WebDriver driver) {
		
		this.driver = driver ;
		PageFactory.initElements(driver, this);;
		
	}
	
	
	public void selectAirIndia_checkbox() {
		
		airIndia_CheckBox.click();
		
	}
	
}
