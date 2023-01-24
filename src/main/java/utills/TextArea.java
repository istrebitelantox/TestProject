package utills;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TextArea {
    private final SelenideElement textArea;
    public TextArea(String textArea){
        this.textArea=$(By.cssSelector("textarea"+textArea));
    }
    public void setTextAreaValue(String value){
        textArea.setValue(value);
    }
}
