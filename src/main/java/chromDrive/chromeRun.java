package chromDrive;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class chromeRun {
    @BeforeTest
    public static void start(){
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        Selenide.open("http://webdriveruniversity.com/index.html");

    }
    @AfterTest
    public static void finish(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}
