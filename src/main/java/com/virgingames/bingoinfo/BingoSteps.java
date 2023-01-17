package com.virgingames.bingoinfo;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


public class BingoSteps {

  @Step("Getting all information of Bingo")
    public ValidatableResponse getBingoInfo(){
          return SerenityRest.given().log().all()
          .header("Content-Type", "text/plain")
          .header("Connection", "keep-alive")
          .when()
          .get("/bingo/GetBingoLobbyFeed.do")
          .then().statusCode(200);





          }

}
