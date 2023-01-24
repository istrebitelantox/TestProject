package utills.WebDriverNew;

import com.codeborne.selenide.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.annotation.Nonnull;
import java.time.Duration;

import static org.openqa.selenium.remote.CapabilityType.PAGE_LOAD_STRATEGY;

public class LocalWebDriver implements WebDriverProvider {
    @Nonnull
    @Override
    public org.openqa.selenium.WebDriver createDriver(@Nonnull Capabilities capabilities) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-logging");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-translate");
        options.addArguments("--disable-plugins");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-web-security");
        options.addArguments("--enable-automation");
        options.addArguments("--no-default-browser-check");
        options.addArguments("--no-sandbox");
        options.addArguments("--no-first-run");
        options.addArguments("--silent");
        options.addArguments("--start-maximized");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--disable-gpu");
        options.addArguments("--headless");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-setuid-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--proxy-server='direct://'");
        options.addArguments("--proxy-bypass-list=*");

        /*                .addArguments("--no-sandbox")
                .addArguments("--disable-gpu");
                .addArguments("--headless");*/
        options.setCapability(PAGE_LOAD_STRATEGY, "eager");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(420));
        return driver;
    }
}
