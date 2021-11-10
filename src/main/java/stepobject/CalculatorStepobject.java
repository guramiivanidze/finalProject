package stepobject;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pageobject.CalculatorMainPageObject;

public class CalculatorStepobject extends CalculatorMainPageObject {

    @Step
    public CalculatorStepobject EnterMaterial(String Materialparam){
        Materialelement.selectOption(Materialparam);
        return this;
    }
    @Step
    public CalculatorStepobject EnterArea(String areaparam){
        areaelement.setValue(areaparam);
        areaelement.shouldNotBe(Condition.empty);
        return this;
    }
    @Step
    public CalculatorStepobject EnterPerimeter(String PerimeterParam){
        perimeterelement.setValue(PerimeterParam);
        perimeterelement.shouldNotBe(Condition.empty);
        return this;
    }
    @Step
    public CalculatorStepobject EnterAngel(String AngleParam){
        Angleelement.setValue(AngleParam);
        Angleelement.shouldNotBe(Condition.empty);
        return this;
    }
    @Step
    public CalculatorStepobject EnterLamp(String LampParam){
        Lampelement.setValue(LampParam);
        Lampelement.shouldNotBe(Condition.empty);
        return this;
    }
    @Step
    public CalculatorStepobject EnterChandelier1(String Chandelier1Param){
        Chandelier1element.setValue(Chandelier1Param);
        Chandelier1element.shouldNotBe(Condition.empty);
        return this;
    }
    @Step
    public CalculatorStepobject EnterChandelier2(String Chandelier2Param){
        Chandelier2element.setValue(Chandelier2Param);
        Chandelier2element.shouldNotBe(Condition.empty);
        return this;
    }
    @Step
    public CalculatorStepobject EnterOval(String OvalParam){
        Ovalelement.setValue(OvalParam);
        Ovalelement.shouldNotBe(Condition.empty);
        return this;
    }
    @Step
    public CalculatorStepobject EnterCant(String CantParam){
        Cantelement.setValue(CantParam);
        Cantelement.shouldNotBe(Condition.empty);
        return this;
    }
    @Step
    public CalculatorStepobject ClickSum(){
        Sumelement.click();
        return this;
    }
}
