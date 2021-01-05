package Utilities;

import PageObjects.myfitnesspal.exerciseDatabasePage;
import org.openqa.selenium.support.PageFactory;

public class managePages extends Base

{
    public static void init()
    {
        //Web
        myfitnesspalLogin = PageFactory.initElements(driver, PageObjects.myfitnesspal.loginPage.class);
        myfitnesspalMain = PageFactory.initElements(driver, PageObjects.myfitnesspal.mainPage.class);
        myfitnesspalExerciseMain = PageFactory.initElements(driver, PageObjects.myfitnesspal.exercisePage.class);
        myfitnesspalExerciseDatabasePage = PageFactory.initElements(driver, exerciseDatabasePage.class);

        //App
        AppMainPage = PageFactory.initElements(driver, PageObjects.fitnessApp.mainPage.class);
        AppLoginPage = PageFactory.initElements(driver, PageObjects.fitnessApp.logPage.class);
        AppRemindersPage = PageFactory.initElements(driver, PageObjects.fitnessApp.remindersPage.class);
        AppLeftMenuPage = PageFactory.initElements(driver, PageObjects.fitnessApp.leftMenuPage.class);

        //Electron
        ElectronMain = PageFactory.initElements(driver, PageObjects.ElectronDemo.mainPage.class);

        //Desktop
        calcMain = PageFactory.initElements(driver, PageObjects.Calculator.mainPage.class);


    }
}