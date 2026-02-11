package runnerPack;

import org.testng.annotations.Listeners;
import basePack.ListenerClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@Listeners(ListenerClass.class)
@CucumberOptions(
	    features =  "src/test/resources/features",
	    glue = {"stepDefinitions", "hooks"},
	    tags = "@Smoke"
		
		)
public class TestRunner extends AbstractTestNGCucumberTests
{

}
