package Utilities;

import PageObjects.myfitnesspal.exerciseDatabasePage;
import io.appium.java_client.android.AndroidDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base

{
    public static String Platform;
    //Web
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Screenshot imageScreenShot;
    public static ImageDiffer imgDiff = new ImageDiffer();
    public static ImageDiff Diff;

    //App
    public static DesiredCapabilities dc = new DesiredCapabilities();

    //API
    public static RequestSpecification httpRequest;
    public static Response response;
    public static JSONObject params = new JSONObject();
    public static JsonPath jp;


    //Web
    public static PageObjects.myfitnesspal.mainPage myfitnesspalMain;
    public static PageObjects.myfitnesspal.loginPage myfitnesspalLogin;
    public static PageObjects.myfitnesspal.exercisePage myfitnesspalExerciseMain;
    public static exerciseDatabasePage myfitnesspalExerciseDatabasePage;

    //App
    public static PageObjects.fitnessApp.mainPage AppMainPage;
    public static PageObjects.fitnessApp.logPage AppLoginPage;
    public static PageObjects.fitnessApp.remindersPage AppRemindersPage;
    public static PageObjects.fitnessApp.leftMenuPage AppLeftMenuPage;

    //Electron
    public static PageObjects.ElectronDemo.mainPage ElectronMain;

    //Desktop
    public static PageObjects.Calculator.mainPage calcMain;

    //DB
    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;

    
}
