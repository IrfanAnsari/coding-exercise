Feature: the version can be retrieved

  Background:
    Given baseUri is http://localhost:8083

  Scenario: client makes call to GET cmd/version
    When the client calls /version
    Then the client receives status code of 200
    And response body should contain 1.0
    And response body should be valid json