package stepdefinition;

import org.sikuli.script.Pattern;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import utility.CommonMethods;


public class Model13184cdefinition {
	
	
	@Given("user enter name {string} and pass {string}")
	public void user_enter_name_and_pass(String username9, String password9) {
	try{
			CommonMethods.enterusernameandpassword(username9, password9);
	}catch(Exception e) {
		e.printStackTrace();
		throw new RuntimeException("Step failed: " + e.getMessage(), e);
	}
	        
	}

	@Then("user select the branch and makes the report")
	public void user_select_the_branch_and_makes_the_report() {
		try {
			
			
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "search13190.png").similar(0.7), 10).click();
			CommonMethods.screen.type("Model Booking");
			
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "model13190.png").similar(0.7), 10).click();
			Thread.sleep(1000);	    	
	         CommonMethods.draganddrop1();
	         CommonMethods.screen.wheel(1, 2);
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
			CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "downarrow.png").similar(0.7), 10).click();
			CommonMethods.screen.wheel(1, 3);
	    	String dir17 = CommonMethods.getCredential("Directory17");
			CommonMethods. generatereport(dir17);
	    	
	    	//CommonMethods.generatereport("D:\\Ikyam\\Development\\BAJAJ\\13184c\\To_Be_Processed");
            //generatereport("D:\\Ikyam\\Development\\BAJAJ\\13184c\\To_Be_Processed");
	    }catch(Exception e) {
	    	e.printStackTrace();
	    	throw new RuntimeException("Step failed: " + e.getMessage(), e);
	    }
		
	}

}
