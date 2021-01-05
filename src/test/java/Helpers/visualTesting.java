package Helpers;

import Utilities.CommonOps;
import Utilities.helperMethods;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class visualTesting extends CommonOps

{
    @Test(description = "Taking Facebook Logo ScreenShot")
    @Description("Taking Facebook Logo ScreenShot For Visual Testing In the Next Versions")
    public void CreateScreenShot()
    {
        webFlows.login(getData("user"), getData("pass"));
        webFlows.mainPtoDP();
        helperMethods.takeElementScreenShot(myfitnesspalExerciseDatabasePage.img_FacebookLogo, "FacebookLogo_ver1.00");
    }
}
