package org.Pom;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	
	private WebDriver driver;
	


       
	
	    @FindBy(xpath="//select[@name='location']")
	    private WebElement Location;
	    
	    @FindBy(xpath="//select[@id='hotels']")
	     private WebElement Hotels;
	    
	    @FindBy(xpath="//select[@id='room_type']")
	    private WebElement RoomType;
	    
	    @FindBy(xpath="//select[@id='room_nos']")
	    private WebElement NumberofRooms;
	    
	    @FindBy(xpath="//input[@id='datepick_in']")
	    private WebElement CheckInDate;
	    
	    @FindBy(xpath="//input[@id='datepick_out']")
	    private WebElement  CheckOutDate;
	    
	    @FindBy(xpath="//select[@id='adult_room']")
	    private WebElement AdultsperRoom;
	    
	    @FindBy(xpath="//select[@id='child_room']")
	    private WebElement ChildrenperRoom;
	    
	    @FindBy(xpath="//input[@id='Submit']")
        private WebElement Searchbutton;


	    public Search_Hotel_Page(WebDriver driver2) {
			this.driver=driver2;
	    	PageFactory.initElements(driver, this);
	    }
	    
	 

		public WebElement getLocation() {
			return Location;
		}

		public WebElement getHotels() {
			return Hotels;
		}

		public WebElement getRoomType() {
			return RoomType;
		}

		public WebElement getNumberofRooms() {
			return NumberofRooms;
		}

		public WebElement getCheckInDate() {
			return CheckInDate;
		}

		public WebElement getCheckOutDate() {
			return CheckOutDate;
		}

		public WebElement getAdultsperRoom() {
			return AdultsperRoom;
		}

		public WebElement getChildrenperRoom() {
			return ChildrenperRoom;
		}
	    
		  public WebElement getSearchbutton() {
				return Searchbutton;
			}
	    

}
