import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException {
		// TODO Auto-generated method stub

		//File f = new File("(default package)");
		File fs = new File("ApiDemos-debug.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AlvaroEmulator");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);

		return driver;

	}

}
