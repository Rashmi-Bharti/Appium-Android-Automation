package tutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Appium {
	
	public static void main(String[] arg) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     
		//most used: Xpath, id, className,androidUIautomator
		
		//class name will be used as tag name for xpath
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		
		driver.findElement(By.id("android:id/checkbox")).click();
		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("Rashmi");
		
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
	}

}
