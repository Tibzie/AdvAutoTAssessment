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
@tag
Feature: Managing details of owners as an admin
  As an Admin,
  I want to manage the details of the owners in the system,
  So that I can keep up to update information about all owners.

  @tag1
  Scenario: Creating an owner
    Given The website is ready to use
		When I click on the owner tab
		And I fill out the details
	 	Then I click on the submit button

