import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Desco_Main {
	
	     
	     
       static Object driverMethod() throws MalformedURLException, InterruptedException {
		
    	
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		dc.setCapability("appPackage", "com.desco.ssl");
		dc.setCapability("appActivity", "com.example.descoapp_flutter.MainActivity");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver<MobileElement> dr = new AndroidDriver<MobileElement>(url, dc);
		Thread.sleep(5000);
		
		return dr;

 }
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		@SuppressWarnings("unchecked")
		AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) driverMethod();
		
		Scanner sc = new Scanner(System.in);
		
		//Desco_login.main(driver, sc);
		Desco_Accounts.main(driver, sc);
		//driver.quit();
		sc.close();
	}	

}

