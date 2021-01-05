package SanityTests;

import Extensions.verifications;
import Utilities.CommonOps;
import WorkFlows.electronFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class electronDemo extends CommonOps

{
    @Test(description = "Test01: Verify Screen Resolution")
    @Description("Test Description: Getting the Resolution from ElectronDemos and Verify it")
    public void test01_logIn()
    {
        electronFlows.getScreenInfo();
        verifications.textInElement(ElectronMain.field_screen_info, "Your screen is: 1536px x 864px");
    }
}
