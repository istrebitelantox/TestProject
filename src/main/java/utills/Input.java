package utills;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.io.File;

public class Input extends BaseElement {

    public Input(SelenideElement container) {
        super(container);
    }

    public void setInputValue(String value) {
        container.setValue(value);
    }

    public String getInputValue() {
        return container.getValue();
    }

    public void setInputClick() {
        container.click();
    }

    public void uploadFileInput(File file) {
        container.uploadFile(file);
    }

    public void sendKeysCtrlAndLeft() {
        container.sendKeys(Keys.CONTROL, Keys.ARROW_LEFT);
    }

    public void sendKeyEnt() {
        container.sendKeys(Keys.ENTER);

    }
}