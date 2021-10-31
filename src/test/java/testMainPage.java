import chromDrive.chromeRun;
import org.testng.Assert;
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
    public static void checkdefaultValues(){

        Assert.assertEquals($("#Area").getValue(),"1");
        Assert.assertEquals($("#Perimeter").getValue(),"0");
        Assert.assertEquals($("#Angle").getValue(),"4");
    }
    @Test
    public static void  positivtestCalculator(){
        $("#Material").selectOption("რუსული");
        $("#Area").setValue("10");
        $("#Perimeter").setValue("10");
        $("#Angle").setValue("10");
        $("#Lamp").setValue("10");
        $("#Chandelier1").setValue("10");
        $("#Chandelier2").setValue("10");
        $("#Oval").setValue("10");
        $("#Cant").setValue("10");
        $("#Sum").click();
        Assert.assertEquals($("#Sum").getText(),"1087");
    }

}
