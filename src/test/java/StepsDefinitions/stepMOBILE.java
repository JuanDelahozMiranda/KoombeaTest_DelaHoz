package StepsDefinitions;

import interfaces.homeConverter;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import tasks.waitSeconds;
import utils.BuildApp;

import java.net.MalformedURLException;

import static org.assertj.core.api.Assertions.assertThat;


public class stepMOBILE {

    static AppiumDriver<MobileElement> driver;
    private homeConverter pageH = new homeConverter();
    private waitSeconds interaction = new waitSeconds();

    @Given("puedo ingresar a la app")
    public void puedoIngresarALaApp() throws MalformedURLException{
        BuildApp builder = new BuildApp();
        driver = builder.setUpAppium();
        System.out.println("Aplicacion inicada");
    }

    @When("busco la opcion Longitud en el menu")
    public void buscoLaOpcionLongitudEnElMenu() {
        pageH.clicMenu(driver);
        interaction.waitTimeOf(driver, 3);
        pageH.pressLongitudOption(driver);
    }

    @Then("Presiono el valor a convertir")
    public void presionoElValorAConvertir() {
        pageH.pressNumber1(driver);
        pageH.pressNumber2(driver);
        pageH.pressNumber0(driver);
    }

    @Then("Observo que el valor ingresado es {string} y el obtenido es {string}")
    public void observoQueElValorIngresadoEsYElObtenidoEs(String InData, String OutData) {
        assertThat(pageH.getTextLabelInput(driver)).isEqualTo(InData);
        System.out.println("Get -> "+pageH.getTextLabelInput(driver)+", and spec: "+InData);

        assertThat(pageH.getTextLabelOutput(driver)).isEqualTo(OutData);
        System.out.println("Get -> "+pageH.getTextLabelOutput(driver)+", and spec: "+OutData);
    }

    @When("busco la opcion {string} en la opcion de buscar")
    public void buscoLaOpcionEnLaOpcionDeBuscar(String Param) {
        pageH.pressSearchOption(driver, Param);
    }

    @Then("priono muchos elementos")
    public void prionoMuchosElementos() {
        pageH.pressNumber1(driver);
        pageH.pressNumber2(driver);
        pageH.pressNumber3(driver);
        pageH.pressNumber4(driver);
        pageH.pressNumber5(driver);
        pageH.pressNumber6(driver);
        pageH.pressDot(driver);
        pageH.pressNumber7(driver);
        pageH.pressNumber8(driver);
        pageH.pressNumber9(driver);
        pageH.pressNumber0(driver);
        pageH.pressEraser(driver);
        pageH.pressInverter(driver);

        pageH.pressAbsButton(driver);
        pageH.pressC(driver);

        pageH.clicMenu(driver);
        interaction.waitTimeOf(driver, 5);
        pageH.pressCloseMenu(driver);
    }

}
