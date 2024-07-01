package org.adactin_Runner_Class;

import org.Base_Class.Base_Class;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\org\\Feature\\adactin.feature",glue = "org.Step_Definition_Adactin",
monochrome = true,dryRun=false
)

public class Runner_Class {
	

  public static WebDriver driver;
	
	 @BeforeClass
	 public static void start() {
		
		 driver= Base_Class.launch_Browser();
		 driver.manage().window().maximize();
		
 }
 
 public static void end() {
	 driver.quit();
}







}
