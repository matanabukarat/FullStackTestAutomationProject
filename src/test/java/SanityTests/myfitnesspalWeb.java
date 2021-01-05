package SanityTests;

import Extensions.uiActions;
import Extensions.verifications;
import Utilities.CommonOps;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Utilities.Listeners.class)
public class myfitnesspalWeb extends CommonOps

{
    @Test(description = "Test01: Login to FitnessPal")
    @Description("Test Description: Login to FitnessPal Web Application")
    public void test01_logIn()
    {
        webFlows.login(getData("user"), getData("pass"));
        verifications.textInElement(myfitnesspalMain.txt_mainHeader, "Your Daily Summary");
    }


    @Test(description = "Test02: verify Calories Burned Description")
    @Description("Test Description: Verifying CaloriesBurnedDescription Text update")
    public void test02_verifyCaloriesBurnedDescription()
    {
        webFlows.mainPtoDP();
        uiActions.updateDropDown(myfitnesspalExerciseDatabasePage.chooseExercise, "Abs");
        verifications.textInElement(myfitnesspalExerciseDatabasePage.caloriesBurnedDescription, "Abs");
    }

    @Test(description = "Test03: verify Number Of Matching Exercises")
    @Description("Test Description: Verifying The Number Of All Exercise Elements That Were Found After The Search")
    public void test03_verifyNumberOfMatches()
    {
        webFlows.mainPtoDP();
        webFlows.search("training");
        verifications.ListSize(myfitnesspalExerciseDatabasePage.matchingExercises, "5");
    }

    @Test(description = "Test04: verify Number Of Calories Burned")
    @Description("Test Description: Sending Arguments to The Calories Calculator And Verifying The Outcome")
    public void test04_verifyCaloriesBurned()
    {
        webFlows.mainPtoDP();
        webFlows.search("pushup");
        webFlows.calculateCaloriesBurned(0,"62", "60");
        verifications.textInElement(myfitnesspalExerciseDatabasePage.numOfCaloriesBurned, "496");
    }

    @Test(description = "Test05: verify FacebookLogo")
    @Description("Test Description: Verifies MainPage default facebook logo")
    public void test05_verifyFacebookLogo()
    {
        webFlows.mainPtoDP();
        verifications.VisualElement(myfitnesspalExerciseDatabasePage.img_FacebookLogo, "FacebookLogo_ver1.00");
    }
}
