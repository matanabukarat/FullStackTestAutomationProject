package PageObjects.fitnessApp;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class mainPage

{
    @FindBy(xpath = "//*[@id='action_home']")
    public WebElement btn_home;
}
