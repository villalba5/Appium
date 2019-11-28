import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragDropDemo extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		Thread.sleep(1000);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		Thread.sleep(1000);
		
		TouchAction t = new TouchAction(driver);
		
		WebElement source = driver.findElementsByClassName("android.view.View").get(0);
		WebElement destination = driver.findElementsByClassName("android.view.View").get(1);
		
		//t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		t.longPress(element(source)).moveTo(element(destination)).release().perform();
	}

}
