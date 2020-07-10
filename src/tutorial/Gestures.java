package tutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;


import static io.appium.java_client.touch.offset.ElementOption.element;

public class Gestures extends Appium {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		
		//Tap
		TouchAction t= new TouchAction(driver);
		//Thread.sleep(2000);
		WebElement ExpandList=driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
		t.tap(tapOptions().withElement(element(ExpandList))).perform();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		
		WebElement lp=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		t.longPress(longPressOptions().withElement(element(lp)).withDuration(ofSeconds(2))).release().perform();
		
		//Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("android:id/content")).isDisplayed());
	}

}
