Feature: 

	# 
	# *AC2 - Test Case2*
	#
	#*The user can Change any info under Profile Settings page*
	@HECW-98
	Scenario: The user should be able to Change any info under Profile Settings page
		Given the user navigate to login page
		When the user navigate to profile - settings module
		And the user changes the full name as "John Smith"
		Then the full-name info changed under Profile-Settings