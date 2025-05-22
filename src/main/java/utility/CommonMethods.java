package utility;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.sikuli.script.App;
import org.sikuli.script.Button;
import org.sikuli.script.Key;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import com.aventstack.extentreports.ExtentTest;

import stepdefinition.Modelstepdefinition;

public class CommonMethods {
	
	public static final Screen screen = new Screen();
	 public static Robot robot;
	 public static final String TEMP_DIR = System.getProperty("java.io.tmpdir") + "bajajautomateimages/";
	// public static ExtentTest test;
	 
	
	

	 
	public static void extractAllResources(String resourceFolder, String outputFolder) {
        try {
            ClassLoader classLoader = utility.CommonMethods.class.getClassLoader();;
            InputStream in = classLoader.getResourceAsStream(resourceFolder);
            if (in == null) return;
            String[] resourceFiles = {"exc_icon.png", "server.png", "username.png", "password.png", "sales.png", "reports.png", "Msales.png", "modelstmt.png", 
            		"modelbookingstmt.png", "rep.png", "clickreport.png","crop_rep.png","Model_branch.png","Dada.png","fromdaterange.png",
            		"custimage.png","staxes.png","shoetaxdet.png","fromdate.png","generatereports.png","connect.png","stmt.png","ccode.png",
            		"XLS.png","exportlink.png","A13184.png","scrolldown.png","Dada13186.png","Dada13190.png","Dada13592.png","Dealer1.png",
            		"Dada13185.png","search13190.png","model13190.png","branch13190.png","Dada13191.png","daterange.png","Msales.png","rep.png",
            		"Dada13188.png","Dada13454.png","Dada13594.png","Dada13719.png","Dada13186c.png","ecomID.png","downarrow.png","DDname2.png",
            		"daterange1.png","yesimage.png","rightclickbranch.png","documentdate.png","documentname.png","Dealer.png","B13594_image.png",
            		"docname.png","Docname1.png","DDname1.png","DDate.png","showgroupbybox.png","hidegroupbybox.png"};
            
            for (String fileName : resourceFiles) {
                extractResource("images/" + fileName, outputFolder + fileName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	public static void extractResource(String resourcePath, String outputPath) {
        try (InputStream in = utility.CommonMethods.class.getClassLoader().getResourceAsStream(resourcePath)) {
            if (in == null) return;
            File outputFile = new File(outputPath);
            outputFile.getParentFile().mkdirs();
            try (FileOutputStream out = new FileOutputStream(outputFile)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public static void navigateToDesktop() {
		 try {
				robot = new Robot();
		        robot.keyPress(KeyEvent.VK_WINDOWS);
		        robot.keyPress(KeyEvent.VK_D);
		        robot.keyRelease(KeyEvent.VK_D);
		        robot.keyRelease(KeyEvent.VK_WINDOWS);
		        Thread.sleep(3000);
				}catch(Exception e) {
					e.printStackTrace();
				}
	 }
	public static void openExcellonApplication() {
		 try {
	            Pattern excIcon = new Pattern(TEMP_DIR + "exc_icon.png").similar(0.7);
	            Match match = screen.exists(excIcon, 5);
	            if (match != null) {
	            	System.out.println("Excellon icon found! Clicking...");
	            	match.highlight(2);
	                match.doubleClick();
	            } else {
	            	System.out.println("Image not found ! Trying to bring the app to the front");
	                App excellonApp = new App("esfw5ui");
	                Thread.sleep(3000);
	                excellonApp.focus();
	               
	                if (!excellonApp.isValid()) {
	                	System.out.println("App focus failed! Launching Excellon using file path...");
	                    launchExcellonApp();
	                    
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 }
	 private static void launchExcellonApp() {
	        try {
	            String userDir = System.getProperty("user.home");
	            String excellonShortcut = userDir + "\\Desktop\\Excellon 5.appref-ms";
	            File shortcutFile = new File(excellonShortcut);
	            
	            if (shortcutFile.exists()) {
	            	System.out.println("Launching Excellon app from: " + excellonShortcut);
	            	//String command = "cmd /c start \"\" \"" + excellonShortcut + "\"";
	            	//String command = "cmd /c start \"\" \"https://bajajuirelease.azureedge.net/bajajuirelease/sc/esfw5ui.application\"";
	            	// Runtime.getRuntime().exec(command);
	            	ProcessBuilder builder = new ProcessBuilder("cmd", "/c", "start", "", excellonShortcut);
	            	builder.start();
	            	 System.out.println("Excellon app launched successfully.");
	            } else {
	                System.out.println("Excellon app shortcut does not exist: " + excellonShortcut);
	                String url = "https://bajajuirelease.azureedge.net/bajajuirelease/sc/esfw5ui.application";
	                ProcessBuilder builder = new ProcessBuilder("cmd", "/c", "start", "", url);
	                builder.start();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	//read data from notepad
		 public static String getCredential(String key) throws IOException {
			 try {
		        // External Notepad file path
		        String filePath = "C:\\My App\\credentials.txt";
		        BufferedReader reader = new BufferedReader(new FileReader(filePath));
		        String line;
		        while ((line = reader.readLine()) != null) {
		        	if (line.contains(key)) {
		                return line.split("=")[1].trim();
		        }
		        }
		        
		        throw new Exception("Key not found in file: " + key);
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			return key;
			
		    }
		
	public static void pressTab(Screen screen, int times) {
        try {
            for (int i = 0; i < times; i++) {
                screen.type(Key.TAB);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Error while pressing TAB: " + e.getMessage());
        }
	}
	
	public static void typeText(Robot robot, String text) {
		 try {
			
	     for (char ch : text.toCharArray()) {
	         int keyCode = KeyEvent.getExtendedKeyCodeForChar(ch);
	         if (KeyEvent.CHAR_UNDEFINED == keyCode) {
	             throw new RuntimeException("Key code not found for character '" + ch + "'");
	         }
	         robot.keyPress(keyCode);
	         robot.keyRelease(keyCode);
	     }
	 }catch(Exception e ) {
		 e.printStackTrace();
	 }
		 
	 }
	public static void enterusernameandpassword(String usernameKey, String passwordKey) {
		try {
			 String username = CommonMethods.getCredential(usernameKey);
		        String password = CommonMethods.getCredential(passwordKey);
	        App excellonApp = new App("esfw5ui");
	        excellonApp.focus();
	        Thread.sleep(2000);
	        
	        // Check and click server field if found
	        
	        Pattern serverPattern = new Pattern(CommonMethods.TEMP_DIR + "server.png").similar(0.8);
	        if (CommonMethods.screen.exists(serverPattern, 10) != null) {
	        	CommonMethods.screen.click(serverPattern);
	        	//test.pass("Clicked on server field");
	            Thread.sleep(500);
	        } else {
	        	//test.fail("server image not found");
	            System.out.println("Server image not found, skipping...");
	        }
	     // Check and click username field if found
	        Pattern usernamePattern = new Pattern(CommonMethods.TEMP_DIR + "username.png").similar(0.7);
	        if (CommonMethods.screen.exists(usernamePattern, 10) != null) {
	        	CommonMethods.screen.doubleClick(usernamePattern);
	        	CommonMethods.screen.type(Key.DELETE); 
	        	CommonMethods.screen.type(username);
	        	//test.pass("Enter username as"+username);
	            Thread.sleep(500);
	        }
	        else {
	        	//test.fail("Username image not found");
	        	System.out.println("User name is not found");
	        }
	        Pattern passwordPattern = new Pattern(CommonMethods.TEMP_DIR + "password.png").similar(0.7);
	        if (CommonMethods.screen.exists(passwordPattern, 10) != null) {
	        	CommonMethods.screen.click(passwordPattern);
	        	CommonMethods.screen.type(password);
	        	//test.pass("Entered pass word as "+password);
	            Thread.sleep(500);
	        }
	        else {
	        	System.out.println("Password is not found");
	        }
	      //  CommonMethods.screen.type(Key.SHIFT + Key.TAB);
	        //Thread.sleep(500);
	        
	        //Enter username
	       // CommonMethods.typeText(CommonMethods.robot, username);
	        //Thread.sleep(500);
	        
	     // Press TAB to move to the password field
	       // CommonMethods.screen.type(Key.TAB);
	        //Thread.sleep(500);
	        
	     // Enter password
	       // CommonMethods.typeText(CommonMethods.robot, password);
	        //Thread.sleep(500);
	        
	        Pattern connectBtn = new Pattern(CommonMethods.TEMP_DIR + "connect.png").similar(0.8);
	        if (screen.exists(connectBtn, 5) != null) {
	            screen.click(connectBtn);
	        } else {
	            System.out.println("Connect button not found!");
	        }
	        
			
			// CommonMethods.pressTab(CommonMethods.screen,1);
			  Thread.sleep(30000);
			  
			  CommonMethods. screen.type(Key.ENTER);
			   CommonMethods. screen.type(Key.ENTER);
			  Thread.sleep(500); 
			  CommonMethods.screen.type(Key.ENTER);
			 
			
			  //screen.type(Key.ENTER); Thread.sleep(15000);
			 
	        
	}
	catch(Exception e) {
			e.printStackTrace();
	}
		
	}											
	 public static void draganddrop() {
			try {
				//Rightclick on the document name
				//test.info("drag and drop the document date");
				
				Pattern docname = new Pattern(CommonMethods.TEMP_DIR + "docname.png").similar(0.8);
	        	Pattern docname1 = new Pattern(CommonMethods.TEMP_DIR + "Docname1.png").similar(0.7);
	        	Pattern docname2 = new Pattern(CommonMethods.TEMP_DIR + "DDname1.png").similar(0.8);
	        	Pattern docname3 = new Pattern(CommonMethods.TEMP_DIR + "DDname2.png").similar(0.8);
	        	
	        	 Pattern[] patterns = { docname, docname1, docname2,docname3};
	        	   // boolean found = false;
	        	 Pattern targetDoc = null;
	        	    for (Pattern pattern : patterns) {
	        	        if (CommonMethods.screen.exists(pattern, 5) != null) {
	        	            Location loc = CommonMethods.screen.find(pattern).getTarget();
	        	            CommonMethods.screen.mouseMove(loc);
	        	            Thread.sleep(500);

	        	            Robot robot = new Robot();
	        	            robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
	        	            robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);

	        	            targetDoc = pattern;
	        	            break;
	        	        }
	        	    }
	        	   
		        	
		        	//Pattern documentDate = new Pattern(CommonMethods.TEMP_DIR + "DDate.png").similar(0.7);
		        	Pattern documentDate = new Pattern(CommonMethods.TEMP_DIR + "DDate.png").similar(0.7);
		        	
		        	
		        	// Check for docname image
		        	if (CommonMethods.screen.exists(docname, 5) != null) {
		        	    CommonMethods.screen.rightClick(docname);
		        	    targetDoc = docname;
		        	} 
		        	//If not found, check for Docname1
		        	else if (CommonMethods.screen.exists(docname1, 5) != null) {
		        	    CommonMethods.screen.rightClick(docname1);
		        	    targetDoc = docname1;
		        	}
		        	else if(CommonMethods.screen.exists(docname2, 5) != null){
		        		CommonMethods.screen.rightClick(docname1);
		        	    targetDoc = docname1;
		        	}
		        	// Perform drag and drop if target found
		        	if (targetDoc != null) {
		        	    // Check for Show Group By box
		        	    if (CommonMethods.screen.exists("showgroupbybox.png", 3) != null) {
		        	        CommonMethods.screen.click();
		        	      //  test.pass("click the show group by box");
		        	        
		        	        // Wait for both images to appear
		        	        CommonMethods.screen.wait(documentDate, 5);
		        	        CommonMethods.screen.wait(targetDoc, 5);
		        	        
		        	        // Drag & Drop
		        	        CommonMethods.screen.dragDrop(documentDate, targetDoc);
		        	      //  test.fail("drag anddrop the document date");
		        	    }
		        	    else {
		        	    	//test.fail("Failed to drag and drop, document images was not found");
		        	    }
		        	
		        	}
		       //click Hide group by box
		        	
		        	// After drag-drop, right click and click hide group by box
		            CommonMethods.screen.rightClick(targetDoc);
		            Pattern hideGroup = new Pattern("hidegroupbybox.png");
		            
		           if( CommonMethods.screen.exists(hideGroup, 3)!=null) {
		        	   CommonMethods.screen.click(hideGroup);
		        	  // test.pass("Click the hidegroupby bix image");
		           }else {
		        	  // test.fail("hidegroupby box image not found");
		           }
		            
		            
		        	
				
			}catch(Exception e) {
				
			}
		}
	 public static void generatereport(String targetDirectory) {
			try {
				//datedrop.png
				System.out.println("started generate report");
				//test.info("Started to generate the report");
				if(CommonMethods.screen.exists(new Pattern(CommonMethods.TEMP_DIR + "daterange.png").similar(0.75), 20)!=null) {
					CommonMethods.screen.click(new Pattern(CommonMethods.TEMP_DIR + "daterange.png").similar(0.75));
					//test.pass("select the date range as custom");
				}else if(CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "daterange1.png").similar(0.7),15)!=null) {
					CommonMethods.screen.click(new Pattern(CommonMethods.TEMP_DIR + "daterange1.png").similar(0.75));
				//	test.pass("select the date range as custom");
				}
				
				//CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "daterange.png").similar(0.7), 20).click();
				Pattern cust=new Pattern(CommonMethods.TEMP_DIR + "custimage.png").similar(0.8);
				
				if(CommonMethods.screen.exists(new Pattern(cust),10)!=null) {
					CommonMethods.screen.click(cust);
					//test.pass("clicked the custom image");
					
				}
				else {
					//test.fail("Custom image is not found unable to click");
				}
				//CommonMethods.screen.click(new Pattern(CommonMethods.TEMP_DIR + "custimage.png").similar(0.8));
				
				Pattern staxes=new Pattern(CommonMethods.TEMP_DIR+"staxes.png").similar(0.7);
				if(CommonMethods.screen.exists(new Pattern(staxes),10)!=null) {
				new Region(1000, 150, 400, 600).wait(new Pattern(staxes)).click();
				//test.pass("Select the show taxes chk boxes");
				}else {
					//test.fail("Showtaxes images are found");
				}
				
				Pattern staxesdate=new Pattern(CommonMethods.TEMP_DIR+"shoetaxdet.png").similar(0.7);
				if(CommonMethods.screen.exists(new Pattern(staxesdate),10)!=null) {
				CommonMethods.screen.click(staxesdate);
				//test.pass("Select the showtaxdate check box");
				}else {
					//test.fail("Showtaxdate images are not found");
				}
				CommonMethods.screen.wheel(Button.WHEEL_DOWN, 2);
				//CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "fromdaterange.png").similar(0.7), 5).click();
				//Thread.sleep(500); 

				//CommonMethods.screen.type("a", Key.CTRL);
				//Thread.sleep(200);

				// Press DELETE to remove the selected text
				//CommonMethods.screen.type(Key.DELETE);
				//Thread.sleep(300);					
				 
				//String fromDate = getCredential("from date");  // Fetch from Notepad
				//CommonMethods.screen.type(fromDate);
				
				//CommonMethods.screen.wheel(1,3);
			
				Thread.sleep(1000);
				
				

				CommonMethods.screen.type(Key.ENTER);
				CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "generatereports.png").similar(0.8), 10).click();
				Thread.sleep(5000);
				CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "XLS.png").similar(0.8), 10).click();
				CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "exportlink.png").similar(0.8), 10).click();
				CommonMethods.screen.type(Key.ENTER);
				
				// to enter file path
							Thread.sleep(1000);
							CommonMethods.screen.type("a", Key.CTRL);
							CommonMethods.screen.type(Key.BACKSPACE);
							// Format: YYYY-MM-DD_HH-MM-SS
					        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
					        String newFileName = "Model Booking Statement_" + timestamp + ".xls";
					        CommonMethods.screen.type(newFileName);
							
							// Focus on the directory path
					        CommonMethods.screen.type("d", Key.ALT);  
							Thread.sleep(1000);
							
							CommonMethods.screen.type("a", Key.CTRL); // Select all text
							CommonMethods.screen.type(Key.BACKSPACE); // Clear existing path
							Thread.sleep(500);
							
							CommonMethods.screen.type(targetDirectory);
							Thread.sleep(1000);
							CommonMethods.screen.type(Key.ENTER);
					        
					     // click save btn
							CommonMethods.screen.type("s", Key.ALT); 
							CommonMethods.screen.type(Key.ENTER);
							//closeApplications();

				Thread.sleep(2000);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	 public static void draganddrop1() {
			
			
			try {
				//drag and drop
				System.out.println("Start excuting drag and drop");
				Thread.sleep(1000);
				Pattern branch1 = new Pattern(CommonMethods.TEMP_DIR + "ccode.png").similar(0.8);
				Match match = CommonMethods.screen.exists(branch1, 5);
			
				// CommonMethods.screen.hover(branch1);
				 //Thread.sleep(500);
				if (match != null) {
					Location loc = match.getTarget();
					CommonMethods.screen.mouseMove(loc); 
				 Robot robot = new Robot();
				 robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
				 robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
				}
				// CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "ccode.png").similar(0.7), 10).rightClick();
				
				// Click on Show Group By Box
				Pattern showGroupByBox = new Pattern(CommonMethods.TEMP_DIR + "showGroupByBox.png").similar(0.7);
				CommonMethods.screen.wait(showGroupByBox, 10);
				CommonMethods.screen.click(showGroupByBox);
				Thread.sleep(1000);
				
				//  Drag & Drop DocumentDate to Branch
				Pattern documentDate = new Pattern(CommonMethods.TEMP_DIR + "documentdate.png").similar(0.7);
				CommonMethods.screen.wait(documentDate, 10);
				
				CommonMethods.screen.mouseMove(documentDate);
				CommonMethods.screen.mouseDown(Button.LEFT);
				
				Pattern branch = new Pattern(CommonMethods.TEMP_DIR + "Dealer.png").similar(0.7);
				CommonMethods.screen.mouseMove(branch);
				CommonMethods.screen.mouseUp(Button.LEFT);
				 
			//  Drag & Drop Documentname to Branch
						Pattern documentname = new Pattern(CommonMethods.TEMP_DIR + "documentname.png").similar(0.7);
						CommonMethods.screen.wait(documentname, 10);
						
						CommonMethods.screen.mouseMove(documentname);
						CommonMethods.screen.mouseDown(Button.LEFT);
						CommonMethods.screen.mouseMove(branch);
						CommonMethods.screen.mouseUp(Button.LEFT);
						
					//  Drag & Drop Documentname to Branch
						Pattern ecomID = new Pattern(CommonMethods.TEMP_DIR + "ecomID.png").similar(0.7);
						CommonMethods.screen.wait(ecomID, 10);
						
						CommonMethods.screen.mouseMove(ecomID);
						CommonMethods.screen.mouseDown(Button.LEFT);
						CommonMethods.screen.mouseMove(branch);
						CommonMethods.screen.mouseUp(Button.LEFT);
								
				
				CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "Dealer.png").similar(0.7), 10).rightClick();
				CommonMethods.screen.wait(new Pattern(CommonMethods.TEMP_DIR + "hidegroupbybox.png").similar(0.7), 10).click();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	
}
