package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.GoggleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleHomePage;

public class Ocean9GoggleSearch extends GoggleBase {
	
//WebDriver driver;

    GoogleHomePage ghp;
	
	@Given("i am on google home page")
	public void i_am_on_google_home_page() {
		
		launchBrowser();
		
	   
	   
	}

	@When("i enter search {string}")
	public void i_enter_search(String term) {
		
		//WebElement searchBox = driver.findElement(By.name("q"));
		//searchBox.sendKeys(term);
		
		ghp= new GoogleHomePage(driver);
		ghp.enterSearchTerm(term);
	    	   
	}

	@When("i click on google search button")
	public void i_click_on_google_search_button() {
		
		WebElement searchButton = driver.findElement(By.name("btnk"));
		searchButton.submit();
		
	   
	}

	@Then("i receive related search result")
	public void i_receive_related_search_result() {
		
		WebElement result = driver.findElement(By.id("result-stats"));
		String searchCount = result.getText();
		
		driver.close();
	    	    
	}



}
