package runner;

import com.cucumber.listener.Reporter;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import contants.GlobalVariables;
import cucumber.api.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

//@RunWith(Cucumber.class)
/*
 * @ExtendedCucumberOptions(jsonReport = "target/cucumber.json", retryCount = 0,
 * //To rerun the scenario , if the scenario fails detailedReport = true,
 * detailedAggregatedReport = true, overviewReport = true, //coverageReport =
 * true, screenShotLocation="ScreenShots/", screenShotSize="100px",
 * jsonUsageReport = "target/cucumber-usage.json", usageReport = true, toPDF =
 * true, excludeCoverageTags = {"@flaky" }, includeCoverageTags = {"@passed" },
 * outputFolder = "target/")
 */

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
		retryCount = 0  //To rerun the scenario , if the scenario fails
)

@CucumberOptions(features = { "src/main/resources/features/D2CCartFeature/Functional.feature" }, plugin = { "json:target/cucumber.json",
		"html:target/site/cucumber-pretty", "usage:target/cucumber/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent-report/reports.html" }, glue = "steps",
		monochrome = true, tags = " @TEST_B2B-3890")

public class TestRunner  {

	@AfterClass
	public static void reportGeneration() {
		Reporter.loadXMLConfig(new File(GlobalVariables.userDir + "/extent-report-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", GlobalVariables.osName);
		Reporter.setSystemInfo("browser", GlobalVariables.browser);
	}

//	static String ReportName= CF.ReportName(); //function which creates file name as per the execution and saved in string.
//	@BeforeClass
//	public static void setup() {
//		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
//		extentProperties.setReportPath("target/cucumber-reports/"+ReportName+".html"); //used same string name to create the file with the same name.
//		PropertyConfigurator.configure(".//src//log4j.properties");
//	}
}



