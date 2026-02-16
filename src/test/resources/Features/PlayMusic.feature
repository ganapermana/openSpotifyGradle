Feature: Play Music
  @Scenario1
  Scenario: login, search and play music on repeat
    Given I already open browser
    And user open spotify web
    And user do login into spotify with email "tasaphiraa@gmail.com"
    And user search for "Blokir Pikir" on search bar
    When user click play button
    And user wait for 39 seconds and repeat the song 1001 times
    Then  user close the browser

  @Scenario2
  Scenario: login search for 2 music and play repeatedly
    Given I already open browser
    And user open spotify web
    And user do login into spotify with email "tasaphiraa@gmail.com"
    And user search for "Blokir Pikir" on search bar
#    And user click on song artist
#    When user play on first song
    When user click play button
    And user click on repeat song button
    And user wait for 39 seconds and play next and back repeat 1001 times
    Then  user close the browser

  @NormalScenario
  Scenario: login and search for Tafsir Mengudara
    Given I already open browser
    And user open spotify web
    And user do login into spotify with email "tasaphiraa@gmail.com"
    And user search for "Mengudara Tafsir" on search bar
    When user click play button
    And user click on repeat song button

#  wait for 30 seconds and repeat
#  repeat 10 times