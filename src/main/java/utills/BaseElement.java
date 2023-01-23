package utills;

import com.codeborne.selenide.SelenideElement;

public class BaseElement {
    protected SelenideElement container;

    public BaseElement(SelenideElement container) {
        this.container = container;
    }
}
