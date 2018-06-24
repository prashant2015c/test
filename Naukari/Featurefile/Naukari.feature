Feature: Naukari site testing

  Scenario Outline: 
    Given Go to the site "<Driver>","<Homepage>"
    When Popup comes handle it
    Then close it

    @first
    Examples: 
      | Driver | Homepage     |
      | chrome     | naukari_site |
      
