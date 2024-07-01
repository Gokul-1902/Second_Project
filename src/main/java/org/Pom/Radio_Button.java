package org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Radio_Button {
	
	private WebDriver driver;
	
	 @FindBy(xpath="//input[@id='radiobutton_0']")
	    private WebElement RatioButton;
	    
	    @FindBy(xpath="//input[@id='continue']")
	    private WebElement continuebutton;

		
	    
	    public Radio_Button(WebDriver driver2) {
	    	this.driver=driver2;
	    	PageFactory.initElements(driver, this);
	    	
	    	
	    }

		public WebElement getRatioButton() {
			return RatioButton;
		}

		public WebElement getContinuebutton() {
			return continuebutton;
		}

}
