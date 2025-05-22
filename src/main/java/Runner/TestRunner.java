	package Runner;
import org.junit.runner.RunWith;
import io.cucumber.core.cli.Main;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    //features ="src\\main\\resources\\Featurefile\\Modelbookingmaster_d13186.feature", 
//features ={"classpath:Featurefile/Modelbooking.feature"},// to convert exe file
features ={"classpath:Featurefile"},
    		
    glue = {"stepdefinition" ,"Hooks"},
    dryRun = false,
   // tags="@13184",	
		
		  plugin = { "pretty",
				  "html:C:/AutomationReports/cucumber-html-report",
				  "json:C:/AutomationReports/cucumber-json-report/report.json"  },
		 
    
    monochrome = true)			
public class TestRunner {
	/*public static void main(String[] args) {
        Main.main(new String[]{
            "--plugin", "pretty",
            "--plugin", "html:target/cucumber-report.html",
            "--glue", "stepdefinition",  //  step definitions package
            "classpath:Featurefile" //  feature file path
        });*/
	
}











  


    






















































