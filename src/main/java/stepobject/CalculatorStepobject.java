package stepobject;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pageobject.CalculatorMainPageObject;

public class CalculatorStepobject extends CalculatorMainPageObject {

    @Step("enter material value {0}")
    public CalculatorStepobject EnterMaterial(String Materialparam){
        Materialelement.selectOption(Materialparam);
        return this;
    }

    @Step("enter area value {0}")
    public CalculatorStepobject EnterArea(String areaparam){
        areaelement.setValue(areaparam);
        areaelement.shouldNotBe(Condition.empty);
        return this;
    }

    @Step(" enter perimeter  value {0}")
    public CalculatorStepobject EnterPerimeter(String PerimeterParam){
        perimeterelement.setValue(PerimeterParam);
        perimeterelement.shouldNotBe(Condition.empty);
        return this;
    }

    @Step ("enter angle Value {0}")
    public CalculatorStepobject EnterAngel(String AngleParam){
        Angleelement.setValue(AngleParam);
        Angleelement.shouldNotBe(Condition.empty);
        return this;
    }

    @Step ("enter lamp valuer {0}")
    public CalculatorStepobject EnterLamp(String LampParam){
        Lampelement.setValue(LampParam);
        Lampelement.shouldNotBe(Condition.empty);
        return this;
    }

    @Step ("enter Chandelier1 value {0}")
    public CalculatorStepobject EnterChandelier1(String Chandelier1Param){
        Chandelier1element.setValue(Chandelier1Param);
        Chandelier1element.shouldNotBe(Condition.empty);
        return this;
    }

    @Step ("enter Chandelier2 value {0}")
    public CalculatorStepobject EnterChandelier2(String Chandelier2Param){
        Chandelier2element.setValue(Chandelier2Param);
        Chandelier2element.shouldNotBe(Condition.empty);
        return this;
    }

    @Step ("enter oval value {0}")
    public CalculatorStepobject EnterOval(String OvalParam){
        Ovalelement.setValue(OvalParam);
        Ovalelement.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("enter cant value {0}")
    public CalculatorStepobject EnterCant(String CantParam){
        Cantelement.setValue(CantParam);
        Cantelement.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("enter click")
    public CalculatorStepobject ClickSum(){
        Sumelement.click();
        return this;
    }
}
