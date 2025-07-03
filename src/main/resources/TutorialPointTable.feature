Feature: TutorialPointTable

    Scenario: Overeni dat tabulky
      Given Uzivatel se nachazi na strance "https://www.tutorialspoint.com/selenium/practice/webtables.php"
      Then jmeno na druhem radku tabulky bude "Alden"
      And prijmeni na druhem radku tabulky bude "Cantrell"