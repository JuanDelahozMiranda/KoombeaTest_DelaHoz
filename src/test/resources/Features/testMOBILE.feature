#language: en
Feature: El usuario puede generar la conversion de medidas usando la app
  Como usuario puedo ingresar a la app
  Cuando selecciono o busco un tipo de conversion
  Entonces puedo presionar elementos y visualizar las interacciones

  @positive
  Scenario Outline: Como usuario puedo realizar conversiones de Longitudes
    Given puedo ingresar a la app
    When busco la opcion Longitud en el menu
    Then Presiono el valor a convertir
    Then Observo que el valor ingresado es '<Input>' y el obtenido es '<Output>'

    Examples:
      | Input | Output  |
      | 120   | 3 657.6 |

  @positive
  Scenario Outline: Como usuario puedo realizar conversiones de Velocidades
    Given puedo ingresar a la app
    When busco la opcion '<Parametro>' en la opcion de buscar
    Then Presiono el valor a convertir
    Then Observo que el valor ingresado es '<Input>' y el obtenido es '<Output>'

    Examples:
      | Input | Output | Parametro   |
      | 120   | 120    | Aceleracion |

  @positive
  Scenario: Intereaccion General
    Given puedo ingresar a la app
    Then priono muchos elementos
