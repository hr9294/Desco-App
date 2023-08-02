import java.util.Scanner;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Desco_Accounts {

	public static void main(AndroidDriver<MobileElement> driver, Scanner sc) throws InterruptedException {
	
	Desco_login.main(driver, sc);
	Thread.sleep(3000);
	
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[5]").click();
    Thread.sleep(2000);
    
    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText").click();
    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText").sendKeys("15000204");
    Thread.sleep(2000);
    
    driver.findElementByXPath("//android.widget.Button[@content-desc=\"Add Account\"]").click();
    Thread.sleep(5000);
 
    driver.findElementByXPath("(//android.view.View[@content-desc=\"Recharge\"])[1]").click();
    Thread.sleep(2000);
   	
    MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Acc Details\nTab 2 of 4");
    el11.click();
    Thread.sleep(2000);
    
    driver.findElement(MobileBy.AndroidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
    Thread.sleep(2000);
    
    MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Usages\nTab 3 of 4");
    el12.click();
    Thread.sleep(5000);
    
    driver.findElement(MobileBy.AndroidUIAutomator(
	        "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
    
    Thread.sleep(2000);
    
    MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("History\nTab 4 of 4");
    el13.click();
    Thread.sleep(2000);
    
    driver.findElement(MobileBy.AndroidUIAutomator(
	        "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
    
    MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("Recharge\nTab 1 of 4");
    el14.click();
    Thread.sleep(2000);
    
    
    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.widget.EditText").click();
    Thread.sleep(2000);
    
    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.widget.EditText").sendKeys("400");
    Thread.sleep(2000);
    
    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View").click();
    Thread.sleep(2000);
    
    driver.findElementByXPath("//android.widget.Button[@content-desc=\"Proceed\"]").click();
    Thread.sleep(5000);
    
    driver.findElement(MobileBy.AndroidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
    Thread.sleep(2000);
    
    driver.findElementByXPath("//android.widget.Button[@content-desc=\"Recharge ৳406.00\"]").click();
    Thread.sleep(2000);
    
    driver.findElement(MobileBy.AndroidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
    Thread.sleep(2000);
    
    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView").click();
    Thread.sleep(2000);
    
    //driver.findElement(MobileBy.AndroidUIAutomator(
          //  "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
   //driver.findElement(MobileBy.AndroidUIAutomator(
           // "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(100000)"));
    //Thread.sleep(1000);   
    
    driver.findElementById("com.desco.ssl:id/bankPageProgress").click();
    Thread.sleep(2000);
    
    String str ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.GridView/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.widget.Button";
    driver.findElementByXPath(str).click();
    Thread.sleep(3000);
    
	//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView").click();
   /* WebElement element=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.GridView/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.widget.Button");
   element.click();
   Thread.sleep(3000);*/
    
    /*WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.GridView/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.widget.Button")));
    element.click(); 
    Thread.sleep(3000);*/
    //driver.findElementByXPath("//android.widget.Button[@content-desc=\"Okay\"]").click();
    //Thread.sleep(10000);
   
    
    System.out.println("For Download receipt, Please Enter: 1");
	System.out.println("For Okay, Please Enter: 2");
	System.out.println("Please Enter your choise: \n");
				
	String ch = sc.nextLine();
	
	try {
		int int_ch = Integer.parseInt(ch);
				
		if (int_ch == 1) {
			driver.findElementByXPath("//android.widget.Button[@content-desc=\"Download Receipt\"]").click();
		} 
		else if (int_ch == 2) {
			driver.findElementByXPath("//android.widget.Button[@content-desc=\"Okay\"]").click();
		} 
		else {
			System.out.println("Sorry. You put Wrong Value\n");
		}	
	}
	catch(NumberFormatException e) {
		System.out.println("Sorry. You put Wrong Value\n");
	}
	
	finally {
	}
	
	 driver.findElementByXPath("(//android.view.View[@content-desc=\"Recharge\"])[1]").click();
	 Thread.sleep(4000);
	    
	MobileElement el21 = (MobileElement) driver.findElementByAccessibilityId("Acc Details\nTab 2 of 4");
    el21.click();
    Thread.sleep(2000);
    
    driver.findElement(MobileBy.AndroidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
    
    MobileElement el22 = (MobileElement) driver.findElementByAccessibilityId("Usages\nTab 3 of 4");
    el22.click();
    Thread.sleep(5000);
    
    driver.findElement(MobileBy.AndroidUIAutomator(
	        "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
    Thread.sleep(2000);
    
    MobileElement el23 = (MobileElement) driver.findElementByAccessibilityId("History\nTab 4 of 4");
    el23.click();
    Thread.sleep(2000);
    
    driver.findElement(MobileBy.AndroidUIAutomator(
	        "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
    
    MobileElement el24 = (MobileElement) driver.findElementByAccessibilityId("Recharge\nTab 1 of 4");
    el24.click();
    Thread.sleep(2000);
	 
    driver.quit();
	 
   }


}
