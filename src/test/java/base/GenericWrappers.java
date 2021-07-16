package base;

import com.cucumber.listener.Reporter;
import com.google.common.collect.ImmutableMap;
import contants.GlobalVariables;
import cucumber.api.Scenario;
import enums.BrowserType;
import enums.MobileType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.codec.binary.Base64;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;


public class GenericWrappers extends GlobalVariables implements Wrappers, Wrappers.SelectDropDown {

    private Logger logger = Logger.getLogger(String.valueOf(GenericWrappers.class));
    private Select select;
    public int retryattempts = 1;
    public BrowserType browserType;
    public MobileType mobileType;
    Dimension size;

    //jenkins configuration
    public String osName  = "WIN";
    //

    public RemoteWebDriver IntitateBrowser() throws Exception {
        if (osName.equalsIgnoreCase("LINUX")){
            System.out.println("Get In To LINUX app");
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriverLinux");
            System.out.println("Get In To Invoke app");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("applicationCacheEnabled", true);
            ChromeOptions options = new ChromeOptions();
            options.merge(capabilities);
            options.setBinary("/etc/alternatives/google-chrome");
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--remote-debugging-port=9222");
            options.addArguments("--disable-infobars");
            options.addArguments("--disable-dev-shm-usage"); //Linux
            options.addArguments("--disable-browser-side-navigation");
            options.addArguments("--disable-web-security");
            driver = new ChromeDriver(options);
        }else if (osName.equalsIgnoreCase("MAC")){
            System.out.println("Get In To MAc app");
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriverMac");
            driver = new ChromeDriver();
        }else if (osName.equalsIgnoreCase("WIN")){
            System.out.println("Get In To Wind app");
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriverWin.exe");
            driver = new ChromeDriver();
        }
        driver.get("https://qa1.molekule.com/");
        System.out.println("browser launch");
        driver.manage().window().maximize();
        return driver;
    }

