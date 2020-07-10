package tutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiAutomatorTest extends Appium{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElementByAndroidUIAutomator("Attribute("Value")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//validate clickable features for all the options
		//driver.findElementByAndroidUIAutomator("new UiSelector().Property(Value)");
		
		Dimension size=driver.findElementByAndroidUIAutomator("new UiSelector().clickable(false)").getSize();
		System.out.println(size);

	}

}
