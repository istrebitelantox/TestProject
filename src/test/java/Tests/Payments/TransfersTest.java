package Tests.Payments;

import Tests.BaseTest;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
@Feature("Payments")
public class TransfersTest extends BaseTest {
    @DisplayName("Тестирование \"Card To Card\" transfer")
    @Test
    public void cardToCardTest(){
        step_1();
        step_2();
        step_3();
        step_4();
        step_5();
        step_6();
        step_7();
        step_8();
    }
    @Step("Переход к \"Payments\"")
    public void step_1(){
        homePage.payments.clickA();
    }
    @Step("Переход к \"Transfers\"")
    public void step_2(){
        payments.transfers.clickA();
    }
    @Step("Переход к \"Card to Card\"")
    public void step_3(){
        transfers.cardToCard.clickA();
    }
    @Step("Выбор карты, на которую будет совершён трансфер")
    public void step_4(){
        transfers.destinationButton.click();
        transfers.destinationOption.click();
    }
    @Step("Ввод ссумы трансфера")
    public void step_5(){
        transfers.amount.setInputValue("20000");
    }
    @Step("Переход к \"Payment\"")
    public void step_6(){
        transfers.forwardButton.setBtnClick();
    }
    @Step("Принимаем условия")
    public void step_7(){
        transfers.condition.setInputClick();
    }
    @Step("Подтверждаем трансфер")
    public void step_8(){
        WebDriverWait wait=new WebDriverWait(WebDriverRunner.getWebDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='confirmation-frame']")));
        transfers.confirmButton.setBtnClick();
    }
}
