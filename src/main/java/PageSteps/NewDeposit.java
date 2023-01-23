package PageSteps;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewDeposit {
    public final SelenideElement opDeposUrl=$(By.cssSelector("table#table-deposit-rates tr a"));
}
