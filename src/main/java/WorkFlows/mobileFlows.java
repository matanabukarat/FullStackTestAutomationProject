package WorkFlows;

import Extensions.uiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class mobileFlows extends CommonOps

{
    @Step("Login Fitness Mobile Flow")
    public static void login(String user, String pass)
    {
            uiActions.click(AppLoginPage.btn_skipLogin);
            uiActions.updateText(AppLoginPage.txt_email, user);
            uiActions.updateText(AppLoginPage.txt_password, pass);
            uiActions.click(AppLoginPage.btn_logIn);
            uiActions.click(AppLoginPage.btn_skipTrial);
    }

    @Step("Main Page To Reminder Page: Fitness Mobile Flow")
    public static void MainToReminder()
    {
        uiActions.click(AppLeftMenuPage.btn_openMenu);
        uiActions.click(AppLeftMenuPage.btn_reminders);
    }



    @Step("Add Reminder: Fitness Mobile Flow")
    public static void addReminder(String timeHour, String timeMinute, String name)
    {
        uiActions.click(AppRemindersPage.btn_addReminder);
        uiActions.click(AppRemindersPage.btn_reminderName);
        uiActions.SelectElementByText(AppRemindersPage.list_MealType, name);
        uiActions.click(AppRemindersPage.btn_time);
        uiActions.click(AppRemindersPage.btn_writeTime);
        uiActions.updateText(AppRemindersPage.txt_hour, timeHour);
        uiActions.updateText(AppRemindersPage.txt_minute, timeMinute);
        uiActions.click(AppRemindersPage.btn_timeOk);
        uiActions.click(AppRemindersPage.btn_completeReminder);
    }

    @Step("Delete Reminder: Fitness Mobile Flow")
    public static void deleteReminder(int place)
    {
        uiActions.click(AppRemindersPage.list_Reminders.get(place));
        uiActions.click(AppRemindersPage.btn_deleteReminder);
    }


}
