@HECW-78
Feature: 

	#*As a user, I should be able to upload a file, move or delete any selected file under the Files module*
	#
	#*AC:*
	#
	#*User can upload a file*
	#
	# 
	@HECW-75
	Scenario: Upload a file functionality

		Given the user in the login page
		When the user enters valid credentials
		Then the files Files page should be displayed
		
		When the user clicks the plus sign button
		Then the user uploads wanted file with upload button option
		And the uploaded file should be displayed in files page


			

	#*As a user, I should be able to upload a file, move or delete any selected file under the Files module*
	#
	#*AC:*
	#
	#*User can move or copy any selected item***
	@HECW-76
	Scenario: Move or copy any selected item

		Given the user in the login page
		When the user enters valid credentials
		Then the files Files page should be displayed
		
		When the user clicks on the icon more in front of wanted file
		And clicks on Move or Copy option from drop down
		Then the Choose target folder should be displayed

		When the user clicks on plus icon
		And the user clicks on submit arrow to create a new folder
		And the user clicks move button
		And the user clicks home icon
		And the user clicks on newly created folder
		Then the moved file should be displayed

		When the user clicks on the icon more in front of wanted file
		And clicks on Move or Copy option from drop down
		Then the Choose target folder should be displayed

		When the user clicks on the copy button
		Then the copied file should be on the files page




	#*As a user, I should be able to upload a file, move or delete any selected file under the Files module*
	#
	# 
	#
	#*Ac:*
	#
	#*User can delete any selected item***
	@HECW-77
	Scenario: Delete any selected item

		Given the user in the login page
		When the user enters valid credentials
		Then the files Files page should be displayed
		
		When the user clicks on the icon more in front of wanted file


		And clicks on Delete option
		Then the selected file should not be displayed on Files page
		When the user clicks on Deleted files
		Then the deleted file should be found
		
		