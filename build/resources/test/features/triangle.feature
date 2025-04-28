Feature: Verificar tipo de triángulo

  Scenario Outline: Triángulo valido
    Given que el usuario accede a la página del triángulo
    When ingresa nombre <n>
    When ingresa los lados <a>, <b> y <c>
    And presiona el botón de verificación
    Then debe mostrarse el resultado <esperado>
    Examples:
      | n      | a   | b   | c   | esperado      |
      | "Joel" | "3" | "3" | "3" | "Equilateral" |