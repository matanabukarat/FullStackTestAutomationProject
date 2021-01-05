package SanityTests;

import Extensions.verifications;
import Utilities.CommonOps;
import WorkFlows.calcFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class calculatorDesktop extends CommonOps
{
    @Test(description = "Test01: Verify Addition Command")
    @Description("Test Description: Verify Addition Command in Calculator")
    public void test01_logIn()
    {
        calcFlows.CalculateAddition();
        verifications.textInElement(calcMain.field_results, "8");
    }
}
