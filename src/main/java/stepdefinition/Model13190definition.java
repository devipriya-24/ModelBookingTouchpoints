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

public class Model13190definition {
	
        @When("user enters username {string} and password {string}")
        public void user_enters_username_and_password(String username4, String password4) {
		try {
			CommonMethods.enterusernameandpassword(username4, password4);
	        
	        
	}
	catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Step failed: " + e.getMessage(), e);
	}
        }  

															
	@Then("users click the branch")
	public void users_click_the_branch() {
		try {
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "search13190.png").similar(0.7), 10).click();
			CommonMethods.screen.type("Model Booking");
			
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "model13190.png").similar(0.7), 10).click();
			//CommonMethods.screen.wheel(1, 3);
       
          //  CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "modelbookingstmt.png").similar(0.7), 10).doubleClick();
            //CommonMethods.draganddrop();
            Thread.sleep(5000);
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
            CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "branch13190.png").similar(0.7), 10).click();
           
                        
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Step failed: " + e.getMessage(), e);
        }
	
		
	    
	}
	@Then("user choose the branch as13190 make the report")  //Dada13190
	public void user_choose_the_branch_as13190_make_the_report() {
		 try {
		    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Dada13190.png").similar(0.7), 10).doubleClick();
	            //screen.mouseMove(100);
		    	//CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
				//CommonMethods.screen.wheel(1, 3);
		    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
		    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
		    	CommonMethods.screen.wheel(1,3);
		    	//CommonMethods.screen.wheel(1, 2);
		    	String dir9 = CommonMethods.getCredential("Directory9");
				CommonMethods. generatereport(dir9);
	            
	           // CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\13190\\To_Be_Processed");
		    }catch(Exception e) {
		    	throw new RuntimeException("Step failed: " + e.getMessage(), e);
		    }
	}
	
	@Then("user choose the branch as13190 BRN11 make the report")
	public void user_choose_the_branch_as13190_brn11_make_the_report() {
		try {
	        String targetText = "13190BRN11";
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
			
			
			//CommonMethods.screen.wheel(1, 3);
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
	    	CommonMethods.screen.wheel(1,3);
			String dir10 = CommonMethods.getCredential("Directory10");
			CommonMethods. generatereport(dir10);
	      
	    }catch(Exception e) {
	    e.printStackTrace();	
	    throw new RuntimeException("Step failed: " + e.getMessage(), e);
	    }
	}


	
	
	
	
	


}
