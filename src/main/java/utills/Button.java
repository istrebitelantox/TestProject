package utills;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Button {
    private SelenideElement button;
    public Button(String buttonID){
        button=$x("//button[@id='"+buttonID+"']");
        // $(By.cssSelector("button#"+buttonID));
    }
    public void setBtnClick(){
        button.click();
    }
}
