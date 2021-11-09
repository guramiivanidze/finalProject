package stepobject;
import com.codeborne.selenide.Condition;
import pageobject.mainpageobject;
import static dataobject.calculatordata.*;

public class Calculatestepobject extends mainpageobject {


    public Calculatestepobject EnterMaterial(String Materialparam){
        Materialelement.selectOption(Materialparam);
        return this;
    }

    public Calculatestepobject EnterArea(String areaparam){
        areaelement.setValue(areaparam);
        areaelement.shouldNotBe(Condition.empty);
        return this;
    }

    public Calculatestepobject EnterPerimeter(String PerimeterParam){
        perimeterelement.setValue(PerimeterParam);
        perimeterelement.shouldNotBe(Condition.empty);
        return this;
    }

    public Calculatestepobject EnterAngel(String AngleParam){
        Angleelement.setValue(AngleParam);
        Angleelement.shouldNotBe(Condition.empty);
        return this;
    }

    public Calculatestepobject EnterLamp(String LampParam){
        Lampelement.setValue(LampParam);
        Lampelement.shouldNotBe(Condition.empty);
        return this;
    }

    public Calculatestepobject EnterChandelier1(String Chandelier1Param){
        Chandelier1element.setValue(Chandelier1Param);
        Chandelier1element.shouldNotBe(Condition.empty);
        return this;
    }

    public Calculatestepobject EnterChandelier2(String Chandelier2Param){
        Chandelier2element.setValue(Chandelier2Param);
        Chandelier2element.shouldNotBe(Condition.empty);
        return this;
    }

    public Calculatestepobject EnterOval(String OvalParam){
        Ovalelement.setValue(OvalParam);
        Ovalelement.shouldNotBe(Condition.empty);
        return this;
    }

    public Calculatestepobject EnterCant(String CantParam){
        Cantelement.setValue(CantParam);
        Cantelement.shouldNotBe(Condition.empty);
        return this;
    }

    public Calculatestepobject ClickSum(){
        Sumelement.click();
        return this;
    }
}
