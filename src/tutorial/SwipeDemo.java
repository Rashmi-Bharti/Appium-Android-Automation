package tutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;

public class SwipeDemo extends Appium{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
		
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		TouchAction t= new TouchAction(driver);
		//long press for atleast 1 or 2 seconds// move to another element then we release
		
		WebElement src=driver.findElementByXPath("//*[@content-desc='15']");
		WebElement dest=driver.findElementByXPath("//*[@content-desc='45']");
		t.longPress(longPressOptions().withElement(element(src)).withDuration(ofSeconds(2))).moveTo(element(dest))
		.release().perform();
		
		
		
		
		
		

	}

}
