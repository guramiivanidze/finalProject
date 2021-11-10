package stepobject;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pageobject.ContacUsPageObject;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ContactUsPageStepObject extends ContacUsPageObject {

    @Step("click cotanct page From menu")
    public  ContactUsPageStepObject goToContactPage(){
        contacMenuelement.click();
        pageTitleelement.shouldBe(Condition.visible);
        return this;

    }
    @Step("click submit btn")
    public ContactUsPageStepObject justClickSubmitBtn(){
        submitBtnelement.click();
        return this;
    }
    @Step("enter full name ")
    public ContactUsPageStepObject enterFullName(String nameParam){
        fullNameElement.setValue(nameParam);
        fullNameElement.shouldNotBe(Condition.empty);
        return this;
    }
    @Step("enter Email")
    public ContactUsPageStepObject enterEmali (String emailparam){
        emailElement.setValue(emailparam);
        emailElement.shouldNotBe(Condition.empty);
        return this;
    }
    @Step("enter title")
    public ContactUsPageStepObject enterTitle (String titleparam){
        titleElement.setValue(titleparam);
        titleElement.shouldNotBe(Condition.empty);
        return this;
    }
    @Step("enter text")
    public ContactUsPageStepObject enterText (String textparam){
        textElement.setValue(textparam);
        textElement.shouldNotBe(Condition.empty);
        return this;
    }

}
