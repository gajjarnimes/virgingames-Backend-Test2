Feature: Testing the request for all Record on the virgingames application

  Scenario: Check all records of  virgingames application
    When User sends a GET request to GetBingoLobbyFeed.do endpoint
    Then User must get a valid response of status code 200
