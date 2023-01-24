package Interfaces;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public interface IOtherPage {
    public default void openOtherPageInPage(String text){
        WebDriverWait wait=new WebDriverWait(WebDriverRunner.getWebDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='"+text+"']")));
    }
}
