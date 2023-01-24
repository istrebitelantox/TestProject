package PageSteps;

import com.codeborne.selenide.SelenideElement;
import utills.A;
import utills.Button;
import utills.Input;

import static com.codeborne.selenide.Selenide.$x;

public class TransfersPage {
    public A cardToCard=new A("@id='show-from-card-to-card-payment-form'");
    public SelenideElement destinationButton=$x("//select[@name='data.toCardId']");
    public SelenideElement destinationOption=$x("//option[@value='10069']");
    public Input amount=new Input($x("//input[@name='data.amount']"));
    public Button forwardButton =new Button("forward");
    public Input condition=new Input($x("//input[@name='condition.generalConditions']"));
    public Button confirmButton = new Button("confirm");

}
