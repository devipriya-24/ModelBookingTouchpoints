package stepdefinition;

import org.sikuli.script.ImagePath;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utility.CommonMethods;

public class commonstepdefinition {
	@Given("I have extracted necessary image resources")
	public void i_have_extracted_necessary_image_resources() {
		CommonMethods.extractAllResources("images", CommonMethods.TEMP_DIR);
		 ImagePath.add(CommonMethods.TEMP_DIR);
	        
	}
	@Given("I navigate to the desktop")
	public void i_navigate_to_the_desktop() {
		CommonMethods.navigateToDesktop();
	}
	@When("I open the Excellon application")
	public void i_open_the_excellon_application() {
		CommonMethods.openExcellonApplication();
		
	}
	  
}
