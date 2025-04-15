
package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/main/resources/Featurefile",
    		
    glue = {"stepdefinition" ,"Hooks"},
    dryRun = false,
    monochrome = true
    		
    //tags= "not @13185 and not @13184 and  @13186 and not @13190 and not @13191 and not @13188 and not @13594 and not @1347 "
            //+ "and not @13184C and not @13719 and not @13185C and not @13952 and not @13186C"
)
public class TestRunner {
	
}










  


    






















































