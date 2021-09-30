package tasks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.util.concurrent.TimeUnit;

public class waitSeconds {

    public void waitTimeOf(AppiumDriver<MobileElement> driver, int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

}
