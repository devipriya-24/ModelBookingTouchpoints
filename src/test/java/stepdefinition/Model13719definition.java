package stepdefinition;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.sikuli.script.App;
import org.sikuli.script.Button;
import org.sikuli.script.Key;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.CommonMethods;

public class Model13719definition {
	

	@When("user entered username {string} and password {string}")
	public void user_entered_username_and_password(String username10, String password10) {
		try {
			CommonMethods.enterusernameandpassword(username10, password10);
	        
	}
	catch(Exception e) {
			e.printStackTrace();
	}
	}
	@Then("user select the branch")
	public void user_select_the_branch() {
		try {
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "search13190.png").similar(0.7), 10).click();
			CommonMethods.screen.type("Model Booking");
			
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "model13190.png").similar(0.7), 10).click();
			//CommonMethods.screen.wheel(1, 3);
            Thread.sleep(1000);
         
            CommonMethods.draganddrop();
            Thread.sleep(3000);
           
            
            //click the branch and select the branch
            CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Model_branch.png").similar(0.7), 10).click();
           
                        
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	@Then("user entered the branch as13719 and makes the report")
	public void user_entered_the_branch_as13719_and_makes_the_report() {
		try {
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Dada13719.png").similar(0.7), 10).doubleClick();
            //screen.mouseMove(100);
	    	CommonMethods.screen.wheel(1, 2);
            
           CommonMethods. generatereport("D:\\Ikyam\\Development\\BAJAJ\\13719\\To_Be_Processed");
	    }catch(Exception e) {
	    	
	    }
	}

	


}
