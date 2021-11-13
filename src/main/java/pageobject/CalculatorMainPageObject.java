package pageobject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class CalculatorMainPageObject {

    public SelenideElement areaelement = $("#Area");
    public SelenideElement Materialelement =  $("#Material");
    public SelenideElement perimeterelement = $("#Perimeter");
    public SelenideElement Angleelement = $("#Angle");
    public SelenideElement Lampelement = $("#Lamp");
    public SelenideElement Chandelier1element = $("#Chandelier1");
    public SelenideElement Chandelier2element = $("#Chandelier2");
    public SelenideElement Ovalelement = $("#Oval");
    public SelenideElement Cantelement = $("#Cant");
    public SelenideElement Sumelement = $("#Sum");

    public SelenideElement[] Allelementg = {
            areaelement,
            //Materialelement,
            perimeterelement,
            Angleelement,
            Lampelement,
            Chandelier1element,
            Chandelier2element,
            Ovalelement,
            Cantelement,
            Sumelement,
    };
}
