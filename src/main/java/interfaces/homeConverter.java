package interfaces;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class homeConverter {

    public void clicMenu(AppiumDriver<MobileElement> driver){
        MobileElement BotonMenu = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Abrir el cajon de navegacion']"));
            BotonMenu.click();
    }

    public void pressCloseMenu(AppiumDriver<MobileElement> driver){
        MobileElement BotonCerrar = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Cierre el cajon de navegacion']"));
            BotonCerrar.click();
    }

    public void pressNumber1(AppiumDriver<MobileElement> driver){
        MobileElement Boton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]"));
            Boton_1.click();
    }

    public void pressNumber2(AppiumDriver<MobileElement> driver){
        MobileElement Boton_2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]"));
            Boton_2.click();
    }

    public void pressNumber3(AppiumDriver<MobileElement> driver){
        MobileElement Boton_3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]"));
            Boton_3.click();
    }

    public void pressNumber4(AppiumDriver<MobileElement> driver){
        MobileElement Boton_4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]"));
            Boton_4.click();
    }

    public void pressNumber5(AppiumDriver<MobileElement> driver){

        MobileElement Boton_5 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]"));
            Boton_5.click();
    }

    public void pressNumber6(AppiumDriver<MobileElement> driver){
        MobileElement Boton_6 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[3]"));
            Boton_6.click();
    }

    public void pressNumber7(AppiumDriver<MobileElement> driver){
        MobileElement Boton_7 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button[1]"));
            Boton_7.click();
    }

    public void pressNumber8(AppiumDriver<MobileElement> driver){
        MobileElement Boton_8 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button[2]"));
            Boton_8.click();
    }

    public void pressNumber9(AppiumDriver<MobileElement> driver){
        MobileElement Boton_9 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button[3]"));
            Boton_9.click();
    }

    public void pressNumber0(AppiumDriver<MobileElement> driver){
        MobileElement Boton_0 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.Button[1]"));
            Boton_0.click();
    }

    public void pressDot(AppiumDriver<MobileElement> driver){
        MobileElement Boton_Punto = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.Button[2]"));
            Boton_Punto.click();
    }

    public void pressC(AppiumDriver<MobileElement> driver){
        MobileElement Boton_C = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.Button[3]"));
            Boton_C.click();
    }

    public void pressEraser(AppiumDriver<MobileElement> driver){
        MobileElement BotonBorrar = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Eliminar']"));
            BotonBorrar.click();
    }

    public void pressInverter(AppiumDriver<MobileElement> driver){
        MobileElement BotonInvertir = driver.findElement(By.xpath("(//android.widget.ImageButton[@content-desc='Cambiar las unidades'])[2]"));
            BotonInvertir.click();
    }

    public String getTextLabelInput(AppiumDriver<MobileElement> driver){
        MobileElement TextView_Input = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView"));
            return TextView_Input.getText();
    }

    public String getTextLabelOutput(AppiumDriver<MobileElement> driver){
        MobileElement TextView_Output  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.TextView[1]"));
            return TextView_Output.getText();
    }

    public String getTextMesure(AppiumDriver<MobileElement> driver) {
        MobileElement TextView_Mesure  = driver.findElement(By.xpath("/ hierarchy / android.widget.FrameLayout / android.widget.LinearLayout / android.widget.FrameLayout / android.view.ViewGroup / android.widget.FrameLayout[2] / android.support.v4.widget.DrawerLayout / android.widget.FrameLayout / android.widget.RelativeLayout / android.widget.RelativeLayout / android.widget.LinearLayout / android.widget.RelativeLayout[4] / android.widget.TextView[2]"));
            return  TextView_Mesure.getText();

    }
   public void pressAbsButton(AppiumDriver<MobileElement> driver){
        MobileElement Boton_Abs = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[4]"));
            Boton_Abs.click();
    }

    public void pressSearchOption(AppiumDriver<MobileElement> driver, String Parametro){
        MobileElement Lupa = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Spinner[2]/android.widget.RelativeLayout/android.widget.TextView"));
            Lupa.click();
            driver.getKeyboard().sendKeys(Parametro+"\n");
    }

    public void pressRightMenu(AppiumDriver<MobileElement> driver){
        MobileElement Menu_Lateral = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc='Spinner'])[2]"));
            Menu_Lateral.click();
    }

    public void pressLongitudOption(AppiumDriver<MobileElement> driver){
        MobileElement OpLongitud = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.ListView/android.widget.RelativeLayout[5]"));
            OpLongitud.click();
    }

}
