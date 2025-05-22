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

public class Model13186cdefinition {
	

	@When("user enter name of user as {string} and password as {string}")
	public void user_enter_name_of_user_as_and_password_as(String username13, String password13) {
		try {
			CommonMethods.enterusernameandpassword(username13, password13);
	        
	}
	catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Step failed: " + e.getMessage(), e);
	}
	    
	}
	@When("user must select the name of branch")
	public void user_must_select_the_name_of_branch() {
		try {
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "search13190.png").similar(0.7), 10).click();
			CommonMethods.screen.type("Model Booking");
			
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "model13190.png").similar(0.7), 10).click();
			//CommonMethods.screen.wheel(1, 3);
            Thread.sleep(1000);
          // CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "modelbookingstmt.png").similar(0.7), 10).doubleClick();
            CommonMethods.screen.wheel(1, 2);
            CommonMethods.draganddrop1();
           // Thread.sleep(3000);
         
                        
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Step failed: " + e.getMessage(), e);
        }
	
	}
	@Then("user try to scroll the branch as13186c and makes the report")
	public void user_try_to_scroll_the_branch_as13186c_and_makes_the_report() {
		try {
	    	//CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Dada13186c.png").similar(0.7), 10).doubleClick();
	    	//CommonMethods.screen.mouseMove(100);
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
			CommonMethods.screen.wheel(1, 3);
	    	
            
	    	String dir21 = CommonMethods.getCredential("Directory21");
			CommonMethods. generatereport(dir21);
          // CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\13186c\\To_Be_Processed");
	    }catch(Exception e) {
	    	e.printStackTrace();
	    	throw new RuntimeException("Step failed: " + e.getMessage(), e);
	    }
	}

	


}
