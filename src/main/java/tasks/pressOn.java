package tasks;

import interfaces.homeConverter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class pressOn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(homeConverter.btn_menu, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(homeConverter.btn_menu));
    }

    public static pressOn elemet() { return instrumented(pressOn.class); }
}
