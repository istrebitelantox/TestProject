package Tests.Deposits;

import Tests.BaseTest;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@Feature("Deposits")
public class CreateNewDepositTest extends BaseTest {
    @DisplayName("Тестирование создания нового депозита")
    @Test
    public void createNewDepositTest(){
        step_1();
        step_2();
        step_3();
        step_4();
        step_5();
        step_6();
    }
    @Step("Открываем страницу \"Deposits\"")
    public void step_1() {
        homePage.deposits.clickA();
    }
    @Step("Открываем \"New Deposit\"")
    public void step_2() {
        deposit.btnShowRates.clickA();
    }
    @Step("Открываем форму \"Deposits\"")
    public void step_3() {
        deposit.opDeposUrl.click();
    }
    @Step("Заполняем форму \"Deposits\"")
    public void step_4() {
        deposit.sumInput.setInputValue("100000");
        deposit.check.should(Condition.exactText("13 222.05 ₽"));
        deposit.submitBtn.setBtnClick();
    }
    @Step("Принимаем все соглашения")
    public void step_5() {
        deposit.newDeposCondCeckBtn.setInputClick();
        deposit.instantDeposCondCheckBtn.setInputClick();
        deposit.body.scrollIntoView(true);
        deposit.acceptInstantDepositAgreementButton.clickA();
    }
    @Step("Создаём новый депозит")
    public void step_6() {
        deposit.confirm.setBtnClick();
    }
}
