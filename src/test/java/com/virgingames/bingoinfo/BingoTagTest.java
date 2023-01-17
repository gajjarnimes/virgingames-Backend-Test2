package com.virgingames.bingoinfo;
import resources.testbase.TestBase;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;

import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class BingoTagTest extends TestBase {

    @WithTags({@WithTag("bingofeature:SMOKE"),
    @WithTag("bingofeature:POSITIVE")})

    @Title("This Test will Get All Bingo Record if a status code verify 200")
    @Test
    public void GetAllBingoInfo() {
        SerenityRest.rest()
                .given()
                .when()
                .get("/bingo/GetBingoLobbyFeed.do")
                .then()
                .log().all()
                .statusCode(200);





    }
}
