#Author: jomicasierra@unac.edu.co

@tag
Feature: Reserva de hotel en atrapalo 
Yo como ususario con internet voy a entrar a la pagina de
atrapalo y voy a reservar mi hotel

  @smoketest
  Scenario: Busqueda de producto en Ebay exitosa
    Given Jose entra a la pagina Atrapalo
    When El busca y reserva el hotel
    Then El verifica que la reserva se halla hecho satisfactoriamente
    