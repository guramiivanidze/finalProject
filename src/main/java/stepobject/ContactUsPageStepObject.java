package stepobject;

import com.codeborne.selenide.Condition;
import pageobject.ContacUsPageObject;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ContactUsPageStepObject extends ContacUsPageObject {

    public  ContactUsPageStepObject goToContactPage(){
        contacMenuelement.click();
        pageTitleelement.shouldBe(Condition.visible);
        return this;

    }
    public ContactUsPageStepObject justClickSubmitBtn(){
        submitBtnelement.click();
        return this;
    }

    public ContactUsPageStepObject enterFullName(String nameParam){
        fullNameElement.setValue(nameParam);
        fullNameElement.shouldNotBe(Condition.empty);
        return this;
    }

    public ContactUsPageStepObject enterEmali (String emailparam){
        emailElement.setValue(emailparam);
        emailElement.shouldNotBe(Condition.empty);
        return this;
    }

    public ContactUsPageStepObject enterTitle (String titleparam){
        titleElement.setValue(titleparam);
        titleElement.shouldNotBe(Condition.empty);
        return this;
    }

    public ContactUsPageStepObject enterText (String textparam){
        textElement.setValue(textparam);
        textElement.shouldNotBe(Condition.empty);
        return this;
    }

}
