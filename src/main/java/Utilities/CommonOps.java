package Utilities;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.testng.annotations.Parameters;
import org.w3c.dom.Document;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Base
{

    @Step("Gets Data From xml File")
    public static String getData (String nodeName)
    {
        DocumentBuilder dBuilder;
        Document doc = null;
        File fXmlFile = new File("./Configuration/DataConfig.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
        }
        catch(Exception e) {
            System.out.println("Exception in reading XML file: " + e);
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }

@Step("Initializing Chrome Browser")
   public static WebDriver initChrome()
    {
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       return driver;
    }

    @Step("Initializing FireFox Browser")
    public static WebDriver initFireFox()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    @Step("Initializing Explorer Browser")
    public static WebDriver initIe()
    {
        WebDriverManager.iedriver();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }

    @Step("Initializing Requested Browser Type")
    public static void initBrowser(String BrowserType)
    {
        if (BrowserType.equalsIgnoreCase("Chrome"))
            driver = initChrome();
        else if (BrowserType.equalsIgnoreCase("Firefox"))
            driver = initFireFox();
        else if (BrowserType.equalsIgnoreCase("ie"))
            driver = initIe();
        else
            throw new RuntimeException(("Invalid platform type stated"));

        driver.manage().window().maximize();
        driver.get(getData("url"));
        wait = new WebDriverWait(driver, Long.parseLong(getData("TimeOut")));
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
    }
    @Step("Initializing Mobile Platform")
    public static void initMobile()
    {

        dc.setCapability(MobileCapabilityType.UDID, getData("UDID"));
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getData("APP_PACKAGE"));
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getData("APP_ACTIVITY"));

        try
        {

            driver = new RemoteWebDriver(new URL(getData("Appium_Server")+"/wd/hub"), dc);
        } catch (Exception e)
        {
            System.out.println("Can not Connect to Appium Server, See Details: "+ e);
        }
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Long.parseLong(getData("TimeOut")));

    }
    @Step("Initializing API Platform")
    public static void initAPI()
    {
        RestAssured.baseURI = getData("api-url");
        httpRequest = RestAssured.given().auth().preemptive().basic(getData("api-user"), getData("api-pass"));
    }
    @Step("Initializing Electron Platform")
    public static void initElectron()
    {
        System.setProperty("webdriver.chrome.driver", getData("ElectronDriverPath"));
        ChromeOptions opt = new ChromeOptions();
        opt.setBinary(getData("ElectronAppPath"));
        dc.setCapability("chromeOptions", opt);
        dc.setBrowserName("chrome");
        driver = new ChromeDriver(dc);
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
    }
    @Step("Initializing Desktop Platform")
    public static void initDesktop()
    {
        dc.setCapability("app", getData("Calculator_App"));
        try
        {
            driver = new WindowsDriver(new URL(getData("Appium_Server")), dc);
        } catch (Exception e)
        {
            System.out.println("Cannot Connect to WinApp Sercer, See Details: " + e);
        }
    }


    @AfterMethod
    public void afterMethod()
    {
        if(Platform.equalsIgnoreCase("web"))
        {
            driver.get(getData("url"));
        }
    }

    @Parameters({"PlatformName"})
    @BeforeClass
    public void startSession(String PlatformName)
    {
        Platform = PlatformName;

      if (Platform.equalsIgnoreCase("web"))
      {
           initBrowser(getData("BrowserName"));
      }
      else if(Platform.equalsIgnoreCase("DB"))
      {
          initBrowser(getData("BrowserName"));
      }
      else if (Platform.equalsIgnoreCase("mobile"))
      {
          initMobile();
      }
      else if(Platform.equalsIgnoreCase("api"))
      {
          initAPI();
      }
      else if(Platform.equalsIgnoreCase("electron"))
      {
          initElectron();
      }
      else if(Platform.equalsIgnoreCase("desktop"))
      {
          initDesktop();
      }


      else
          throw new RuntimeException(("Invalid platform type stated"));

      managePages.init();
      manageDB.initConnection(getData("dbURL"), getData("dbUser"), getData("dbPass"));
    }

    @AfterClass
    public void afterSession()
    {
         manageDB.closeConnection();
         if(!Platform.equalsIgnoreCase("api"))
         {
         driver.quit();
         }

    }
}
