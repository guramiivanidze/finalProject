import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.mainpageobject;
import stepobject.Calculatestepobject;
import utils.chromeRun;

import static com.codeborne.selenide.Selenide.$;
import static dataobject.calculatordata.*;


public class MainPageTest extends chromeRun {

    @Test (priority = 1)
    public static void checkdefaultValues(){
        mainpageobject object = new mainpageobject();

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
    @Test (priority = 2)
    public static void  positivtestCalculator(){
        Calculatestepobject steps= new Calculatestepobject();
        mainpageobject object = new mainpageobject();

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

    @Test (priority = 3)
    public static void  NegativetestCalculator(){
        Calculatestepobject steps= new Calculatestepobject();
        mainpageobject object = new mainpageobject();

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
