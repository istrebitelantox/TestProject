package utills;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class ElementsHelper {
    private final ElementsCollection first=$$(By.cssSelector("ul#dashboard-payment-type-menu a"));
    private final SelenideElement element;
    public ElementsHelper(String text){
        element=first.find(Condition.exactText(text));
    }
    public void elementClk(){
        element.click();
    }
}