    /**
     * This method used to get url
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void getUrl(String url) {
        driver.get(url);
        setImplicit(timeOut);
    }

    /**
     * This method used to set implicit wait
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void setImplicit(int timeOut) {
        driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
    }

    /**
     * This method used to WebdriverWait
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public WebDriverWait webDriverWait() {
        return new WebDriverWait(driver, elementWaitInSeconds);
    }

    /**
     * This method used to quit browser
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void quitBrowser() {
        driver.quit();
    }

    /**
     * This method used to close broswer
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void closeBrowser() {
        driver.close();
    }

    /**
     * This method used to mouseOver a element
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mouseOver(WebElement element) {
        waitVisibilityOfElement(element);
        new Actions(driver).moveToElement(element).build().perform();
    }

    /**
     * This method used to mouseOver a element using list
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mouseOver(List<WebElement> element, int index) {
        waitVisibilityOfElement(element.get(index));
        new Actions(driver).moveToElement(element.get(index)).build().perform();
    }

    /**
     * This method used to get element text
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public String getText(WebElement element) {
        waitVisibilityOfElement(element);
        highLighterMethod(driver, element);
        logger.info("Element Text - " + element.getText());
        return element.getText();
    }

    /**
     * This method used to match actual and expected text
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean isTextMatch(String actual, String expected) {

        logger.info("Actual Value - " + actual + "\n" + "Expected Value - " + expected);
        return actual.equalsIgnoreCase(expected);
    }

    /**
     * This method used to check element contain actual and expected text
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean isTextContain(String actual, String expected) {

        logger.info("Actual text - " + actual + "\n" + "Expected text - " + expected);
        return actual.contains(expected);
    }

    /**
     * This method used to apply Thread.sleep for waiting element.
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void waitFor(int sleepTime) {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method used to check element is not clickable with retry
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void notClickableAtPointRetryClick(WebElement element) {
        int attempts = 0;
        while (attempts < retryattempts) {
            try {
                waitVisibilityOfElement(element);
                waitElementToBeClickable(element);
                element.click();
                break;
            } catch (Exception e) {
                waitFor(1000);
            }
            attempts++;
        }
    }

    /**
     * This method used to click element.
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void clickButton(WebElement element) {
        try {
            // loaderDisappear();
            //scrollToElement(element);
//            waitVisibilityOfElement(element);
//            waitElementToBeClickable(element);
            element.click();

//            JavascriptExecutor executor = (JavascriptExecutor) driver;
//            executor.executeScript("arguments[0].click();", element);

//            Actions builder = new Actions(driver);
//            builder.moveToElement(element).click(element).perform();

        } catch (StaleElementReferenceException e) {
            // staleRetryingFindClick(element);
        } catch (Exception e) {

            // notClickableAtPointRetryClick(element);
        }
    }

    public void clickElementAction(WebElement element) {
        try {
            scrollToElement(element);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        } catch (StaleElementReferenceException e) {
            // staleRetryingFindClick(element);
        } catch (Exception e) {
            // notClickableAtPointRetryClick(element);
        }
    }

    public void clickWebAction(WebElement element) {
        try {
            Actions builder = new Actions(driver);
            builder.moveToElement(element).click(element).perform();
        } catch (StaleElementReferenceException e) {
            // staleRetryingFindClick(element);
        } catch (Exception e) {
            // notClickableAtPointRetryClick(element);
        }
    }

    /**
     * This method used to refresh a page
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void refreshPage() {
        driver.navigate().refresh();
    }

    /**
     * This method used to click element without scroll
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void clickButtonWithOutScroll(WebElement element) {
        waitVisibilityOfElement(element);
        waitElementToBeClickable(element);
        waitFor(2000);
        element.click();
    }

    /**
     * This method used to click element using JS executor
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void jsclickButtonWithOutScroll(WebElement element) {
        waitVisibilityOfElement(element);
        waitElementToBeClickable(element);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    /**
     * This method used to scroll to top using JS executor
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void scrollToTop() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0)");
        waitFor(1000);
    }

    /**
     * This method used to scroll to bottom using JS executor
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        waitFor(1000);
    }

    /**
     * This method used to return xpath object
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public By locateXpath(String xpath) {
        return By.xpath(xpath);
    }

    /**
     * This method used to return CSS object
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public By locateCss(String css) {
        return By.cssSelector(css);
    }

    /**
     * This method used to click element using webelement
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void clickButton(WebElement scrollToElement, WebElement clickElement) {

        waitFor(1000);
        scrollToElement(scrollToElement);
        waitVisibilityOfElement(clickElement);
        waitElementToBeClickable(clickElement);
        clickElement.click();
    }

    /**
     * This method used to click dropdown object
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void clickDropDown(WebElement element, String xpath) {

        waitFor(1000);
        waitPresenceOfElementLocated(locateCss(xpath));
        element.click();
    }

    /**
     * This method used to enter text with scroll to element
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void enterText(WebElement element, String... textValue) {
        scrollToElement(element);
        waitVisibilityOfElement(element);
        element.clear();
        waitFor(1000);
        logger.info("Entered Text - " + textValue);
       // element.click();
        element.sendKeys(textValue);
    }

    /**
     * This method used to enter text without scroll to element
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void enterTextWithoutScroll(WebElement element, String textValue) {

        waitVisibilityOfElement(element);
        element.clear();
        waitFor(1000);
        logger.info("Entered Text - " + textValue);
        element.sendKeys(textValue);
        driver.switchTo().frame(1);
        driver.switchTo().parentFrame();
        driver.switchTo().activeElement();
    }

    /**
     * This method used to apply explicity wait for webelement
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void waitVisibilityOfElement(WebElement element) {
        webDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    public void waitVisibilityOfElement1(WebElement element) {
        webDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * This method used to apply explicity wait for Mob element
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void waitVisibilityOfElement(MobileElement element) {
        webDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * This method used to wait element until clickable for web element
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void waitElementToBeClickable(WebElement element) {
        webDriverWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * This method used to wait element until clickable for mobile element
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void waitElementToBeClickable(MobileElement element) {

        webDriverWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * This method used to wait until element present
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void waitPresenceOfElementLocated(By by) {
        webDriverWait().until(ExpectedConditions.presenceOfElementLocated(by));
    }

    /**
     * This method used for load disapper
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void loaderDisappear() {
        List<WebElement> loader = driver.findElements(By.xpath("//div[@class='modal-backdrop fade in']/span"));
        if (!loader.isEmpty()) {
            webDriverWait().until(ExpectedConditions
                    .invisibilityOfElementLocated((By.xpath("//div[@class='modal-backdrop fade in']/span"))));
            waitFor(500);
        }
    }

    /**
     * This method used for switch to parent window
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void switchToParentWindow() {
        Set<String> winHandles = driver.getWindowHandles();
        for (String wHandle : winHandles) {
            driver.switchTo().window(wHandle);
            break;
        }
    }

    /**
     * This method used for switch to last window
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void switchToLastWindow() {
        Set<String> winHandles = driver.getWindowHandles();
        for (String wHandle : winHandles) {
            driver.switchTo().window(wHandle);
        }
    }

    /**
     * This method used for highlighing the element
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void highLighterMethod(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid blue;');", element);
    }

    /**
     * This method used to check whether the element is displayed.
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean isElementDisplayed(List<WebElement> elements) {
        return !elements.isEmpty();
    }

    /**
     * This method used to handle stale Retrying Find Click
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean staleRetryingFindClick(WebElement element) {
        System.out.println("Inside in the staleRetryingFindClick");
        boolean result = false;
        int attempts = 0;
        while (attempts < retryattempts) {
            try {
                waitVisibilityOfElement(element);
                waitElementToBeClickable(element);
                element.click();
                result = true;
                break;
            } catch (StaleElementReferenceException e) {
                waitFor(500);
            }
            attempts++;
        }
        return result;
    }

    /**
     * This method used to handle stale Retrying enter text
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean staleRetryingEnterText(WebElement element, String... value) {
        boolean result = false;
        int attempts = 0;
        while (attempts < retryattempts) {
            try {
                waitVisibilityOfElement(element);
                element.sendKeys(value);
                result = true;
                break;
            } catch (StaleElementReferenceException e) {
                waitFor(500);
            }
            attempts++;
        }
        return result;
    }

    /**
     * This method used to handle stale Retrying element
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean staleRetryingElementIsDisplayed(WebElement element) {
        boolean result = false;
        int attempts = 0;
        while (attempts < retryattempts) {
            try {
                waitVisibilityOfElement(element);
                element.isDisplayed();
                result = true;
                break;
            } catch (StaleElementReferenceException e) {
                waitFor(500);
            }
            attempts++;
        }
        return result;
    }

    /**
     * This method used to display elemnet using web element
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean isElementDisplayed(WebElement element) {
        boolean flag;
        try {
            setImplicit(10);
            scrollToElement(element);
            waitVisibilityOfElement(element);
            highLighterMethod(driver, element);
            flag = element.isDisplayed();
        } catch (StaleElementReferenceException stale) {
            flag = staleRetryingElementIsDisplayed(element);
        } catch (Exception e) {
            flag = false;
        }
        logger.info("Is element " + element + " displayed - " + flag);
        return flag;


    }

    /**
     * This method used to display elemnet without scroll using web element
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean isElementDisplayedWithoutScroll(WebElement element) {

        boolean flag;
        try {

            waitFor(1000);
            setImplicit(10);
            highLighterMethod(driver, element);
            element.isDisplayed();
            flag = true;
        } catch (Exception e) {

            setImplicit(timeOut);
            flag = false;
        }
        logger.info("Is element " + element + " displayed - " + flag);
        return flag;
    }


    public boolean isElementEnabled(WebElement element) {
        boolean flag;
        try {
            waitFor(1000);
            scrollToElement(element);
            highLighterMethod(driver, element);
            element.isEnabled();
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        logger.info("Is element " + element + " enabled - " + flag);
        return flag;
    }

    /**
     * This method used for validate element is enabled
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean isEnabled(WebElement element) {
        logger.info("Is element " + element + "enabled - " + element.isEnabled());
        return element.isEnabled();
    }

    /**
     * This method used to get attribute value
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public String getAttributeValue(WebElement element, String attributeName) {
        waitVisibilityOfElement(element);
        logger.info("Attribute Value - " + element.getAttribute(attributeName));
        return element.getAttribute(attributeName);
    }

    /**
     * This method used to take screenshot
     * * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void takeSnap(Scenario scenario) throws IOException {
        String scrname = scenario.getId().replace(";", "").replace("-", "");
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        org.apache.commons.io.FileUtils.copyFile(scrFile,
                new File(getCurrentDir() + "/target/extent-report/FailureScreenShots/" + scrname + ".png"));
        System.out.println("inside screenshot");
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
        Reporter.addScreenCaptureFromPath("./FailureScreenShots/" + scrname + ".png");
        driver.quit();
    }

    /**
     * This method used to take screenshot with image is embeded
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void takeScreenShotonFailure(Scenario scenario) {
        String encodedBase64 = null;
        FileInputStream fileInputStreamReader = null;
        if (scenario.getStatus().equalsIgnoreCase("failed")) {
            try {
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                fileInputStreamReader = new FileInputStream(scrFile);
                byte[] bytes = new byte[(int) scrFile.length()];
                fileInputStreamReader.read(bytes);
                encodedBase64 = new String(Base64.encodeBase64(bytes));
                scenario.embed(bytes, "image/png");
                Reporter.addScreenCaptureFromPath("data:image/png;base64," + encodedBase64);
            } catch (Exception e) {
                e.printStackTrace();
            }
            logger.info("Screen Shot taken");
        }
    }

    public static String getCurrentDir() {

        String currentDir = System.getProperty("user.dir");
        currentDir = currentDir.replace('\\', '/');
        return currentDir;
    }
    JavascriptExecutor js = (JavascriptExecutor)driver;

    public void scrollToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView()", element);
    }

    public Select selectDropdown(WebElement element) {

        select = new Select(element);
        return select;
    }

    public void selectByIndex(WebElement element, int index) {

        selectDropdown(element).selectByIndex(index);
    }

    public void SelectByValue(WebElement element, String value) {
        waitFor(1000);
        selectDropdown(element).selectByValue(value);
    }

    public void SelectByVisibleText(WebElement element, String text) {
        waitFor(1000);
        selectDropdown(element).selectByVisibleText(text);
    }

    public void waitForLoadIconDisappear() {

        webDriverWait()
                .until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".oak-searchResults_preloader")));
    }

    public String getPageTitle() {

        return driver.getTitle();
    }

    /****
     * swipe element right or left by co-ordinated
     *
     * @param element
     * @param offSet  - (-1 swipe left or +1 swipe right)
     */
    public void swipeByX(WebElement element, int offSet) {

        Point point = element.getLocation();
        Actions actions = new Actions(driver);
        System.out.println("val: " + point.getX());
        actions.dragAndDropBy(element, point.getX() - offSet, point.getY()).build().perform();
    }

