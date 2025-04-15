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

public class Model13186definition {
	
	@When("users log in using username {string} and password {string}")
	public void users_log_in_using_username_and_password(String username3, String password3) {
		try {
	        
	        CommonMethods.enterusernameandpassword(username3, password3);
	}
	catch(Exception e) {
			e.printStackTrace();
	}
	   
	}
	@Then("users should click the branch")
	public void users_should_click_the_branch() {
		try {
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "sales.png").similar(0.7), 10).doubleClick();
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "reports.png").similar(0.7), 10).doubleClick();
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Msales.png").similar(0.7), 10).doubleClick();
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "modelstmt.png").similar(0.7), 10).doubleClick();
			CommonMethods.screen.wheel(1, 3);
            Thread.sleep(1000);
            CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "modelbookingstmt.png").similar(0.7), 10).doubleClick();
            
            Thread.sleep(3000);
            CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "reportfilters.png").similar(0.7), 10).doubleClick();
            
            
            
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
            CommonMethods.draganddrop();
            
            //click the branch and select the branch
            CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Model_branch.png").similar(0.7), 10).click();
           
                        
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	@Then("user select the branch as {int} create the report")
	public void user_select_the_branch_as_create_the_report(Integer int1) {
		
		 try {
		    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Dada13186.png").similar(0.7), 10).doubleClick();
	            //screen.mouseMove(100);
		    	CommonMethods.screen.wheel(1, 2);
	            
	            CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\13186\\To_Be_Processed");
		    }catch(Exception e) {
		    	
		    }
		}
	
	}





