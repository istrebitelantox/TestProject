package PageSteps;

import com.codeborne.selenide.SelenideElement;
import utills.Button;
import utills.Input;

import static com.codeborne.selenide.Selenide.$x;

public class SubscriptionsPage {
    public SelenideElement scroll=$x("//div[@id='body']");
    public SelenideElement bil=$x("//div[.='Билайн: Оплата телефона']");
    public Button saveBtn=new Button("submit");
    public Input prepAmountInput =new Input($x("//input[@name='subscription.topupAmount']"));
    public Button confirmBtn=new Button("confirm");
}
