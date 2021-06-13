
package TestRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Feature",
        glue= {"StepDefination","utilities"},
        tags= {"@Regression1"}  //AND Condition
       // tags= {"@Regression","@Sanity"}
        )
public class testrunner {
    
    
    
}
