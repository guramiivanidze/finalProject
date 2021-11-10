import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobject.CalculatorMainPageObject;
import stepobject.CalculatorStepobject;
import utils.Retry;
import utils.chromeRun;

import static com.codeborne.selenide.Selenide.$;
import static dataobject.CalculatorData.*;

@Listeners(utils.testLister.class)

public class MainPageTest extends chromeRun {

    @Test (retryAnalyzer = Retry.class , priority = 1)
    @Description(" check default Values ")
    @Link ("https://github.com/gurglosa/finalProject")
    @Severity(SeverityLevel.BLOCKER)
    public static void checkdefaultValues(){
        CalculatorStepobject steps= new CalculatorStepobject();
        CalculatorMainPageObject object = new CalculatorMainPageObject();

        Assert.assertEquals(object.areaelement.getValue(),"1");
        Assert.assertEquals(object.perimeterelement.getValue(),"0");
        Assert.assertEquals(object.Angleelement.getValue(),"4");
        Assert.assertEquals(object.Lampelement.getValue(),"0");
        Assert.assertEquals(object.Chandelier1element.getValue(),"0");
        Assert.assertEquals(object.Chandelier2element.getValue(),"0");
        Assert.assertEquals(object.Ovalelement.getValue(),"0");
        Assert.assertEquals(object.Cantelement.getValue(),"0");
        Assert.assertEquals(object.Sumelement.getText(),"00:00");
    }
    @Test (description = "enter all and right data", priority = 2)
    @Description("this is positive test case")
    @Link ("https://github.com/gurglosa/finalProject")
    public static void  positivtestCalculator(){
        CalculatorStepobject steps= new CalculatorStepobject();
        CalculatorMainPageObject object = new CalculatorMainPageObject();

        steps
                .EnterMaterial(Materialdata)
                .EnterArea(Areadata)
                .EnterPerimeter(Perimeterdata)
                .EnterAngel(Angledata)
                .EnterLamp(Lampdata)
                .EnterChandelier1(Chandelier1data)
                .EnterChandelier2(Chandelier2data)
                .EnterOval(Ovaldata)
                .EnterCant(Cantdata)
                .ClickSum();

        Assert.assertEquals(object.Sumelement.getText(),SumIntdata2);
    }

    @Test (description = "enter all and wrong data", priority = 3)
    @Description("this is Negativet test case")
    @Link ("https://github.com/gurglosa/finalProject")
    public static void  NegativetestCalculator(){
        CalculatorStepobject steps= new CalculatorStepobject();
        CalculatorMainPageObject object = new CalculatorMainPageObject();

        steps
                .EnterMaterial(Material2data)
                .EnterArea(AreadataNegative)
                .EnterPerimeter(PerimeterdataNegative)
                .EnterAngel(AngledataNegative)
                .EnterLamp(LampdataNegative)
                .EnterChandelier1(Chandelier1dataNegative)
                .EnterChandelier2(Chandelier2dataNegative)
                .EnterOval(OvaldataNegative)
                .EnterCant(CantdataNegative)
                .ClickSum();

        Assert.assertEquals(object.Sumelement.getText(),sumstringdata);
    }

}
