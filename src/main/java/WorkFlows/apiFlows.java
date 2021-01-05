package WorkFlows;

import Extensions.apiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class apiFlows extends CommonOps

{
    @Step("Get Team From Grafana")
    public static String getTeamProperty(String jPath)
    {
        Response response = apiActions.get("/api/teams/search");
        return apiActions.extractFromJSON(response, jPath);
    }

    @Step("Create New Team in Grafana")
    public static void postTeam(String name, String email)
    {
        params.put("name", name);
        params.put("email", email);
        apiActions.post(params,"/api/teams");
    }

    @Step("Update Team in Grafana")
    public static void updateTeam(String name, String email, String id)
    {
        params.put("name", name);
        params.put("email", email);
        apiActions.put(params,"/api/teams/" + id);
    }

    @Step("Delete Team in Grafana")
    public static void deleteTeam(String id)
    {
        apiActions.delete(id);
    }
}
