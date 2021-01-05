package PageObjects.fitnessApp;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logPage

{
    @FindBy(xpath = "//*[@id='btnSignIn']")
    public WebElement btn_skipLogin;

    @FindBy(xpath = "//*[@id='email_address_edit']")
    public WebElement txt_email;

    @FindBy(xpath = "//*[@id='password_edit']")
    public WebElement txt_password;

    @FindBy(xpath = "//*[@id='login_button']")
    public WebElement btn_logIn;

    @FindBy(xpath = "//*[@contentDescription='ניווט למעלה']")
    public WebElement btn_skipTrial;

}
