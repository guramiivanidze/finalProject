import chromDrive.chromeRun;
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import java.util.List;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.sleep;
public class testMainPage extends chromeRun {
    @Test
    public static void  positivtestCalculator(){
        $("#Material").selectOption("რუსული");
        sleep(5000);
    }

}
