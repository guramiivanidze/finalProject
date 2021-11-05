import chromDrive.chromeRun;
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;

public class testingContacUsPage extends chromeRun {
    @Test
    public static void first_test(){
        $(byAttribute("href","?page=contact")).click();
        $(byAttribute("name","field1")).setValue("gurami");
        sleep(1000);
    }
}
