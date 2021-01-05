package PageObjects.fitnessApp;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class remindersPage

{
    @FindBy(xpath = "//*[@id='fabActionPlus']")
    public WebElement btn_addReminder;

    @FindBy(xpath = "//*[@id='txtReminderDescription']")
    public List<WebElement> list_Reminders;

    @FindBy(xpath = "//*[@id='chkReminderDescription']")
    public List<WebElement> list_MealType;

    @FindBy(xpath = "//*[@id='reminder_type_value']")
    public WebElement btn_reminderName;

    @FindBy(xpath = "//*[@id='reminder_time_value']")
    public WebElement btn_time;

    @FindBy(xpath = "//*[@id='toggle_mode']")
    public WebElement btn_writeTime;

    @FindBy(xpath = "//*[@id='input_hour']")
    public WebElement txt_hour;

    @FindBy(xpath = "//*[@id='input_minute']")
    public WebElement txt_minute;

    @FindBy(xpath = "//*[@id='button1']")
    public WebElement btn_timeOk;

    @FindBy(xpath = "//*[@contentDescription='Save']")
    public WebElement btn_completeReminder;

    @FindBy(xpath = "//*[@contentDescription='Delete']")
    public WebElement btn_deleteReminder;


}
