Feature: User log in
  @login
  Scenario: User should be able to log in
    Given User is on homepage
    When User enters log in details
    Then User should be able to log in successfully

@timesheet
    Scenario: User should be able to click on timesheet
      Given User is logged in
      When User clicks on timesheet
      Then User

      Scenario: User should log out
        Given User is logged in
