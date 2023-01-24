package utills;

import com.codeborne.selenide.SelenideElement;

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
