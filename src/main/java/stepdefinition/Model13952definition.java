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

public class Model13952definition {
	
	@When("user type name of user as {string} and password as {string}")
	public void user_type_name_of_user_as_and_password_as(String username12, String password12) {
		try {
			CommonMethods.enterusernameandpassword(username12, password12);
			  CommonMethods.screen.type(Key.ENTER);
	        
	}
	catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Step failed: " + e.getMessage(), e);
	}
	    
	}
	@When("user should select the name of branch")
	public void user_should_select_the_name_of_branch() {
		try {
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "search13190.png").similar(0.7), 10).click();
			CommonMethods.screen.type("Model Booking");
			
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "model13190.png").similar(0.7), 10).click();
			//CommonMethods.screen.wheel(1, 3);
            Thread.sleep(1000);
          //  CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "modelbookingstmt.png").similar(0.7), 10).doubleClick();
            
            CommonMethods.draganddrop1();
            Thread.sleep(3000);
          
            
            //click the branch and select the branch
            CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Model_branch.png").similar(0.7), 10).click();
           
                        
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Step failed: " + e.getMessage(), e);
        }
	
		
	}
	@Then("user scroll the branch as13952 and makes the report")
	public void user_scroll_the_branch_as13952_and_makes_the_report() {
		try {
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Dada13592.png").similar(0.7), 10).doubleClick();
            //screen.mouseMove(100);
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
	    	CommonMethods.screen.wheel(1, 2);
	    	String dir20 = CommonMethods.getCredential("Directory20");
			CommonMethods. generatereport(dir20);
            
           // CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\13952\\To_Be_Processed");
	    }catch(Exception e) {
	    	throw new RuntimeException("Step failed: " + e.getMessage(), e);
	    }
}
	
	
	}





