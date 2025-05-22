package Runner;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.apache.commons.io.output.TeeOutputStream;
import org.junit.runner.JUnitCore;


import com.aventstack.extentreports.ExtentTest;

public class RunWithMain {
	public static ExtentTest test; 
	 public static void main(String[] args) {
		 
		 String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        String logFilePath = "C:/AutomationReports/ModelBookingConsole_" + timestamp + ".txt";
	        
	        
	     // Set cucumber report paths BEFORE running JUnit
			/*
			 * String reportDir = "C:/AutomationReports/cucumber-html-report-" + timestamp;
			 * System.setProperty("html.report.path", reportDir);
			 * System.setProperty("json.report.path", reportDir + "/report.json");
			 */
	       //86 new File("C:/AutomationReports").mkdirs();

	        
	        // ===== Redirect console output =====
	        try {
	            PrintStream fileOut = new PrintStream(new FileOutputStream(logFilePath));
	            PrintStream dualOut = new PrintStream(new TeeOutputStream(System.out, fileOut)); // both console and file
	            System.setOut(dualOut);
	            System.setErr(dualOut);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
		// 1. Show START popup
		 JOptionPane optionPane = new JOptionPane(
	                "Model Booking Statement is starting.\nPlease don't disturb the screen.\nMake sure the screen is active.",
	                JOptionPane.INFORMATION_MESSAGE);
	        
		 JDialog dialog = optionPane.createDialog("Automation Starting");
	        dialog.setModal(false);
	        dialog.setAlwaysOnTop(true);
	        dialog.setVisible(true);
	        
	     // Auto-close after 5 seconds (5000 ms)
	        new Thread(() -> {
	            try {
	                Thread.sleep(4000);
	                dialog.setVisible(false);
	                dialog.dispose();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }).start(); 
	        
		 try {
		 
	        System.out.println("Running automation with UI...");
	       
	        JUnitCore.main("Runner.TestRunner");
	        
		 }catch(Exception e) {
			 e.printStackTrace();
	           
			 
		 }
		 
		
	            
	    
		// 3. Show END popup
		 

	        JOptionPane endPane = new JOptionPane(
			        "Model Booking Statement EXE finished.\nCheck the report at:\n" +" C:/AutomationReports/cucumber-html-report",
			        JOptionPane.INFORMATION_MESSAGE);
			JDialog endDialog = endPane.createDialog("Model booking Automation Complete");
			endDialog.setModal(false);
			endDialog.setAlwaysOnTop(true);
			endDialog.setVisible(true);

			// Auto-close in 3 seconds
			new Thread(() -> {
			    try {
			        Thread.sleep(3000);
			        endDialog.setVisible(false);
			        endDialog.dispose();
			    } catch (InterruptedException e) {
			        e.printStackTrace();
			    }
			}).start();
}
	 }

