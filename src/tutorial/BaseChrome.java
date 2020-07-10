package tutorial;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseChrome {
	
	public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
		AndroidDriver<AndroidElement>  driver;

		// TODO Auto-generated method stub
		/* File appDir = new File("src");
		     File app = new File(appDir, "ApiDemos-debug.apk");*/
		     DesiredCapabilities capabilities = new DesiredCapabilities();
		    
		     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		     
		     capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		     capabilities.setCapability("chromedriverExecutable", "D://chromedriver.exe");
		    
		  //   capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		    driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		   
		   return driver;
		}

		}