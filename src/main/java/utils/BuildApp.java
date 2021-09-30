package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class BuildApp {

    public AppiumDriver<MobileElement> setUpAppium() throws MalformedURLException {
        DesiredCapabilities capa = new DesiredCapabilities();
            capa.setCapability("deviceName", "SM-A305G");
            capa.setCapability("udid", "R58M72AMYWT");
            capa.setCapability("platformName", "Android");
            capa.setCapability("platformVersion", "10");
            capa.setCapability("appPackage", "com.ba.universalconverter");
            capa.setCapability("appActivity", "com.ba.universalconverter.MainConverterActivity");

        URL url = new URL("http://localhost:4723/wd/hub");
        return new AppiumDriver<MobileElement>(url, capa);
    }
}
