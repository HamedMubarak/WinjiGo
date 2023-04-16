Feature: Login

Scenario Outline: login with valid credentials
  Given login page is opened
  When  enter valid "<email>" email address in login page
  And   enter valid "<password>" password in login page
  And   click on login button in login page
  Then  home page should be opened
  Examples:
    | email        | password |
    | EmailAddress | Password |
