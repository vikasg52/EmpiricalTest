Feature: Verify Sign Up button on redirection
  
  Scenario: User should be able to see sign up button
    Given I open the URL "https://v0-button-to-open-v0-home-page-h5dizpkwp.vercel.app/"
    When I click the "Click me" button
    Then I should see the Sign Up button
