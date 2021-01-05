package PageObjects.fitnessApp;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class leftMenuPage

{
    @FindBy(xpath = "//*[@contentDescription='Open Drawer']")
    public WebElement btn_openMenu;

    @FindBy(xpath = "//*[@text='Reminders']")
    public WebElement btn_reminders;
}
