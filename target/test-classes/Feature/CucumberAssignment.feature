Feature: elearning upskill

  @Regression1
  Scenario Outline: Registration on elearning upskill application
    Given User is on elearning application registrationpage
    And User click on signup button for registration
    When User enter mandatory "<Firstname>"and "<Lastname>" and "<e-mail>" and "<Username>" and "<Pass>" and "<Confirmpassword>" details
    And User click on regitser button
    Then User should redirect to elearning homepage
    And User select inbox from user profile
    And User click on compose message icon to enter subject line
    And User click on send message button at the bottom

    Examples: 
      | Firstname | Lastname | e-mail          | Username | Pass    | Confirmpassword |
      | Applee    | Ziz      | apple@gmail.com | Apple249 | Abc@123 | Abc@123         |
