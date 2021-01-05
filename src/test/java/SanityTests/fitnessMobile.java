package SanityTests;

import Extensions.verifications;
import Utilities.CommonOps;
import WorkFlows.mobileFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Utilities.Listeners.class)
public class fitnessMobile extends CommonOps

{
    @Test(description = "Test01: Login to FitnessPalApp", enabled = true)
    @Description("Test Description: Login to FitnessPal Mobile Application")
    public void test01_logIn()
    {
        mobileFlows.login(getData("user"), getData("pass"));
        verifications.buttonSelected(AppMainPage.btn_home);
    }

    @Test(description = "Test02: Add Reminder")
    @Description("Test Description: Add Reminder To FitnessPal Mobile Application")
    public void test02_addReminder()
    {
        mobileFlows.MainToReminder();
        mobileFlows.addReminder("10", "00", "Dinner");
        verifications.ListSize(AppRemindersPage.list_Reminders, "1");
    }

    @Test(description = "Test03: Remove Reminder")
    @Description("Test Description: Remove Chosen Reminder From FitnessPal Mobile Application")
    public void test03_logIn()
    {
        mobileFlows.deleteReminder(0);
        verifications.ListSize(AppRemindersPage.list_Reminders, "0");
    }

}
