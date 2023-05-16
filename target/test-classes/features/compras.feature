
Feature: Compras
  El usuario compra diferentes productos de la pagina
  
  
  Background: 
    Given el usuario ingresa en DEMOBLAZE
    And el usuario se direge a la pestaña login
    And el usuario se logea correctamente
      | nombre       | password     |
      | Mark26 | Mark26 |
    

  @CompraTelefonos
  Scenario Outline: Compra de telefonos moviles
    When el usuario se encuentra en la pagina home
    And el usuario clika en el telefono
      | telefono          |
      | Samsung galaxy s6 |
      | Nokia lumia 1520  |
      | Nexus 6           |
    And el usuario añade a la cesta el telefono movil
    When el usuario se dirige a la cesta de la compra
    Then el usuario verifica que el telefono con el "<nombre>" se ha añadido y que los datos son correctos

		Examples: 
		      | nombre            |
		      | Samsung galaxy s6 |
		      | Nokia lumia 1520  |
		      | Nexus 6           |
		      
		      
	@CompraOrdenadores
	Scenario Outline: Compra de ordenadores
    When el usuario se encuentra en la pagina home
    And el usuario se dirige a la categoria de ordenadores
    And el usuario clika en el ordenador
      | Ordenador          	|
      | Sony vaio i5 				|
      | Sony vaio i7  			|
      | MacBook air         |
    And el usuario añade a la cesta el ordenador
    When el usuario se dirige a la cesta de la compra
    Then el usuario verifica que el ordenador con el "<nombre>" se ha añadido y que los datos son correctos

		Examples: 
		      | nombre        |
		      | Sony vaio i5 |
		      |  Sony vaio i7  |
		      | MacBook air |
	