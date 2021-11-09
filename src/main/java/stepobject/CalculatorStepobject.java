package stepobject;
import com.codeborne.selenide.Condition;
import pageobject.CalculatorMainPageObject;

public class CalculatorStepobject extends CalculatorMainPageObject {


    public CalculatorStepobject EnterMaterial(String Materialparam){
        Materialelement.selectOption(Materialparam);
        return this;
    }

    public CalculatorStepobject EnterArea(String areaparam){
        areaelement.setValue(areaparam);
        areaelement.shouldNotBe(Condition.empty);
        return this;
    }

    public CalculatorStepobject EnterPerimeter(String PerimeterParam){
        perimeterelement.setValue(PerimeterParam);
        perimeterelement.shouldNotBe(Condition.empty);
        return this;
    }

    public CalculatorStepobject EnterAngel(String AngleParam){
        Angleelement.setValue(AngleParam);
        Angleelement.shouldNotBe(Condition.empty);
        return this;
    }

    public CalculatorStepobject EnterLamp(String LampParam){
        Lampelement.setValue(LampParam);
        Lampelement.shouldNotBe(Condition.empty);
        return this;
    }

    public CalculatorStepobject EnterChandelier1(String Chandelier1Param){
        Chandelier1element.setValue(Chandelier1Param);
        Chandelier1element.shouldNotBe(Condition.empty);
        return this;
    }

    public CalculatorStepobject EnterChandelier2(String Chandelier2Param){
        Chandelier2element.setValue(Chandelier2Param);
        Chandelier2element.shouldNotBe(Condition.empty);
        return this;
    }

    public CalculatorStepobject EnterOval(String OvalParam){
        Ovalelement.setValue(OvalParam);
        Ovalelement.shouldNotBe(Condition.empty);
        return this;
    }

    public CalculatorStepobject EnterCant(String CantParam){
        Cantelement.setValue(CantParam);
        Cantelement.shouldNotBe(Condition.empty);
        return this;
    }

    public CalculatorStepobject ClickSum(){
        Sumelement.click();
        return this;
    }
}
