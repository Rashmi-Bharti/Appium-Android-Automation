package tutorial;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium {
     
	static AndroidDriver<AndroidElement> driver;
	 
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
	 
	//File app = new File("src", "ApiDemos-debug.apk");
		File app = new File("src", "General-Store.apk");
	DesiredCapabilities cap = new DesiredCapabilities();
	//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_API_28");
	
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator1");
	//cap.setCapability(MobileCapabilityType.VERSION, "10.0");
	//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	//cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
	
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
	cap.setCapability("app", app.getAbsolutePath());
	 
	//cap.setCapability("appWaitActivity",".ApiDemos");
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	return driver;
	}

}
