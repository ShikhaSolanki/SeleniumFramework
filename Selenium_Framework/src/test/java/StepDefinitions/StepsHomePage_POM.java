package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.homePage;
import io.cucumber.java.en.*;

public class StepsHomePage_POM {
	
//WebDriver driver = null ;	
//homePage home_page ;
//
//
//@Given("Open Chrome browser")
//public void open_chrome_browser() {
//   String projectPath = System.getProperty("user.dir");
//   
//   System.getProperty("webdriver.chrome.driver", projectPath +"/src/test/resources/drivers/chromedriver");
//   driver = new ChromeDriver() ;
//   driver.manage().window().maximize() ;
//	
//   	
//   
//	
//}
//
//@When("Navigate to MMT Web Page")
//public void navigate_to_mmt_web_page() throws InterruptedException {
//    
//	homePage home_page = new homePage(driver) ;
//	
//	driver.navigate().to("https://www.makemytrip.com/") ;
//	
//	
//}
//
//@And("Check the login Popup")
//public void check_the_login_popup(){
//    
//	home_page = new homePage(driver) ;
//	
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
//	WebElement loginPopUp = driver.findElement(By.xpath("//div[@class='imageSlideContainer']")) ;
//	//WebElement closePopUp = driver.findElement(By.xpath("//span[@class='commonModal__close']")) ;
//	
//	Boolean login_PopUp =loginPopUp.isEnabled() ; 
//	System.out.println("Login popUp Is : "+login_PopUp);
//	
//}
//
//
//
//@Then("Close Login PopUp and look for Flights")
//public void close_login_popup_and_look_for_flights() throws InterruptedException {
//	
//	home_page = new homePage(driver) ;
//    
//	WebElement loginPopUp = driver.findElement(By.xpath("//div[@class='imageSlideContainer']")) ;
//	WebElement closePopUp = driver.findElement(By.xpath("//span[@class='commonModal__close']")) ;
//	WebElement menuFlight = driver.findElement(By.xpath("//li[@class='menu_Flights']")) ;
//	Boolean login_PopUp = loginPopUp.isEnabled();
//	
//	if(login_PopUp == true)
//	{
//	closePopUp.click() ;
//	}
//	
//	Boolean menu_Flight = menuFlight.isDisplayed() ;
//	
//	System.out.println("Flights menu is :" + menu_Flight);
//	
//	//driver.quit() ;
//}
//
//@And("Close the Browser")
//public void  close_the_browser() {
//	home_page = new homePage(driver) ;
//	driver.quit();
//	
//}
//
//
//
//@Then("Get Class of Menu Items")
//public void get_class_of_menu_items() {
//home_page = new homePage(driver) ;
//	
//	home_page.getClassofMenuItems();
//	
//}
//
//@Then("Select round trip")
//public void select_round_trip() {
//	
//	home_page = new homePage(driver) ;
//	boolean roundTrip_Selected = home_page.selectRoundTrip() ;
//	
//	System.out.println("Round trip is selected : "+roundTrip_Selected);
//}
//
//@And("Select Multi City Trip")
//public void select_multiCity_trip() {
//	
//	home_page = new homePage(driver);
//	boolean multiCity_Selected = home_page.selectMultiCityTrip() ;
//	
//	System.out.println("Multi City is Selected : "+multiCity_Selected);
//	
//}
//
//
//
//@Then("^Enter the (.*)$")
//public void enter_the(String PhoneNum) {
//	
//	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS) ;
//	
//	WebElement mobileNum = driver.findElement(By.xpath("//div[@class='modalFieldInner makeFlex hrtlCenter']/input")) ;
//	Boolean mobile_Num = mobileNum.isEnabled() ;
//	
//	System.out.println("Mobile input field is : "+mobile_Num);
//	
//	mobileNum.click() ;
//	mobileNum.sendKeys(PhoneNum) ;
//	
//	
//	driver.quit() ;
//	
//}
//
//
//
//
//
//

}
