package Tests.Payments;

import Tests.BaseTest;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utills.BaseElement;

import java.time.Duration;
@Feature("Payments")
public class SubscriptionTest extends BaseTest {
    @Test
    @DisplayName("Тест оплаты подписки Билайн")
    public void subTest(){
        step_1();
        step_2();
        step_3();
        step_4();
        step_5();
        step_6();
    }
    @Step("Переход к \"Payments\"")
    public void step_1(){
        homePage.payments.clickA();
    }
    @Step("Переход к \"Subscriptions\"")
    public void step_2(){
        payments.subscriptions.elementClk();
    }
    @Step("Скролим к \"Билайн: Оплата телефона\"")
    public void step_3(){
        subscriptionsPage.scroll.scrollTo();
    }
    @Step("Переход к \"Prepay subscription\n\"")
    public void step_4(){
        subscriptionsPage.bil.click();
    }
    @Step("Сохраняем данные")
    public void step_5(){
        subscriptionsPage.saveBtn.setBtnClick();
    }
    @Step("Подтверждаем оплату подписки")
    public void step_6(){
        WebDriverWait wait=new WebDriverWait(WebDriverRunner.getWebDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='confirmation-frame']")));
        subscriptionsPage.confirmBtn.setBtnClick();
    }
}