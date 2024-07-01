package org.Step_Definition_Adactin;

import javax.security.auth.login.LoginException;

import org.Base_Class.Base_Class;
import org.Pom.Book_A_Hotel;
import org.Pom.Login_Page;
import org.Pom.Radio_Button;
import org.Pom.Search_Hotel_Page;
import org.adactin_Runner_Class.Runner_Class;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_Step_Definition extends Base_Class{
	
	public static WebDriver driver= Runner_Class.driver;

	
	public  static Login_Page  a = new Login_Page(driver);
	public static Search_Hotel_Page b = new Search_Hotel_Page(driver);
	public static Radio_Button c = new Radio_Button(driver);
	public static Book_A_Hotel d = new Book_A_Hotel(driver);
	
	@Given("user have to launch The Adactin url")
	public void user_have_to_launch_the_adactin_url() {
	    
	    driver.get("https://adactinhotelapp.com/");
	}
	@When("user Have To Enter the User in the Username")
	public void user_have_to_enter_the_user_in_the_username() {
	    
	    
	    send_keys(a.getUsername(),"sathishece4");
	}
	@When("user Have To Enter the password in the Password")
	public void user_have_to_enter_the_password_in_the_password() {
	   
	   
	    send_keys(a.getPassword(), "Password1");
	}
	@Then("user have To click on the Loginbutton Which Naviates The user to search Hatel page")
	public void user_have_to_click_on_the_loginbutton_which_naviates_the_user_to_search_hatel_page() {
	   
	    click(a.getLogin());
	}

	@When("user have To select The Location in the Location DropDown")
	public void user_have_to_select_the_location_in_the_location_drop_down() {
	  
	    click(b.getLocation());
	    select_By_index(b.getLocation(), 4);
	}
	@When("user have to Select the Hotels In the hotels DropDown")
	public void user_have_to_select_the_hotels_in_the_hotels_drop_down() {
	   
	    click(b.getHotels());
	    select_By_index(b.getHotels(), 2);
	}
	@When("user Have To Select The Room Type in the Room type")
	public void user_have_to_select_the_room_type_in_the_room_type() {
	   
	     click(b.getRoomType());
	     select_By_index(b.getRoomType(), 4);
	  
	}
	@When("user Have to select the number of Rooms in the number of rooms DropDown")
	public void user_have_to_select_the_number_of_rooms_in_the_number_of_rooms_drop_down() {
	 
	    click(b.getNumberofRooms());
	    select_By_index(b.getNumberofRooms(), 1);
	}
	@When("user Have to Enter the Check in Date in the Check in Date Field")
	public void user_have_to_enter_the_check_in_date_in_the_check_in_date_field() {
	   
	    clear(b.getCheckInDate());
	     send_keys(b.getCheckInDate(), "25/06/2024");
	    
	    
	}
	@When("user Have to Enter the Check out in Date in the Check out Date field")
	public void user_have_to_enter_the_check_out_in_date_in_the_check_out_date_field() {
	   
	    clear(b.getCheckOutDate());
	    
	     send_keys(b.getCheckOutDate(), "27/06/2024");
	}
	@When("user Have to select the Numebr of Adults in the Adults per Room DropDown")
	public void user_have_to_select_the_numebr_of_adults_in_the_adults_per_room_drop_down() {
	   
	    click(b.getAdultsperRoom());
	    select_By_index(b.getAdultsperRoom(), 2);
	}
	@When("user Have to Select the Number of Children in the Children per Room DropDown")
	public void user_have_to_select_the_number_of_children_in_the_children_per_room_drop_down() {
	   
	    click(b.getChildrenperRoom());
	    select_By_index(b.getChildrenperRoom(), 2);
	    
	}
	@Then("user Have to Click on The Searchbutton Which Navigates To Select Hotel page")
	public void user_have_to_click_on_the_searchbutton_which_navigates_to_select_hotel_page() {
	   
	    click(b.getSearchbutton());
	}

	@When("user Have to Select The Conform Radio button based  on previous Selected option")
	public void user_have_to_select_the_conform_radio_button_based_on_previous_selected_option() {
	   
	    click(c.getRatioButton());
	   
	}
	@When("user Have to click on The ContinueBuuton Which Navigates To Book a hotel Page")
	public void user_have_to_click_on_the_continue_buuton_which_navigates_to_book_a_hotel_page() {
	   
	    click(c.getContinuebutton());
	}
	@When("user Have to enter The First name in the First Name  field")
	public void user_have_to_enter_the_first_name_in_the_first_name_field() {
	  
	    click(d.getFirstName());
	    send_keys(d.getFirstName(), "Gokul");
	}
	@When("user Have to enter the Last name in the Last Name  field")
	public void user_have_to_enter_the_last_name_in_the_last_name_field() {
	   
	    click(d.getLastName());
	    send_keys(d.getLastName(), "Kumar");
	}
	@When("User Have To Enter the Address in the Billing address field")
	public void user_have_to_enter_the_address_in_the_billing_address_field() {
	   
	    click(d.getBillingAddress());
	    send_keys(d.getBillingAddress(), "Cuddalore");
	}
	@When("user HAve To Enter the Credit Card Detil in the Credit Card  field")
	public void user_h_ave_to_enter_the_credit_card_detil_in_the_credit_card_field() {
	   
	    click(d.getCreditCardNo());
	    send_keys(d.getCreditCardNo(), "1234567845678923");
	    
	    
	    
	}
	@When("User Have To enter the Credit Card type Form the  credit Card")
	public void user_have_to_enter_the_credit_card_type_form_the_credit_card() {
	   
	    click(d.getCreditCardType());
	    select_By_index(d.getCreditCardType(), 3);
	}
	@When("User Have To Enter the Credit Card  month and year Form the expiry Date dropdown")
	public void user_have_to_enter_the_credit_card_month_and_year_form_the_expiry_date_dropdown() {
	   
	    click(d.getExpirymonth());
	    select_By_index(d.getExpirymonth(), 5);
	    select_By_index(d.getExpiryear(), 19);
	    
	}
	@When("User Have To Enter the Credit Card CVv Form the Cvv number field")
	public void user_have_to_enter_the_credit_card_c_vv_form_the_cvv_number_field() {
	  	    
	  	    send_keys(d.getCVVNumber(),"456");
	  	   
	}
	@When("user Have to Click on the Book Now Button Which Naviates To Hotel Booking Confirm Page")
	public void user_have_to_click_on_the_book_now_button_which_naviates_to_hotel_booking_confirm_page() {
	   
	    click(d.getBookNOw());
	}
	@Then("the user viewd the booking confirmation page")
	public void the_user_viewd_the_booking_confirmation_page() {
		isdisplayed(d.getBookingConformation());
		
	   
	}
	@When("the user click on the logout page")
	public void the_user_click_on_the_logout_page() {
	  
	    click(d.getLogout());
	}
	@Then("the user have Successful logout")
	public void the_user_have_successful_logout() {
	  
	}
	
	
	}





	
	

