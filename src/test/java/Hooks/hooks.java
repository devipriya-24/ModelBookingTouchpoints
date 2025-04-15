package Hooks;

import java.awt.event.KeyEvent;
import java.io.File;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.CommonMethods;

import org.sikuli.script.ImagePath;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;

public class hooks {
	
	 
	@Before()
	public void setup() {
		File tempFolder = new File(CommonMethods.TEMP_DIR);
        tempFolder.mkdirs();
        ImagePath.add(CommonMethods.TEMP_DIR);
        CommonMethods. extractAllResources("images", CommonMethods.TEMP_DIR);
        CommonMethods.navigateToDesktop();
        CommonMethods.openExcellonApplication();
    }
	
	
	
	
	 
	 
	 @After
	 public void closeApplications() throws InterruptedException {
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
		 CommonMethods.robot.keyPress(KeyEvent.VK_ALT);
		 CommonMethods.robot.keyPress(KeyEvent.VK_F4);
		 CommonMethods.robot.keyRelease(KeyEvent.VK_ALT);
		 CommonMethods.robot.keyRelease(KeyEvent.VK_F4);
		 
		 Thread.sleep(1000);
		 //click yes to close the app
		 CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "yesimage.png").similar(0.7), 5).click();
		
		 }catch(Exception e) {
			 e.printStackTrace();		 }
		}
	 
	 }
	 
	 
	 
	 
	 
	 
	 

