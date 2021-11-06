import chromDrive.chromeRun;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
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
    @Description("some descriptionssss")
    @Step("tep1 step2 step3")
    public static void checkdefaultValues(){

        Assert.assertEquals($("#Area").getValue(),"1");
        Assert.assertEquals($("#Perimeter").getValue(),"0");
        Assert.assertEquals($("#Angle").getValue(),"4");
        Assert.assertEquals($("#Lamp").getValue(),"0");
        Assert.assertEquals($("#Chandelier1").getValue(),"0");
        Assert.assertEquals($("#Chandelier2").getValue(),"0");
        Assert.assertEquals($("#Oval").getValue(),"0");
        Assert.assertEquals($("#Cant").getValue(),"0");
        Assert.assertEquals($("#Sum").getText(),"00:00");
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

    @Test
    public static void  NegativetestCalculator(){
        $("#Material").selectOption("რუსული");
        $("#Area").setValue("-10");
        $("#Perimeter").setValue("-10");
        $("#Angle").setValue("-10");
        $("#Lamp").setValue("-10");
        $("#Chandelier1").setValue("-10");
        $("#Chandelier2").setValue("-10");
        $("#Oval").setValue("-10");
        $("#Cant").setValue("-10");
        $("#Sum").click();
        Assert.assertEquals($("#Sum").getText(),"Incorrect Numbers");
    }

}
