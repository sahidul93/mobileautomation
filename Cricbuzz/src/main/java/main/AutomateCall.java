package main;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AutomateCall {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities ds = new DesiredCapabilities();
        ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        ds.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");

        ds.setCapability("appPackage", "com.google.android.dialer");
        ds.setCapability("appActivity", "com.google.android.dialer.DialtactsActivity");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,ds);
        Thread.sleep(5000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView\n")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text=Abm Vai Pnt]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text=+1 631-335-6832]")).click();

    }
}
