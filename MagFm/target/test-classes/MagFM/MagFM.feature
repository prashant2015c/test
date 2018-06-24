@MagFpp
Feature: Title of your feature
  Background: 
    Given Go to the link
  Scenario Outline: Title of your scenario
    And check all images
    And check all select buttons
    And select two buttons
    And select checkout button
    And enters "<First_name>" "<Last_name>" "<Address1>" "<City>" "<State>"  "<zip_code>"  "<Email>"  "<Reference_ID>"
    And select magazines from STFpage
    And click STFpage submit button
    And select one RAB magazine
    And select three Upsell magazines
    Then enter "<creditcard_number>" "<month>" "<year>"

    Examples: 
      | First_name | Last_name | Address1          | City     | State       | zip_code | Email                     | Reference_ID | creditcard_number | month | year |
      | test       | testpm    | 225 high ridge rd | Stamford | Connecticut |    00000 | prashant2015ccc@gmail.com |     00000    |  4111111111111111 |     8 | 2020 |