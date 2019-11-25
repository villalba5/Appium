import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends Base{
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		Thread.sleep(1000);
		driver.findElementById("android:id/checkbox").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("holaaa");
		driver.findElementById("android:id/button1").click();
		
	}
}
