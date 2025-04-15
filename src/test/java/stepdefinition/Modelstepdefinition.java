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

public class Modelstepdefinition {
	 
	@When("I log in using username {string} and password {string}")
	public void i_log_in_using_username_and_password(String username1, String password1) {
		
		try {
	       
	        CommonMethods.enterusernameandpassword(username1, password1);
	}
	catch(Exception e) {
			e.printStackTrace();
	}
		}
	
	

	@Then("I should click the branch")
	public void i_should_click_the_branch() {
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
            
            //drag and drop
            CommonMethods.draganddrop();
            
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
        }
	    
	}
	@Then("user select the branch as {int} generate the report")
	public void user_select_the_branch_as_generate_the_report(Integer int1) {
	    try {
	    	
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Dada.png").similar(0.7), 10).doubleClick();
            //screen.mouseMove(100);
	    	CommonMethods.screen.wheel(1, 2);
            
	    	CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\13184\\To_Be_Processed");
	    }catch(Exception e) {
	    	
	    }
	}
	
	@Then("user select the branch as A13184 generate the report")
	public void user_select_the_branch_as_a13184_generate_the_report() {
		try {
			
			
			String targetText = "A13184";
			boolean entryFound = false;
			int maxScrollAttempts = 50;
			int attempts = 0;

			while (attempts < maxScrollAttempts) {
			    // Capture visible screen text
			    String visibleText = CommonMethods.screen.text(); // OCR read
			    System.out.println("Visible Text: " + visibleText);

			    if (visibleText != null && visibleText.contains(targetText)) {
			        System.out.println("Text found: " + targetText);
			        
			        // Now find the pattern near the matched text (or approximate location)
			        Match match = CommonMethods.screen.findText(targetText); // This attempts to find location of the string
			        if (match != null) {
			            match.click();
			            System.out.println("Successfully clicked on: " + targetText);
			            entryFound = true;
			        }
			        break;
			    } else {
			    	CommonMethods.screen.type(Key.PAGE_DOWN);
			        System.out.println("Scrolling using Page Down...");
			        Thread.sleep(800);
			        attempts++;
			    }
			}

			if (!entryFound) {
			    System.out.println("Target text '" + targetText + "' not found after scrolling.");
			}
			
			
			CommonMethods.screen.wheel(1, 3);
			CommonMethods. generatereport("D:\\Ikyam\\Development\\BAJAJ\\A13184\\To_Be_Processed");
	    }catch(Exception e) {
	    e.printStackTrace();	
	    }
	}
	        
	
	@Then("user select the branch as B13184 generate the report")
	public void user_select_the_branch_as_b13184_generate_the_report() {
try {
			
			
			//to select the branch B13184
			String targetText = "B13184";
			boolean entryFound = false;
			int maxScrollAttempts = 50;
			int attempts = 0;

			while (attempts < maxScrollAttempts) {
			    // Capture visible screen text
			    String visibleText = CommonMethods.screen.text(); // OCR read
			    System.out.println("Visible Text: " + visibleText);

			    if (visibleText != null && visibleText.contains(targetText)) {
			        System.out.println("Text found: " + targetText);
			        
			        // Now find the pattern near the matched text (or approximate location)
			        Match match = CommonMethods.screen.findText(targetText); // This attempts to find location of the string
			        if (match != null) {
			            match.click();
			            System.out.println("Successfully clicked on: " + targetText);
			            entryFound = true;
			        }
			        break;
			    } else {
			    	CommonMethods.screen.type(Key.PAGE_DOWN);
			        System.out.println("Scrolling using Page Down...");
			        Thread.sleep(800);
			        attempts++;
			    }
			}

			if (!entryFound) {
			    System.out.println("Target text '" + targetText + "' not found after scrolling.");
			}		
			CommonMethods.screen.wheel(1, 3);
            
			CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\B13184\\To_Be_Processed");
	    }catch(Exception e) {
	    	
	    }
	}
	

	@Then("user select the branch as C13184 generate the report")
	public void user_select_the_branch_as_c13184_generate_the_report() {
try {
			
			
			String targetText = "C13184";
			boolean entryFound = false;
			int maxScrollAttempts = 50;
			int attempts = 0;

			while (attempts < maxScrollAttempts) {
			    // Capture visible screen text
			    String visibleText = CommonMethods.screen.text(); // OCR read
			    System.out.println("Visible Text: " + visibleText);

			    if (visibleText != null && visibleText.contains(targetText)) {
			        System.out.println("Text found: " + targetText);
			        
			        // Now find the pattern near the matched text (or approximate location)
			        Match match = CommonMethods.screen.findText(targetText); // This attempts to find location of the string
			        if (match != null) {
			            match.click();
			            System.out.println("Successfully clicked on: " + targetText);
			            entryFound = true;
			        }
			        break;
			    } else {
			    	CommonMethods.screen.type(Key.PAGE_DOWN);
			        System.out.println("Scrolling using Page Down...");
			        Thread.sleep(800);
			        attempts++;
			    }
			}

			if (!entryFound) {
			    System.out.println("Target text '" + targetText + "' not found after scrolling.");
			}		
			
			CommonMethods.screen.wheel(1, 3);
            
			CommonMethods. generatereport("D:\\Ikyam\\Development\\BAJAJ\\C13184\\To_Be_Processed");
	    }catch(Exception e) {
	    	
	    }
	}

	
	
	//login 13185 with three different branches.
	
	
	
	
	
	
	
}
