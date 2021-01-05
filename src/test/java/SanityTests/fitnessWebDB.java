package SanityTests;

import Utilities.CommonOps;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Utilities.Listeners.class)
public class fitnessWebDB extends CommonOps

{
     @Test(description = "Test01: Login to FitnessPal with DB")
     @Description("Test Description: Login to FitnessPal Web Application with DB")
     public void test01_logIn()
        {
            webFlows.loginDB();
        }
}
