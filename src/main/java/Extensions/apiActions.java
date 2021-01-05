package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.json.simple.JSONObject;
import io.restassured.response.Response;

public class apiActions extends CommonOps

{
    @Step("Get Data From Server")
    public static Response get(String paramValues)
    {
        response = httpRequest.get(paramValues);
        return response;
    }
    @Step("Extract Value From JSON Format")
    public static String extractFromJSON(Response response, String path)
    {
        jp = response.jsonPath();
        return jp.get(path).toString();
    }

    @Step("Post Data to Server")
    public static void post(JSONObject params, String resource)
    {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.post(resource);
    }

    @Step("Update Data to Server")
    public static void put(JSONObject params, String resource)
    {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.put(resource);
    }

    @Step("Delete Data From Server")
    public static void delete(String id)
    {
        response = httpRequest.delete("/api/teams/" + id);
    }
}
