Feature: New Post
Scenario: Valid post
Given Employee has posted all valid data.
When Employee clicks on "submit" button.
Then System should show a message "post is successful".

Scenario: Invalid Name
Given Employee has posted invalid Name.
When Employee clicks on "submit" button.
Then System should show a message "Invalid Name"

Scenario: Invalid Email
Given Employee has posted invalid Email.
When Employee clicks on "submit" button.
Then System should show a message "Invalid Email"

Scenario: Invalid Phone
Given Employee has posted invalid Phone.
When Employee clicks on "submit" button.
Then System should show a message "Invalid Phone"

Scenario: Invalid Source
Given Employee has posted invalid Source.
When Employee clicks on "submit" button.
Then System should show a message "Invalid Source"

Scenario: Invalid Destination
Given Employee has posted invalid Destination.
When Employee clicks on "submit" button.
Then System should show a message "Invalid Destination"

Scenario: Invalid Time
Given Employee has posted invalid Time.
When Employee clicks on "submit" button.
Then System should show a message "Invalid Time"

Scenario: Reset post
Given Employee has posted some/no data.
When Employee clicks on "reset" button.
Then System should reset all fields to blank.
