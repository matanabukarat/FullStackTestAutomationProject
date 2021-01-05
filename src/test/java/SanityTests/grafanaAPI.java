package SanityTests;

import Extensions.verifications;
import Utilities.CommonOps;
import WorkFlows.apiFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class grafanaAPI extends CommonOps
{
    @Test(description = "Test01: Create Team And Verify it")
    @Description("Test Description: Add Team to Grafana and Verify it")
    public void test01_CreateTeamAndVerify()
    {
        apiFlows.postTeam("GrafanaTeam", "GrafanaTeam@gmail.com");
        verifications.text(apiFlows.getTeamProperty("teams[0].name"), "GrafanaTeam");
    }

    @Test(description = "Test02: Update Team And Verify it")
    @Description("Test Description: Update Team to Grafana and Verify it")
    public void test02_UpdateTeamAndVerify()
    {
        apiFlows.updateTeam("MatanTeam", "GrafanaTeam@gmail.com", "6");
        verifications.text(apiFlows.getTeamProperty("teams[0].name"), "MatanTeam");
    }

    @Test(description = "Test03: Delete Team And Verify it")
    @Description("Test Description: Delete Team in Grafana and Verify it")
    public void test03_DeleteTeamAndVerify()
    {
        apiFlows.deleteTeam("6");
        verifications.text(apiFlows.getTeamProperty("totalCount"), "0");
    }
}
