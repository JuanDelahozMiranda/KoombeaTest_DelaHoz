#language: en
  Feature: the system has the ability to use rickandmortyapi Endpoints
    Like a user I want to validate the combinations of requests, status, bodies, responses and non-empty headers.

  @testCases
    Scenario Outline: the system has the ability to use rickandmortyapi Endpoints
    Given the system set-up en using '<URI>'
    When the system has the ability to perform GET request whit '<PARAMETER>'
    Then the system should validate the <STATUS>
    Then the system should validate a non-empty header
    Then the system should validate a non-empty body

    Examples:
      | URI                              | PARAMETER           | STATUS |
      | https://rickandmortyapi.com/api/ | character           | 200    |
      | https://rickandmortyapi.com/api/ | character/1         | 200    |
      | https://rickandmortyapi.com/api/ | character/999       | 404    |
      | https://rickandmortyapi.com/api/ | character/[1,2]     | 200    |
      | https://rickandmortyapi.com/api/ | character/[1,999]   | 200    |
      | https://rickandmortyapi.com/api/ | character/[811,999] | 200    |
      | https://rickandmortyapi.com/api/ | character/a         | 500    |
      | https://rickandmortyapi.com/api/ | character/1,2       | 200    |
      | https://rickandmortyapi.com/api/ | character/1.2       | 404    |
      | https://rickandmortyapi.com/api/ | characters          | 404    |