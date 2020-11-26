 Feature: Somebody will be greeting

   Background:
     * url baseUrl

   Scenario: normale Ablauf - Greet a user
     Given path 'hello'
     When method GET
     Then status 201

   Scenario: Fehlschlag 1 wegen fehlenden Daten - Greet a user
     Given path 'hello'
     When method GET
     Then status 201

   Scenario: Fehlschlag 2 wegen fehlenden Daten - Greet a user
     Given path 'hello'
     When method GET
     Then status 200

   Scenario: Workaround - Greet a user
     Given path 'hello'
     When method GET
     Then status 200

