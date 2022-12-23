Feature: NonExistentCertificate

  Scenario: Search of non existent Hillel certificate
    When The page is opened "https://certificate.ithillel.ua/"
    Then Enter random certificate number
    Then The Check button is active
    And Press the Check button
    Then The message Сертифікат не знайдено is displayed
