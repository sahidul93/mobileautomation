package main;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities ds = new DesiredCapabilities();
        ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        ds.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");

        ds.setCapability("appPackage", "com.android.calculator2");
        ds.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,ds);
        Thread.sleep(5000);


        WebElement five = driver.findElementById("com.android.calculator2:id/digit_5");
        five.click();
        driver.findElementById("com.android.calculator2:id/op_add").click();
        driver.findElementById("com.android.calculator2:id/digit_7").click();


    }
}