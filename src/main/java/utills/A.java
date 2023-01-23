package utills;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class A {
    private final SelenideElement a;
    public A(String aID){
        a=$x("//a["+aID+"]");
    }
    public void setA(String value){
        a.setValue(value);
    }
    public void clickA(){
        a.click();
    }
    public String getA(){
        return a.getText();
    }

}
