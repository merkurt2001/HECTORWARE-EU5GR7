Feature: 

	# 
	#
	#*AC1 - Test Case 1*
	#
	#*Display personal info under Profile Settings page*
	#
	# 
	#
	#
	#
	# 
	@HECW-91
	Scenario: The user should be able to Display personal info under Profile Settings page
				Given the user navigate to login page
				And the user enters username and password
				When the user navigate to profile - settings module
				Then the Personal info is displayed