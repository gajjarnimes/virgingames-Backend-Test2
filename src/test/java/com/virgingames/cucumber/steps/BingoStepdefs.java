package com.virgingames.cucumber.steps;

import com.virgingames.bingoinfo.BingoSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;


public class BingoStepdefs {

    static ValidatableResponse response;

    static  int _1= 1;
    static  int _2= 1;
    @Steps
    BingoSteps bingoSteps;
    @When("^User sends a GET request to GetBingoLobbyFeed.do endpoint$")
    public void userSendsAGETRequestToGetBingoLobbyFeedDoEndpoint() {
        response=bingoSteps.getBingoInfo();
    }
    @Then("^User must get a valid response of status code 200$")
    public void userMustGetAValidResponseOfStatusCode() {
        response.statusCode(200);
    }
}
