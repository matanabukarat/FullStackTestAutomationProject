package WorkFlows;

import Extensions.dbActions;
import Extensions.uiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

import java.util.List;

public class webFlows extends CommonOps

{

    @Step("Login Fitness web Flow")
    public static void login(String user, String pass)
    {
        uiActions.click(myfitnesspalMain.btn_Login);
        uiActions.updateText(myfitnesspalLogin.txt_userName, user);
        uiActions.updateText(myfitnesspalLogin.txt_password, pass);
        uiActions.click(myfitnesspalLogin.btn_Login);
        uiActions.click(myfitnesspalMain.btn_closeContainer);
    }
    @Step("Search Exercise")
    public static void search(String exercise)
    {
        uiActions.updateText(myfitnesspalExerciseDatabasePage.txt_searchExercises, exercise);
        uiActions.click(myfitnesspalExerciseDatabasePage.btn_Search);
    }
    @Step("Main Page to Data Page")
    public static void mainPtoDP()
    {
        uiActions.click(myfitnesspalMain.btn_Exercise);
        uiActions.click(myfitnesspalExerciseMain.btn_Database);
    }
    @Step("calculate Calories Burned")
    public static void calculateCaloriesBurned(int listPlace, String weight, String howLong)
    {
        uiActions.click(myfitnesspalExerciseDatabasePage.matchingExercises.get(listPlace));
        uiActions.updateText(myfitnesspalExerciseDatabasePage.txt_yourWeight, weight);
        uiActions.updateText(myfitnesspalExerciseDatabasePage.txt_howLong, howLong);
    }

    @Step("Login Fitness web Flow with DB Credentials")
    public static void loginDB()
    {
        List<String> cred = dbActions.getCredentials("SELECT user_name, password FROM Credentials WHERE ID='3'");

        uiActions.click(myfitnesspalMain.btn_Login);
        uiActions.updateText(myfitnesspalLogin.txt_userName, cred.get(0));
        uiActions.updateText(myfitnesspalLogin.txt_password, cred.get(1));
        uiActions.click(myfitnesspalLogin.btn_Login);
        uiActions.click(myfitnesspalMain.btn_closeContainer);
    }

}
