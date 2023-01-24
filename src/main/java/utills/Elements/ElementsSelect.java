package utills.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class ElementsSelect {
    private final ElementsCollection first=$$(By.cssSelector("select[name='message.topicName'] option"));
    private final SelenideElement element;
    public ElementsSelect(String text){
        element=first.find(Condition.exactText(text));
    }
    public void elementClk(){
        element.click();
    }
}
