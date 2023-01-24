package PageSteps;

import utills.Button;
import utills.Elements.ElementsSelect;
import utills.Input;
import utills.Select;
import utills.TextArea;

import static com.codeborne.selenide.Selenide.$x;

public class NewMessagePage {
    public Select theme=new Select("@name='message.topicName'");
    public ElementsSelect themeSelect=new ElementsSelect("Question about my card");
    public TextArea content=new TextArea("[name='message.text']");
    public Input attachments=new Input($x("//input[@name='attachment']"));
    public Button sendBtn=new Button("send-button");
    public Button confirmBtn=new Button("confirm");
}
