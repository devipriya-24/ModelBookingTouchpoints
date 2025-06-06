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

public class Model13191definition {
	

	@When("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String username5, String password5) {
		try {
			
			CommonMethods.enterusernameandpassword(username5, password5);
	        
	}
	catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Step failed: " + e.getMessage(), e);
	}
	}
	@Then("user clicks the branch")
	public void user_clicks_the_branch() {
		try {
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "search13190.png").similar(0.7), 10).click();
			CommonMethods.screen.type("Model Booking");
			
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "model13190.png").similar(0.7), 10).click();
			//CommonMethods.screen.wheel(1, 3);
            Thread.sleep(1000);
          //  CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "modelbookingstmt.png").similar(0.7), 10).doubleClick();
            
            Thread.sleep(3000);
            CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "rep.png").similar(0.7), 10).doubleClick();
            
            
            
            Pattern reportFiltersPattern = new Pattern(CommonMethods.TEMP_DIR +"crop_rep.png").similar(0.90);
            Match arrowMatch = CommonMethods.screen.wait(reportFiltersPattern, 10);

            if (arrowMatch != null) {
            	CommonMethods.screen.hover(arrowMatch);
                Thread.sleep(500);
                
               // screen.doubleClick(arrowMatch);
                CommonMethods.screen.mouseMove(arrowMatch);
                CommonMethods.screen.mouseDown(Button.LEFT);
                Thread.sleep(200);
                CommonMethods.screen.mouseUp(Button.LEFT);	                
            } else {
                System.out.println("Report Filters arrow not found!");
            }
            
            //click the branch and select the branch
            CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Model_branch.png").similar(0.7), 10).click();
           
                        
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Step failed: " + e.getMessage(), e);
        }                                         
	
		
	    
	}
		
	
	@Then("user choose the branch as13191 makes the report")
	public void user_choose_the_branch_as13191_makes_the_report() {
		try {
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Dada13191.png").similar(0.7), 10).doubleClick();
            //screen.mouseMove(100);
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
            CommonMethods.screen.wheel(1, 2);
	    	String dir11 = CommonMethods.getCredential("Directory11");
			CommonMethods. generatereport(dir11);
	    	//CommonMethods. generatereport("D:\\Ikyam\\Development\\BAJAJ\\13191\\To_Be_Processed");
	    }catch(Exception e) {
	    	throw new RuntimeException("Step failed: " + e.getMessage(), e);
	    }
	}
		
		




}
