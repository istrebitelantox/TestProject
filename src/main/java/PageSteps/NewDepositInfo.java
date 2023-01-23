package PageSteps;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utills.Button;
import utills.Input;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NewDepositInfo {

    public final Input sumInput =new Input($x("input[@id='amount']"));
    public final SelenideElement check=$(By.xpath("//span[@id='estimated-interest']"));
    public final Button submitBtn =new Button("submit-button");
}
