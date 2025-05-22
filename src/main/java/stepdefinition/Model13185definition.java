package stepdefinition;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.sikuli.script.App;
import org.sikuli.script.Button;
import org.sikuli.script.Key;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.CommonMethods;

public class Model13185definition {
	
	@Given("user log in using username {string} and password {string}")
	public void user_log_in_using_username_and_password(String username2, String password2) {
		try {
			CommonMethods.enterusernameandpassword(username2, password2);
		}
	catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Step failed: " + e.getMessage(), e);
	}
	}
	@Then("user should click the branch")
	public void user_should_click_the_branch() {
		try {
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "search13190.png").similar(0.7), 10).click();
			CommonMethods.screen.type("Model Booking");
			
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "model13190.png").similar(0.7), 10).click();
			Thread.sleep(1000);
			
			
            
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
	@Then("users select the branch as {int} generate the report")
	public void users_select_the_branch_as_generate_the_report(Integer int1) {
		try {
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Dada13185.png").similar(0.7), 10).doubleClick();
            //screen.mouseMove(100);
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
	    	CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
	    	CommonMethods.screen.wheel(1, 2);
	    	
	    	String dir5 = CommonMethods.getCredential("Directory5");
			CommonMethods. generatereport(dir5);
            
	    	//CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\13185\\To_Be_Processed");
	    }catch(Exception e) {
	    	throw new RuntimeException("Step failed: " + e.getMessage(), e);
	    }
	}
	
	@Then("users select the branch as A {int} click the report")       //A13185
	public void users_select_the_branch_as_a_click_the_report(Integer int1) {
try {
	        String targetText = "A13185";
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
			CommonMethods.screen.wheel(1, 3);
			String dir6 = CommonMethods.getCredential("Directory6");
			CommonMethods. generatereport(dir6);
	        //CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\A13185\\To_Be_Processed");
	    }catch(Exception e) {
	    e.printStackTrace();	
	    throw new RuntimeException("Step failed: " + e.getMessage(), e);
	    }
	}
	
	@Then("users select the branch as B {int} click the report")  //B13185
	public void users_select_the_branch_as_b_click_the_report(Integer int1) {
try {
			
			
			//to select the branch B13184
			String targetText = "B13185";
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
			//CommonMethods.screen.wheel(1, 3);
			CommonMethods.screen.wheel(1, 3);
            
			String dir7 = CommonMethods.getCredential("Directory7");
			CommonMethods. generatereport(dir7);
			
           // CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\B13185\\To_Be_Processed");
	    }catch(Exception e) {
	    	throw new RuntimeException("Step failed: " + e.getMessage(), e);
	    }
		
	    
	}
	
	}

