Feature: validation of Hotal Booking Functionality in Adaction hotal Application

Scenario: login page
Given user have to launch The Adactin url
When user Have To Enter the User in the Username 
And user Have To Enter the password in the Password
Then user have To click on the Loginbutton Which Naviates The user to search Hatel page


Scenario: Serach Hotal Page
   When user have To select The Location in the Location DropDown
   And user have to Select the Hotels In the hotels DropDown
   And user Have To Select The Room Type in the Room type 
   And user Have to select the number of Rooms in the number of rooms DropDown
   And user Have to Enter the Check in Date in the Check in Date Field
   And user Have to Enter the Check out in Date in the Check out Date field
   And user Have to select the Numebr of Adults in the Adults per Room DropDown
   And user Have to Select the Number of Children in the Children per Room DropDown
   Then user Have to Click on The Searchbutton Which Navigates To Select Hotel page
   

Scenario: Select Hotel Page
   When user Have to Select The Conform Radio button based  on previous Selected option
   And user Have to click on The ContinueBuuton Which Navigates To Book a hotel Page
   
 
 Scenario: Book A Hotel page
 
    When user Have to enter The First name in the First Name  field
    And user Have to enter the Last name in the Last Name  field
    And User Have To Enter the Address in the Billing address field
    And user HAve To Enter the Credit Card Detil in the Credit Card  field
    And User Have To enter the Credit Card type Form the  credit Card 
    And User Have To Enter the Credit Card  month and year Form the expiry Date dropdown
    And User Have To Enter the Credit Card CVv Form the Cvv number field
    And user Have to Click on the Book Now Button Which Naviates To Hotel Booking Confirm Page
    Then the user viewd the booking confirmation page
    And the user click on the logout page
    Then the user have Successful logout
    
    




