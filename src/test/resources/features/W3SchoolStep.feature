Feature: W3Schools Visit Link Test

  Scenario: User should be able to see search input
    Given I launch W3Schools URL "https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_target"
    When I click the Visit W3Schools! link
    Then I should see the search input box
