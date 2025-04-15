package stepdefinition;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.sikuli.script.Button;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utility.CommonMethods;

public class Model13185cdefinition {
	

	@Given("user will logs as {string} and password as {string}")
	public void user_will_logs_as_and_password_as(String username11, String password11) {
	    try {
	    	
	    	CommonMethods.enterusernameandpassword( username11, password11 );
	    }catch(Exception e) {
	    	
	    }
	}




	@Then("user choose the name of branch")
	public void user_choose_the_name_of_branch() {
try {
			
			//CommonMethods.enterusernameandpassword( username11, password11 );
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "search13190.png").similar(0.7), 10).click();
			CommonMethods.screen.type("Model Booking");
			
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "model13190.png").similar(0.7), 10).click();
			Thread.sleep(1000);		
			
	    	//CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Dada13186.png").similar(0.7), 10).doubleClick();
            //screen.mouseMove(100);
	    	CommonMethods.screen.wheel(1, 2);
	    	CommonMethods.draganddrop1();
	    	
            
            //generatereport("D:\\Ikyam\\Development\\BAJAJ\\13184c\\To_Be_Processed");
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
		
	}
	@Then("user scroll the branch as13185c and makes the report")
	public void user_scroll_the_branch_as13185c_and_makes_the_report() {
	    try {
	    	CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\13185c\\To_Be_Processed");
	    	
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
	

	

}
