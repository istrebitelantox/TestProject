package PageSteps;

import utills.A;
import utills.Button;
import utills.Elements.ElementsSelect;
import utills.Input;
import utills.Select;

import static com.codeborne.selenide.Selenide.$x;

public class TransfersPage {
    public A cardToCard=new A("@id='show-from-card-to-card-payment-form'");
    public Select destinationButton=new Select("@name='data.toCardId'");
//    public SelenideElement destinationOption=$x("//option[@value='10069']");
    public ElementsSelect destinationOption=new ElementsSelect("name='data.toCardId'",
        "4797 72** **** 2225 - Travel: 115 164.00 ₽");
    public Input amount=new Input($x("//input[@name='data.amount']"));
    public Button forwardButton =new Button("forward");
    public Input condition=new Input($x("//input[@name='condition.generalConditions']"));
    public Button confirmButton = new Button("confirm");

}
