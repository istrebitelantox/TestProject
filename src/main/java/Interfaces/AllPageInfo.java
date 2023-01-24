package Interfaces;

import PageSteps.*;

public interface AllPageInfo {
    Deposits deposit=new Deposits();
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    Payments payments =new Payments();
    TransfersPage transfers=new TransfersPage();
    SubscriptionsPage subscriptionsPage=new SubscriptionsPage();
    MessagePage messagePage=new MessagePage();
    NewMessagePage newMessagePage=new NewMessagePage();
}