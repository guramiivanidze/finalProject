package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class chromeRun {
    int NegativeNumber = -10;
    int PositiveNumber = 10;
    String emptyString = "";
    String NameString = "Tname";
    String gibberish = "Lorem Ipsum";
    @BeforeTest (description = "set driver / max windows / open webpage")
    public static void start(){
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        Selenide.open("http://cheri.ge/");

    }
    @AfterTest (description = "clear browsercookies")
    public static void finish(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}
