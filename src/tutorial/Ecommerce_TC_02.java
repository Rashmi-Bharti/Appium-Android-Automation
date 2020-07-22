package tutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;

public class Ecommerce_TC_02 extends Appium{
	
	//1. Fill the form details and verify Toast error message displayed approprietly for the wrong inputs
	//2. validate if the item selected in the page 2 are matching with items displayed in check out page

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver=Capabilities();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Heloooo");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		
		driver.findElement(By.id("android:id/text1")).click();
		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));  

	    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
        System.out.println(toastMessage);

		Assert.assertEquals("Please enter your name", toastMessage);//Actual validation
        
        
		//name attribute for toast messages will have content

}
}


