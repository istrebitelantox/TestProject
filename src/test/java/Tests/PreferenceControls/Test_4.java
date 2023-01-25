package Tests.PreferenceControls;

import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
@Feature("PreferenceControls")
public class Test_4 extends BaseTest {
    @Test
    @DisplayName("Тестирование отправки нового сообщения")
    public void newMassageTest(){
        step_1();
        step_2();
        step_3();
        step_4("Hello, it's Yuri!");
        step_5();
        step_6();
    }
    @Step("Переход к \"Messages\"")
    public void step_1(){
        homePage.message.clickA();
    }
    @Step("Переход к \"New Message\"")
    public void step_2(){
        messagePage.newMessageBtn.clickA();
    }
    @Step("Выбор темы сообщения")
    public void step_3(){
        newMessagePage.theme.selectClick();
        newMessagePage.themeSelect.elementClk();
    }
    @Step("Ввод текста сообщения")
    public void step_4(String text){
        newMessagePage.content.setTextAreaValue(text);
    }
    @Step("Прикладываем изображение к сообщения")
    public void step_5(){
        newMessagePage.attachments.uploadFileInput(new File("src/main/resources/avatar.jpg"));
    }
    @Step("Отправляем получившееся сообщение")
    public void step_6(){
        newMessagePage.sendBtn.setBtnClick();
    }
}
