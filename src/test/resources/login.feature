Feature: User Login

  Scenario Outline: User can login with valid username and password
    Given User visited the portal
    When User inputs valid "<username>" and "<password>"
    Then User can see Error Message

    Examples:
      | username | password |
      | admin    | 123      |
      | abc      | 123      |