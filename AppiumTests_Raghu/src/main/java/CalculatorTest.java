import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
	
	static AppiumDriver<MobileElement> driver;

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openCalculator();
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			e.printStackTrace();
		}
	}
public static void openCalculator() throws Exception {
	
	//DeviceDetails
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "sudheerdevice");
	cap.setCapability("udid", "ZY225DDGRR");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "9");
	//App details in mobile
	cap.setCapability("appPackage", "com.google.android.calculator");
	cap.setCapability("appActivity", "com.android.calculator2.calculator");
	
	URL url= new URL("http://127.0.0.1:4723/wd/hub");
	driver= new AppiumDriver<MobileElement>(cap);
	System.out.println("Application started");
	//ID will get from appium Inspector
	MobileElement one = driver.findElement(By.id(""));
	MobileElement two = driver.findElement(By.id(""));
	MobileElement three = driver.findElement(By.id(""));
	MobileElement four = driver.findElement(By.id(""));
}
}
