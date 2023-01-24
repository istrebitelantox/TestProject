package utills;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Select {
    private final SelenideElement select;
    public Select(String select){
        this.select =$x("//select["+select+"]");
    }
    public void selectClick(){
        select.click();
    }
}
