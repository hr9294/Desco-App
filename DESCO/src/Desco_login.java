import java.util.Scanner;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Desco_login {
	public static void main(AndroidDriver<MobileElement> driver, Scanner sc) throws InterruptedException {

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]").sendKeys("01959593831");
        Thread.sleep(2000);
        
        driver.findElementByXPath("//android.widget.Button[@content-desc=\"Proceed\"]").click();
        Thread.sleep(2000);
              
        /*driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]").sendKeys("123456");
        Thread.sleep(2000);
        
        driver.findElementByXPath("//android.widget.Button[@content-desc=\"Verify\"]").click();
        Thread.sleep(2000);
        
        driver.findElementById("Verify").click();
        Thread.sleep(2000);*/
        
        
        System.out.println("Welcome to The Desco App");
		
    }
		
	}
