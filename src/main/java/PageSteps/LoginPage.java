package PageSteps;

import utills.Button;
import utills.Input;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    public String baseUrl = "https://idemo.bspb.ru/";
    public Input loginInput = new Input($x("//input[@name='username']"));
    public Input passwordInput = new Input($x("//input[@name='password']"));
    public Button loginBtn = new Button("login-button");
    public Input codeInput = new Input($x("//input[@id='otp-code']"));
    public Button codeBtn = new Button("login-otp-button");
    
}
