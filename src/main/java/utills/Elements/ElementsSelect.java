package utills.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class ElementsSelect {
    private final ElementsCollection first;
    private final SelenideElement element;
    public ElementsSelect(String selectText,String elementText){
        first=$$(By.cssSelector("select["+selectText+"] option"));
        element=first.find(Condition.exactText(elementText));
    }
    public void elementClk(){
        element.click();
    }
}
