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
Feature: Registrarse
  I want to use this template for my feature file

  @Registrar
  Scenario Outline: Realizar registro
    Given estoy en la pagina home
    And pulso el boton sing up
    And inserto "<usuario>" y "<contraseña>"
    When hago clik en sign up
    Then verifico que se ha realizado con el mensaje "<mensaje>"

    Examples: 
      | usuario | contraseña | mensaje             |
      | MarkOS43 |        123 | Sign up successful. |
			| MarkOS44 |        123 | Sign up successful. |