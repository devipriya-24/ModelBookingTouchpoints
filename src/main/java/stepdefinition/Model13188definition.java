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

public class Model13188definition {
	

	@When("user enter13188 username {string} and password {string}")
	public void user_enter13188_username_and_password(String username6, String password6) {
		try {
			CommonMethods.enterusernameandpassword(username6, password6);
	        
	}
	catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Step failed: " + e.getMessage(), e);
	}
	    
	}
	@Then("user clicks the13188 branch")
	public void user_clicks_the13188_branch() {
		try {
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "search13190.png").similar(0.7), 10).click();
			CommonMethods.screen.type("Model Booking");
			
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "model13190.png").similar(0.7), 10).click();
			//CommonMethods.screen.wheel(1, 3);
            Thread.sleep(1000);
          //  CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "modelbookingstmt.png").similar(0.7), 10).doubleClick();
            CommonMethods.draganddrop();
            
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
	@Then("user choose the branch as13188 makes the report")
	public void user_choose_the_branch_as13188_makes_the_report() {
		try {
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Dada13188.png").similar(0.7), 10).doubleClick();
            //screen.mouseMove(100);
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
			CommonMethods.screen.wheel(1, 3);
	    	//CommonMethods.screen.wheel(1, 3);
	    	
	    	String dir12 = CommonMethods.getCredential("Directory12");
			CommonMethods. generatereport(dir12);
            
            //CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\13188\\To_Be_Processed");
	    }catch(Exception e) {
	    	throw new RuntimeException("Step failed: " + e.getMessage(), e);
	    }
	}
	
}
