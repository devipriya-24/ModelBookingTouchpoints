package Hooks;

import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utility.CommonMethods;

import org.sikuli.script.ImagePath;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
//import com.aventstack.extentreports.gherkin.model.Scenario;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.Scenario;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class hooks {
	
	public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeAll
    public static void before_all() {
    	try {
    		
    		 new File("C:/AutomationReports").mkdirs();
        
        System.out.println("✅ Extent report initialized.");
    	}catch(Exception e) {
    		e.printStackTrace();
            System.out.println("❌ Failed to initialize extent report.");
    	}
    }
	
	 
	@Before()
	public void setup(Scenario scenario) {
		
		try {
		 // Initialize Extent test node per scenario
       // test = extent.createTest("Scenario: " + scenario.getName());
        //test.info("🚀 Scenario started: " + scenario.getName());
        //setup logic
		File tempFolder = new File(CommonMethods.TEMP_DIR);
        tempFolder.mkdirs();
        
     // Extract image resources from JAR to temp folder
        CommonMethods. extractAllResources("images", CommonMethods.TEMP_DIR);
        // Set Sikuli image search path
        ImagePath.add(CommonMethods.TEMP_DIR);
        
        CommonMethods.navigateToDesktop();
        CommonMethods.openExcellonApplication();
        
       // test.info("🔄 Setup complete and application opened.");
		}catch(Exception e) {
			//test.fail("❌ Error during setup: " + e.getMessage());
            e.printStackTrace();
		}
    }
	
	
	
	 @AfterStep
	    public void after_each_step(Scenario scenario) {
	        if (scenario.isFailed()) {
	            //test.fail("❌ Step failed"+scenario.getName());
	        } else {
	            //test.pass("✅ Step passed"+scenario.getName());
	        }
	    }
	 
	 
	@After
	 public void closeApplications(Scenario scenario)  {
			//screen.type(Key.ENTER);
			
		// CommonMethods.bringExcelToFront();
		 //CommonMethods.closeExcel();
		 try {
		 //close excel
		 CommonMethods.robot.keyPress(KeyEvent.VK_TAB);
		 CommonMethods.robot.keyRelease(KeyEvent.VK_TAB);

		 Thread.sleep(500); // Optional wait for stability

		 CommonMethods.robot.keyPress(KeyEvent.VK_ENTER);
		 CommonMethods.robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 //close app
		 CommonMethods.robot.keyPress(KeyEvent.VK_CONTROL);
		 CommonMethods.robot.keyPress(KeyEvent.VK_Q);
		 CommonMethods.robot.keyRelease(KeyEvent.VK_CONTROL);
		 CommonMethods.robot.keyRelease(KeyEvent.VK_Q);
		 
		 Thread.sleep(1000);
		 //click yes to close the app
		 CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "yesimage.png").similar(0.7), 5).click();
		  //test.info("🛑 Application closed successfully.");
		 }catch(Exception e) {
			 //test.fail("❌ Error during application close: " + e.getMessage());
			 e.printStackTrace();		 }
		}
	
	 @AfterAll
	    public static void after_all() 
	 {
		 SwingUtilities.invokeLater(() -> {
	            JOptionPane.showMessageDialog(
	                null,
	                "✅ Model Booking Statement Automation Complete!\n\n" +
	                "📄 Report Location:\nC:/AutomationReports/cucumber-report.html",
	                "🎉 Automation Finished",
	                JOptionPane.INFORMATION_MESSAGE
	            );
	        });
		 try {
	       // extent.flush(); // Write everything to file
			 Thread.sleep(5000);
	        
		 }catch(Exception e) {
			 e.printStackTrace();
	            
			 
		 }
	    }
	 
	 }
	 
	 
	 
	 
	 
	 
	 

