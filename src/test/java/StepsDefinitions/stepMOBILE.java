package StepsDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class stepMOBILE {

    static AppiumDriver<MobileElement> driver;
    private MobileElement Boton;

    @Before
    public void setupEnv() throws MalformedURLException {
        DesiredCapabilities capa = new DesiredCapabilities();
            capa.setCapability("deviceName", "SM-A305G");
            capa.setCapability("udid", "R58M72AMYWT");
            capa.setCapability("platformName", "Android");
            capa.setCapability("platformVersion", "10");
            capa.setCapability("appPackage", "com.ba.universalconverter");
            capa.setCapability("appActivity", "com.ba.universalconverter.MainConverterActivity");

        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, capa);
        System.out.println("Aplicacion inicada");
    }

    @Given("Como usuario puedo ingresar a la app")
    public void comoUsuarioPuedoIngresarALaApp() {
        Boton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Abrir el cajon de navegacion']"));
        Boton.click();
        System.out.println("Clic realizado");
    }

}