    public void swipeByXCoordinates(WebElement element, int offSet) {

        Point point = element.getLocation();
        Actions actions = new Actions(driver);
        System.out.println("val: " + point.getX());
        actions.dragAndDropBy(element, offSet, point.getY()).build().perform();
    }

    public void dragAndDrop(WebElement source, WebElement target) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).build().perform();
    }

    public WebElement getXpathElement(String xpath) {

        return driver.findElement(By.xpath(xpath));
    }

    @SuppressWarnings("unused")
    public void switchToFirstFrame() {

        List<WebElement> frames = driver.findElements(By.xpath("//iframe"));
        for (int i = 0; i < frames.size(); i++) {
            driver.switchTo().frame(i);
            break;
        }
    }

    public void clickAcceptInBrowserAlertPopUp() {

        try {
            webDriverWait().until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clearTextInTheTextField(WebElement element) {

        waitVisibilityOfElement(element);
        element.clear();
    }

    public String removingWhiteSpaces(String data) {

        String csvReqID = data.trim();
        String finalReqID = "";
        char[] value = csvReqID.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if ((i % 2) == 0) {
                finalReqID = finalReqID + value[i];
            }
        }
        return finalReqID;
    }

    public void deleteAFile(String filePath) {
        File file = new File(filePath);
        file.delete();
    }



    public String gettingTextMessageFromAlertPopUp() {

        return (driver.switchTo().alert().getText());
    }

    public void closingTheAlertPopUp() {

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


    public Map<String, List<String>> getHorizontalData(cucumber.api.DataTable dataTable) {
        Map<String, List<String>> dataMap = null;
        try {
            dataMap = new HashMap<String, List<String>>();
            List<String> headingRow = dataTable.raw().get(0);
            int dataTableRowsCount = dataTable.getGherkinRows().size() - 1;
            ArrayList<String> totalRowCount = new ArrayList<String>();
            totalRowCount.add(Integer.toString(dataTableRowsCount));
            dataMap.put("totalRowCount", totalRowCount);
            for (int i = 0; i < headingRow.size(); i++) {
                List<String> dataList = new ArrayList<String>();
                dataMap.put(headingRow.get(i), dataList);
                for (int j = 1; j <= dataTableRowsCount; j++) {
                    List<String> dataRow = dataTable.raw().get(j);
                    dataList.add(dataRow.get(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataMap;
    }


    public String getTestDataValue(String classPath, String fieldName) {
        String expectedPageName = null;
        try {
            Class<?> classObj = Class.forName(classPath);
            Object obj = classObj.newInstance();
            Field fieldValue = classObj.getDeclaredField(fieldName);
            expectedPageName = (String) fieldValue.get(obj);
        } catch (Exception e) {
            System.out.println(e);
        }
        return expectedPageName;
    }

    public String[] getTestDataValues(String classPath, String fieldName) {
        String[] expectedPageName = null;
        try {
            Class<?> classObj = Class.forName(classPath);
            Object obj = classObj.newInstance();
            Field fieldValue = classObj.getDeclaredField(fieldName);
            expectedPageName = (String[]) fieldValue.get(obj);
        } catch (Exception e) {
            System.out.println(e);
        }
        return expectedPageName;
    }

    /**
     * This method used to switch To NativeApp Context
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void switchToNativeAppContext(AppiumDriver<?> app) {
        try {
            Set<String> contextHandles = app.getContextHandles();
            for (String context : contextHandles) {
                if (context.contains("NATIVE")) {
                    app.context(context);
                    Thread.sleep(200L);
                }
            }
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
    }

    /**
     * This method used to switch To WebApp Context
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean switchToWebAppContext(AndroidDriver<?> app) throws InterruptedException {
        boolean flag = true;
        try {
            System.out.println("**********************Started switching to web context********************");
            Set<String> contextHandles = app.getContextHandles();
            for (String context : contextHandles) {
                if (context.contains("WEBVIEW")) {
                    app.context(context);
                    Thread.sleep(200L);
                }
            }
            flag = false;
            System.out.println("**********************Successfully switching to web context***************");
        } catch (Exception e) {
            System.err.println("********************Not able to switching to web context******************");
            logger.info(e.getMessage());
        } finally {
            System.out.println("flag Value : " + flag);
            if (flag) {
                System.out.println("Finally Block Executed : Switch to Native App Method Called ");
                switchToNativeAppContext(app);
                System.out.println("********************** switching back to Native App context***************");
            }
        }
        return flag;
    }

    /**
     * This method used to hide mobile keyboard
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean hidemobileKeyboard(AndroidDriver app) {
        boolean isKeyboardHideResult = false;
        try {
            app.hideKeyboard();
            isKeyboardHideResult = true;
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        return isKeyboardHideResult;
    }

    /**
     * This method used to find element is display without scroll.
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean isElementDisplayed(MobileElement element) {

        boolean flag;
        try {
            waitVisibilityOfElement(element);
            flag = element.isDisplayed();
        } catch (StaleElementReferenceException stale) {
            flag = staleRetryingElementIsDisplayed(element);
        } catch (Exception e) {
            flag = false;
        }
        logger.info("Is element " + element + " displayed - " + flag);
        return flag;
    }

    /**
     * This method used to element is present
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean isElementDisplayedWithoutScroll(MobileElement element) {
        boolean flag;
        try {
            waitFor(2000);
            flag = element.isDisplayed();
        } catch (Exception e) {
            setImplicit(timeOut);
            flag = false;
        }
        logger.info("Is element " + element + " displayed - " + flag);
        return flag;
    }

    /**
     * This method used to enter a text without clear.
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void enterTextWithoutScroll(MobileElement element, String textValue) {
        waitFor(1000);
        element.click();
        if (platformName.equalsIgnoreCase("android")) {
            element.clear();
        }else{
            clearTextFields(element);
        }
        logger.info("Entered Text - " + textValue);
        element.sendKeys(textValue);
    }

    /**
     * This method used to enter a text with clear.
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mobile_enterText(MobileElement element, String textValue) {
        waitFor(1000);
        element.click();
        element.sendKeys(textValue);
        logger.info("Entered Text - " + textValue);
    }

    /**
     * This method used to click button without scroll
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void clickButtonWithOutScroll(MobileElement element) {
        waitElementToBeClickable(element);
        element.click();
    }

    /**
     * This method used to clear text in textbox.
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void clearTextFields(MobileElement element){
        int isCount = element.getAttribute("value").length() + 4;
        System.err.println(isCount);
        for (int i = 0; i <= isCount; i++) {
            driver.findElement(By.xpath("//XCUIElementTypeKey[@name='Delete'] | //XCUIElementTypeKey[@name='delete']")).click();
        }
    }

    /**
     * This method used for hide a keyboard.
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void hideMobileKeyboard() {
        if (platformName.equalsIgnoreCase("android")) {
            hidemobileKeyboard((AndroidDriver) driver);
        } else {
            mob_KeyboardDoneButton();
        }
    }

    /**
     * used to click mobile keyboard 'Done' Button
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mob_KeyboardDoneButton() {
        int isPresent = driver.findElements(By.xpath("//XCUIElementTypeButton[@name='Done'] | //android.widget.TextView[@text='Done']")).size();
        if (isPresent == 1) {
            clickButtonWithOutScroll(driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Done'] | //android.widget.TextView[@text='Done']")));
        }
    }

    /**
     * used to scroll up screen
     * Name: Prabagaran
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mobile_fnScrollUp() {
        try {
            size = driver.manage().window().getSize();
            int x1 = (int) (size.width * 0.50);
            int y1 = (int) (size.height * 0.45);
            int y2 = (int) (size.height * 0.75);
            new TouchAction((PerformsTouchActions) driver).press(point(x1, y1)).waitAction(waitOptions(Duration.ofMillis(1000)))
                    .moveTo(point(x1, y2)).release().perform();
            setImplicit(4);
            logger.info("Object has been scrolled up");
        } catch (Exception e) {
            logger.info("Object has been not scrolled up");
        }
    }

    /**
     * used to click mobile keyboard 'Search' Button
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mob_keyBoardSearchButton(){
        try{
            if(platformName.equalsIgnoreCase("android")){
                driver.executeScript( "mobile: performEditorAction", ImmutableMap.of("action", "Search"));
            }
            else{
                driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Search']")).click();
            }
            logger.info("Search button has been clicked");
        }catch(Exception e){
            logger.info("Search button has been not clicked");
        }
    }


    /**
     * used to click keybaord go
     * Name: Prabagaran
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mob_keyBoardGoButton(){
        try{
            if (platformName.equalsIgnoreCase("ios")){
                driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Go']")).click();
            }else{
                driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
            }
            logger.info("Go button has been clicked");
        }catch(Exception e){
            logger.info("Go button has been not clicked");
        }
    }

    /**
     * used to click mobile keyboard 'Next' Button
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mob_keyBoardNextButton(){
        try{
            if (platformName.equalsIgnoreCase("ios")){
                driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Next:']")).click();
            }else{
                driver.executeScript( "mobile: performEditorAction", ImmutableMap.of("action", "next"));
            }
            logger.info("Search button has been clicked");
        }catch(Exception e){
            logger.info("Search button has been not clicked");
        }
    }

    /**
     * used to scroll up by element
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mobile_fnScrollUptoElement(By byProperty) {
        try {

            int elePresent = driver.findElements(byProperty).size();
            while (elePresent == 0) {
                size = driver.manage().window().getSize();
                int x1 = (int) (size.width * 0.50);
                int y1 = (int) (size.height * 0.45);
                int y2 = (int) (size.height * 0.75);
                new TouchAction((PerformsTouchActions) driver).press(point(x1, y1)).waitAction(waitOptions(Duration.ofMillis(1000)))
                        .moveTo(point(x1, y2)).release().perform();
                elePresent = driver.findElements(byProperty).size();
            }
            logger.info("Object has been scrolled up");
        } catch (Exception e) {
            logger.info("Object has been not scrolled up");
        }

    }

    /**
     * used to scroll down
     * Name: Prabagaran
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mobile_fnScrollDown() {
        try {
            size = driver.manage().window().getSize();
            size = driver.manage().window().getSize();
            int x1 = (int) (size.width * 0.50);
            int y1 = (int) (size.height * 0.45);
            int y2 = (int) (size.height * 0.75);
            new TouchAction((PerformsTouchActions) driver).press(point(x1, y2)).waitAction(waitOptions(Duration.ofMillis(500)))
                    .moveTo(point(x1, y1)).release().perform();
            waitFor(3000);
            logger.info("Object has been scrolled down");
        } catch (Exception e) {
            logger.info("Object has been not scrolled down");
        }
    }


    /**
     * used to swipe down by element
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mobile_fnSwipeDownElement(String mobileLocationxPath) {
        try {
            int y1 = driver.findElement(By.xpath(mobileLocationxPath)).getLocation().getY();
            size = driver.manage().window().getSize();
            int x1 = (int) (size.width * 0.50);
            int y2 = (int) (size.height * 0.75);
            new TouchAction((PerformsTouchActions) driver).press(point(x1, y2)).waitAction(waitOptions(Duration.ofMillis(1000)))
                    .moveTo(point(x1, y1)).release().perform();
            setImplicit(3);
            logger.info("Object has been swiped down");
        } catch (Exception e) {
            logger.info("Object has been not swiped down");
        }

    }



    /**
     * used to scroll down for both android and ios
     * Name: Prabagaran
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mobile_fnScrollDowntoElement(By byProperty) {
        try {
            int elePresent = driver.findElements(byProperty).size();
            for (int i = 1; i <= 10; i++) {
                if (elePresent == 0) {
                    size = driver.manage().window().getSize();
                    int x1 = (int) (size.width * 0.50);
                    int y1 = (int) (size.height * 0.40);
                    int y2 = (int) (size.height * 0.75);
                    new TouchAction((PerformsTouchActions) driver).press(point(x1, y2)).waitAction(waitOptions(Duration.ofMillis(1000)))
                            .moveTo(point(x1, y1)).release().perform();
                    elePresent = driver.findElements(byProperty).size();
                } else {
                    logger.info("Object has been scrolled down");
                    break;
                }
            }
        } catch (Exception e) {
            logger.info("Object has been not scrolled down");
        }

    }


    /**
     * used to select to scroll down method based on android and ios
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    protected void scrollDownToElementPresence(By byProperty) {
        if (platformName.equalsIgnoreCase("android")) {
            mobile_fnScrollDowntoElement(byProperty);
        } else {
            iOS_scrollToElementVisible(byProperty);
        }
    }

    /**
     * used to scroll down by element until element presence using javascript code
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mobileJS_fnScrollDowntoElementPresence(By byProperty) {
        try {
            boolean isPresent = driver.findElement(byProperty).isDisplayed();
            for (int i = 0; i <= 10; i++) {
                if (!isPresent) {
                    JavascriptExecutor js = driver;
                    RemoteWebElement cellWithText = (RemoteWebElement) driver.findElement(byProperty);
                    Map<String, String> scrollObject = new HashMap<>();
                    scrollObject.put("element", cellWithText.getId());
                    scrollObject.put("toVisible", "not an empty string");
                    js.executeScript("mobile: scroll", scrollObject);
                    isPresent = driver.findElement(byProperty).isDisplayed();
                }
            }
        } catch (Exception e) {
            logger.info("Object has been not scrolled down");
        }
    }

    /**
     * used to scroll the ios element visible
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void iOS_scrollToElementVisible(By byValue) {
        try {
            String attribute = "visible";
            boolean runLoop = true;
            int i = 1;
            while (runLoop) {
                int elementPresent = driver.findElements(byValue).size();
                if (elementPresent == 0) {
                    mobile_fnScrollDown();
                    if (i == 50) {
                        break;
                    }
                    i++;
                } else if (elementPresent == 1) {
                    String elementVisibleValue = driver.findElement(byValue).getAttribute(attribute);
                    if (elementVisibleValue.contentEquals("true")) {
                        runLoop = false;
                    } else if (elementVisibleValue.contentEquals("false")) {
                        mobile_fnScrollDown();
                    }
                }
            }
            logger.info(" element scrolled, Object has been scrolled down");
        } catch (Exception e) {
            logger.info(" element not scrolled, Object has been scrolled down");
        }
    }


    /**
     * used to scroll down pickerwheel values from dropdown
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void iOS_scrollDownInPickerWheel(By byProperty) {
        try {
            int elePresent = driver.findElements(byProperty).size();
            for (int i = 1; i <= 10; i++) {
                if (elePresent == 0) {
                    size = driver.manage().window().getSize();
                    int x1 = (int) (size.width * 0.50);
                    int y1 = (int) (size.height * 0.70);
                    int y2 = (int) (size.height * 0.75);
                    new TouchAction((PerformsTouchActions) driver).press(point(x1, y2)).waitAction(waitOptions(Duration.ofMillis(1000)))
                            .moveTo(point(x1, y1)).release().perform();
                    waitFor(2000);
                    elePresent = driver.findElements(byProperty).size();
                } else {
                    System.out.println("Picker found throw scroll");
                    break;
                }
            }
            logger.info(" element scrolled, Object has been scrolled down");
        } catch (Exception e) {
            logger.info(" element not scrolled, Object has been scrolled down");
        }
    }


    /**
     * used to select values from dropdown
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mobile_selectFromDropdown(By property) {
        try {
            if (platformName.equalsIgnoreCase("android")){
                driver.findElement(property).click();
            }else {
                iOS_scrollDownInPickerWheel(property);
            }
            logger.info(" element scrolled, Object has been scrolled down");
        } catch (Exception e) {
            logger.info(" element not scrolled, Object has been scrolled down");
        }
    }


    /**
     * used to scroll down for 'n' number times
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mobile_fnScrollDown(int noOfTimes) {
        try {
            for (int i = 0; i < noOfTimes; i++) {
                mobile_fnScrollDown();
                logger.info(" element present, Object has been scrolled down");
            }
        } catch (Exception e) {
            logger.info(" element present, Object has been scrolled down");

        }
    }

    /**
     * used to scroll up for 'n' number times
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mobile_fnScrollUp(int noOfTimes) {
        try {
            for (int i = 0; i < noOfTimes; i++) {
                mobile_fnScrollUp();
                logger.info(" element present, Object has been scrolled down");
            }
        } catch (Exception e) {
            logger.info(" element present, Object has been scrolled down");

        }
    }

    /**
     * used to select ios datepicker
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void iOS_selectDob(String month, int date, int year) {
        try {
            MobileElement datePicker = (MobileElement) driver.findElement(By.xpath("//XCUIElementTypeDatePicker"));
            List<MobileElement> columns = datePicker.findElements(By.xpath("//XCUIElementTypePickerWheel"));
            columns.get(0).sendKeys(month);
            columns.get(1).sendKeys(Integer.toString(date));
            columns.get(2).sendKeys(Integer.toString(year));
            mob_KeyboardDoneButton();
            logger.info("Date of birth is selected");
        } catch (Exception e) {
            logger.info("Date of birth is not selected");
        }
    }

    /**
     * used to verify the element is preeent in application
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean mobile_fnObjectExist(By byProperty) throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        try {
            wait.until(ExpectedConditions.numberOfElementsToBe(byProperty, 1));
            logger.info("Passed, Object found in the page" + byProperty.toString() + " Object present");
            return true;
        } catch (TimeoutException T) {
            logger.info("Failed, Object not found in the page" + byProperty.toString() + " isn't clickable after timeout");
            return false;
        }
    }

    /**
     * used to verify the element is not preeent in application
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public boolean mobile_fnObjectNotExist(By byProperty) {
        setImplicit(5);
        int size = driver.findElements(byProperty).size();
        if (size == 0) {
            logger.info("Failed, Object not found in the page" + byProperty.toString() + "Object not present");
            return true;
        } else {
            logger.info("Passed, Object found in the page" + byProperty.toString() + " Object present");
            return false;
        }
    }


    /**
     * used to click keybaord next
     * Name: Prabagaran
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mobile_fnSwipeLeftElement(String mobileLocationxPath) {
        try {
            int y1 = driver.findElement(By.xpath(mobileLocationxPath)).getLocation().getY();
            size = driver.manage().window().getSize();
            int x1 = (int) (size.width * 0.45);
            int x2 = (int) (size.width * 0.75);
            new TouchAction((PerformsTouchActions) driver).press(point(x2, y1)).waitAction(waitOptions(Duration.ofMillis(1000)))
                    .moveTo(point(x1, y1)).release().perform();
            setImplicit(3);
            logger.info("Passed, Object has been scrolled" + mobileLocationxPath.toString() + " Object scrolled");
        } catch (Exception e) {
            logger.info("Failed, Object has not been scrolled" + mobileLocationxPath.toString() + " Object not scrolled");
        }

    }


    /**
     * used to swipe a element
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mobile_fnSwipeByElement(By element, int endX, int endY) {
        try {
            int startX = driver.findElement(element).getLocation().getX();
            int startY = driver.findElement(element).getLocation().getY();
            new TouchAction((PerformsTouchActions) driver).longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
            logger.info("Passed, Object has been scrolled" + element.toString() + " Object scrolled");
        } catch (Exception e) {
            logger.info("Failed, Object has not been scrolled" + element.toString() + " Object not scrolled");
        }

    }

    /**
     * used to swipe any direction
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mobile_fnSwipe(int startX, int startY, int endX, int endY) {
        try {
            new TouchAction((PerformsTouchActions) driver).longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
            logger.info("Passed, Object has been scrolled");
        } catch (Exception e) {
            logger.info("Failed, Object has not been scrolled");
        }

    }


    /**
     * used to click by x,y coorinates
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void mobile_fnClickByCoorinates(int x, int y) {

        try {
            new TouchAction((PerformsTouchActions) driver).tap(point(x, y)).waitAction(waitOptions(Duration.ofMillis(250))).perform();
            logger.info("Passed, Object has been clicked,  Object clicked");
        } catch (Exception e) {
            logger.info("Failed, Object has not been clicked, Object not clicked");
        }

    }

    /**
     * used to validate date format
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void validateDateFormat(String dateFormat, String dataString) throws Exception {
        try {
            SimpleDateFormat format = new SimpleDateFormat(dateFormat);
            format.parse(dataString);
            logger.info("Passed, Current date format is validated");
        } catch (TimeoutException T) {
            logger.info("Failed, Current date format is not validated");
        }
    }

    /**
     * used to click element
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void clickByElement(By property) {
        try {
            driver.findElement(property).click();
            logger.info("Passed" + property.toString() + "Element is clicked");
        } catch (TimeoutException T) {
            logger.info("Failed" + property.toString() + "Element is clicked");
        }
    }

    AppiumServiceBuilder builder = new AppiumServiceBuilder();
    AppiumDriverLocalService service;

    public void startServer() throws InterruptedException {
        builder
                .withAppiumJS(new File("/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"))
                .usingDriverExecutable(new File("/usr/local/bin/node")).usingPort(4723).withIPAddress("127.0.0.1");
        //.withLogFile(new File("AppiumLogFile.txt"));

        service = builder.build();
        System.out.println("Appium is started");
        service.start();
    }

    public void stopServer(){
        System.out.println("Appium is stopped");
        service.stop();

        Runtime runTime = Runtime.getRuntime();
        try{
            runTime.exec("/usr/bin/killall -KILL node");
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    /**
     * used to click element
     * Name: Prabagaran
     * Role: SDET
     * Employee Id: 119584
     * Project: Medimpact Mobile Automation
     */
    public void minimizeBroswer() {
//        driver.manage().window().setPosition(new Point(400, 200));
        Point p = driver.manage().window().getPosition();
        Dimension d = driver.manage().window().getSize();
        driver.manage().window().setPosition(new Point((d.getHeight()-p.getX()), (d.getWidth()-p.getY())));
    }

    public void clearValue(WebElement element) {
        try {
            element.sendKeys((Keys.chord(Keys.COMMAND, "a")));
            element.sendKeys(Keys.BACK_SPACE);
        } catch (Exception e) {
            logger.info("Value cannot be cleared");
        }
    }

    String randomString;
    public String getRandomEmailID(){
        String chars = "abcedefghijklmnop123456789";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) {
            int index = (int) (rnd.nextFloat() * chars.length());
            salt.append(chars.charAt(index));
        }
        randomString = "test"+salt.toString()+"@photon.in";
        return randomString;
    }
    public String getRandomName(){
        int wordLength = 5;
        Random r = new Random();
        StringBuilder sb = new StringBuilder(wordLength);
        for (int i = 0; i < wordLength; i++) {
            char tmp = (char) ('a' + r.nextInt('z' - 'a'));
            sb.append(tmp); // Add it to the String
        }
        return sb.toString();
    }

    public String  getRandomCompany(){
        int wordLength = 5;
        Random r = new Random();
        StringBuilder sb = new StringBuilder(wordLength);
        for (int i = 0; i < wordLength; i++) {
            char tmp = (char) ('a' + r.nextInt('z' - 'a'));
            sb.append(tmp); // Add it to the String
        }
        return sb.toString();
    }
        }
