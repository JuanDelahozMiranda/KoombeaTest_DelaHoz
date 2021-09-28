package interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class homeConverter {
    public final static Target btn_menu = Target.the("Boton Menu aplicativo")
            .located(By.xpath("//android.widget.ImageButton[@content-desc='Abrir el cajon de navegacion']"));
}
