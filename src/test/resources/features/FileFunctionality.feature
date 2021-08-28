@HECW-78
Feature: 

	#*As a user, I should be able to upload a file, move or delete any selected file under the Files module*
	#
	#*AC:*
	#
	#*User can upload a file*
	#
	# 
	Background:
		Given the user navigate to login page
		When the user enters username and password
		Then the user should login successfully to the main page

	@HECW-75
	Scenario: Upload a file functionality

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

		When the user right click on the wanted file
		And clicks on Move or Copy option from drop down
		Then the Choose target folder should be displayed

		When the user clicks on plus icon
		And the user names the the folder
		And the user clicks on submit arrow to create a new folder
		And the user clicks move button
		And the user clicks home button
		And the user clicks on newly created folder
		Then the moved file should be displayed

		When the user right clicks the moved file
		And clicks on Move or Copy option from drop down
		And the Choose target folder should be displayed
		And the user cliks on home icon button
		And the user clicks on the copy button
		And the user clicks home button

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

		When the user right click on the wanted file
		And clicks on Delete option
		When the user clicks on Deleted files
		Then the deleted file should be found under deleted files


		When the user navigates back to files page
		And the user right cliks on the wanted folder
		And clicks on Delete option
		And the user clicks on Deleted files
		Then the deleted folder should be found under deleted files



