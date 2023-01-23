package Tests;

import Interfaces.AllPageInfo;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;
import utills.WebDriverNew.LocalWebDriver;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest implements AllPageInfo {

    @BeforeAll
    static void beforeConfig() {
        Configuration.browser = LocalWebDriver.class.getName();
        open(loginPage.baseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        before();
    }
    @Step
    public static void before() {
        loginPage.loginInput.setInputValue("demo");
        loginPage.passwordInput.setInputValue("demo");
        loginPage.loginBtn.setBtnClick();

        loginPage.codeInput.setInputValue("0000");
        loginPage.codeBtn.setBtnClick();
    }
}