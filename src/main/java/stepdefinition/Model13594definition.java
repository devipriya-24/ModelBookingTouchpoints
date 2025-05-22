package stepdefinition;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.sikuli.script.App;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.CommonMethods;

public class Model13594definition {
	
	@When("user logging in using username {string} and password {string}")
	public void user_logging_in_using_username_and_password(String username7, String password7) {
		try {
			CommonMethods.enterusernameandpassword(username7, password7);
	        
	}
	catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Step failed: " + e.getMessage(), e);
	}
	}
	@Then("user must click the branch")
	public void user_must_click_the_branch() {
		try {
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "search13190.png").similar(0.7), 10).click();
			CommonMethods.screen.type("Model Booking");
			
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "model13190.png").similar(0.7), 10).click();
			
			Thread.sleep(1000);
			
			//CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "sales.png").similar(0.7), 10).doubleClick();
			//CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "reports.png").similar(0.7), 10).doubleClick();
			//CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Msales.png").similar(0.7), 10).doubleClick();
			//CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "stmt.png").similar(0.7), 10).doubleClick();
			//CommonMethods.screen.wheel(1, 3);
           // Thread.sleep(1000);
           // CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "modelbookingstmt.png").similar(0.7), 10).doubleClick();
            
           // Thread.sleep(3000);
            CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "rep.png").similar(0.7), 10).doubleClick();
            
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
            throw new RuntimeException("Step failed: " + e.getMessage(), e);
        }
	}
	
	@Then("users selects the branch as {int} generate the report")
	public void users_selects_the_branch_as_generate_the_report(Integer int1) {
		try {
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Dada13594.png").similar(0.7), 10).doubleClick();
            //screen.mouseMove(100);
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
	    	CommonMethods.screen.wheel(1,3);
	    	String dir13 = CommonMethods.getCredential("Directory13");
			CommonMethods. generatereport(dir13);
			
	    	//CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\13594\\To_Be_Processed");
	    }catch(Exception e) {
	    	throw new RuntimeException("Step failed: " + e.getMessage(), e);
	    }
	}
	

	
	@Then("I clicking the branch as A13594 make the report")
	public void i_clicking_the_branch_as_a13594_make_the_report() {
		try {
	        String targetText = "A13594";
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
			
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
	    	CommonMethods.screen.wheel(1,3);
			String dir14 = CommonMethods.getCredential("Directory14");
			CommonMethods. generatereport(dir14);
			
	       // CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\A13594\\To_Be_Processed");
	    }catch(Exception e) {
	    e.printStackTrace();	
	    throw new RuntimeException("Step failed: " + e.getMessage(), e);
	    }
	}

	

	@Then("customer clicks the branch as B13594 get the report")
	public void customer_clicks_the_branch_as_b13594_get_the_report() {
try {
			
			
			//to select the branch B13594
	String targetText = "B13594";
	boolean entryFound = false;
	int maxScrollAttempts = 50;
	int attempts = 0;

	while (attempts < maxScrollAttempts) {
	    // Capture visible screen text
	    String visibleText = CommonMethods.screen.text(); // OCR read
	    System.out.println("Visible Text: " + visibleText);

	    if (visibleText != null && visibleText.contains(targetText)) {
	        System.out.println("Text found: " + targetText);
	        
	        try {
	        // Now find the pattern near the matched text (or approximate location)
	        Match match = CommonMethods.screen.findText(targetText); // This attempts to find location of the string
	        if (match != null) {
	        	 match.highlight(1);
	             Region clickRegion = new Region(match.getX() - 5, match.getY() - 5, match.getW() + 10, match.getH() + 10);
	             clickRegion.click();
	            System.out.println("Successfully clicked on: " + targetText);
	            entryFound = true;
	        }else {
	            System.out.println("Text found but region not detected.");
	        }
	        }
	        catch (FindFailed ff) {
                System.out.println("OCR match failed: " + ff.getMessage());
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
	    try {
	    Pattern branchPattern = new Pattern(CommonMethods.TEMP_DIR + "B13594_image.png").similar(0.8);
        CommonMethods.screen.wait(branchPattern, 10).click();
        entryFound = true;
	    }catch (FindFailed ff) {
            throw new RuntimeException("Both OCR and image fallback failed to locate B13594.", ff);
        }
	    
	}
	
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
	    	CommonMethods.screen.wheel(1,3);
			
			String dir15 = CommonMethods.getCredential("Directory15");
			CommonMethods. generatereport(dir15);
            
            //CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\B13594\\To_Be_Processed");
	    }catch(Exception e) {
	    	 e.printStackTrace();	
	    	throw new RuntimeException("Step failed: " + e.getMessage(), e);
	    }
		
	    
	}
	}








