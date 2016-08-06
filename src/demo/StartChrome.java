package demo;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class StartChrome {
	
@Test
public void test1() throws MalformedURLException, InterruptedException{
	
//Create object of DesiredCapabilities class and specify android platform
DesiredCapabilities capabilities = DesiredCapabilities.android();
                     //Object//


//FIRST-set the capability to execute test in chrome browser
capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);

//SECOND-set the capability to execute my test on Android Platform
capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);

//THIRD-Define Platform Name
capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");

//FOURTH-set the Device Name
capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "my-phone");

//FIFTH-set the Version Name
capabilities.setCapability(MobileCapabilityType.VERSION, "5.1.1");


//Now create an Object of URL-class and specify the Appium Server address
URL url = new URL("http://127.0.0.1:4723/wd/hub");


//create an Object of AndroidDriver class and (pass the url and pass the capability)
WebDriver driver = new AndroidDriver(url, capabilities);


//Now Time for OPEN-URL
	driver.get("http://facebook.com");
	
//PRINT the title
	System.out.println("The title is "+driver.getTitle());

//Enter USER-NAME, PASSWORD & click on SUBMIT button
	driver.findElement(By.name("email")).sendKeys("vijay.t.vj@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("vijaykumar");
	driver.findElement(By.id("u_0_5")).click();
	
	Thread.sleep(5000); //by using this wait, we can see the execution before the application quits on the mobile.
	
	driver.quit();
	
/* TO RUN ABOVE CODE - install MicrosoftWebDriver, connect Android Mobile so that PDAnet will be ON,
    				   put the Appium Server ON.														*/
					   
	
	


}

}
