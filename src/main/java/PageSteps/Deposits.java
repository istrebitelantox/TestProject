package PageSteps;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utills.A;
import utills.Button;
import utills.Input;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Deposits {
    public final SelenideElement opDeposUrl=$(By.cssSelector("table#table-deposit-rates tr a"));
    public final A showRatesBtn =new A("@id='btn-show-rates'");
    public final Input sumInput =new Input($x("//input[@id='amount']"));
    public final SelenideElement check=$(By.xpath("//span[@id='estimated-interest']"));
    public final Button submitBtn =new Button("submit-button");
    public final Input newDeposCondCeckBtn=new Input($x("//input[@name='condition.newDepositConditions']"));
    public final Input instantDeposCondCheckBtn=new Input($x("//input[@name='condition.instantDepositAgreement']"));
    public final A acceptInstantDepositAgreementBtn =new A("@id='accept-instant-deposit-agreement-button'");
    public final Button confirmBtn =new Button("confirm");
    public final SelenideElement body =$(By.xpath("//td[.='Способ обмена информацией между банком и вкладчиком']"));
}