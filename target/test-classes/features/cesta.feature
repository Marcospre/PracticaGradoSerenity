#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Cesta
  I want to use this template for my feature file
	
  @Cesta
  Scenario Outline: Cesta
    Given estoy logeado con el usuario "<usuario>" de contraseña "<contraseña>"
    And cliko en el telefono
      | telefono          |
      | Samsung galaxy s6 |
      | Nokia lumia 1520  |
      | Nexus 6           |
    And añado a la cesta
    When voy a la cesta
    Then combruebo que el telefono "<nombre>" se ha anadido

    Examples: 
      | usuario | contraseña | nombre            |
      | MarkOS1 |        123 | Samsung galaxy s6 |
      | MarkOS1 |        123 | Nokia lumia 1520  |
      | MarkOS1 |        123 | Nexus 6           |
      
      
    @Precios
   	Scenario Outline: Precios
    	Given logeado con el usuario "<usuario>" de contraseña "<contraseña>"
    	When me dirigo a la cesta 
    	Then muestro una tabla de los moviles con los precios ordenados de mayor a menor
    	
    	Examples:
    	| usuario | contraseña | 
      | MarkOS1 |        123 |
