package contants;


import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.ConfigurationFactory;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.logging.FileHandler;

public class GlobalVariables {

	public static Configuration config = null;
	public static boolean AUTOEXECTIONSTATUS = true;
	public static boolean initilizestatus = false;
	public String DESKTOP = "DESKTOP";
	public String ANDROID = "ANDROID";
	public String IOS = "IOS";
	public String ANDROIDAPP = "ANDROIDAPP";
	public String IOSAPP = "IOSAPP";
	public String FUNCTIONAL = "FUNCTIONAL";
	public String REGRESSION = "REGRESSION";
	public static RemoteWebDriver driver;

	public static String fileName;
	public static String sheetName;
	public static String rowId;
	public static String userDir = System.getProperty("user.dir");
	public static String firefoxBinaryPath = null;
	public static String adtSDKPath = null;
	public static String runReportPath = null;
	public static String osName = System.getProperty("os.name").trim();
	public static String currentBrowserName = null;
	public static BufferedWriter customReportOutput = null;
	public static String customReportPath = null;
	public static String closeBrowser = null;
	public static String maximizeBrowser = null;
	public static String driverPath = null;
	public static String enableCucumberReport = null;
	public static String runMode = null;
	public static String runEnvironment;
	public static String breakPoint = null;
	public static String targetOperatingSystem = null;
	public static String appType = null;
	public static String appUrl = null;
	public static String appUrlOE = null;
	public static String browser = null;
	public static String platformName = null;
	public static String bundleID = null;
	public static String appPath = null;
	public static String UDID = null;
	public static String PlatformVersion = null;
	public static String browserName = null;
	public static String deviceName = null;
	public static String deviceId = null;
	public static String appPackage = null;
	public static String appActivity = null;
	public static String appiumHost = null;
	public static String appiumPort = null;
	public static int elementWaitInSeconds = 0;
	// RAM - 08/28/2014 - For Android Multiple Device Execution
	public static ArrayList<String> AndroidDevices = new ArrayList<String>();
	public static int deviceAssingmentCounter = 0;
	public static boolean openExcelSheet = true;
	public static String killChromeDriver = null;
	public static String extendreportFilePath;
	public static int timeOut = 0;
	public static String  loginclass_path;
	public static String registrationclass_path;



	public static java.util.logging.Logger logger = java.util.logging.Logger.getLogger("Log");
	public static FileHandler loggerFileHandler;
	protected GlobalVariables() {

		try {
			System.setProperty("currentDir", userDir);


			if (!initilizestatus) {
				try {
					ConfigurationFactory factory = new ConfigurationFactory("config/config.xml");
					config = factory.getConfiguration();

					breakPoint = config.getString("breakPoint");
					targetOperatingSystem = config.getString("targetOperatingSystem");
					appUrl = config.getString("appUrl");
					appUrlOE = config.getString("appUrlOE");
					maximizeBrowser = config.getString("maximizeBrowser");
					browser = config.getString("browser");
					driverPath = config.getString("driverPath");
					extendreportFilePath = userDir + config.getString("extendreportFilePath");
					elementWaitInSeconds = config.getInt("elementWaitInSeconds");
					timeOut = config.getInt("timeOut");
					fileName = config.getString("InputFileName");
					runEnvironment = config.getString("environment");
					platformName = config.getString("platformName");
					PlatformVersion = config.getString("PlatformVersion");
					deviceName = config.getString("deviceName");
					deviceId = config.getString("deviceId");
					appPackage = config.getString("appPackage");
					appActivity = config.getString("appActivity");
					loginclass_path = "testdata."+runEnvironment+".LoginTestData";
					registrationclass_path = "testdata."+runEnvironment+".RegistrationTestData";
					appiumHost=config.getString("appiumHost");
					appiumPort=config.getString("appiumPort");
					bundleID=config.getString("bundleId");
					appPath=config.getString("appPath");
					UDID=config.getString("udid");
					browserName=config.getString("CHROME");
				} catch (ConfigurationException e) {
					AUTOEXECTIONSTATUS = false;
					e.printStackTrace();
				}
				initilizestatus = true;
			} else {

			}
		} catch (Exception e) {
		}

	}

}
