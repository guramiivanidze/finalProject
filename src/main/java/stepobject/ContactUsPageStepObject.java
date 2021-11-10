package stepobject;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pageobject.ContacUsPageObject;

public class ContactUsPageStepObject extends ContacUsPageObject {

    @Step("click contact page From menu")
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
    @Step("enter full name {0}")
    public ContactUsPageStepObject enterFullName(String nameParam){
        fullNameElement.setValue(nameParam);
        fullNameElement.shouldNotBe(Condition.empty);
        return this;
    }
    @Step("enter Email {0}")
    public ContactUsPageStepObject enterEmali (String emailparam){
        emailElement.setValue(emailparam);
        emailElement.shouldNotBe(Condition.empty);
        return this;
    }
    @Step("enter title {0}")
    public ContactUsPageStepObject enterTitle (String titleparam){
        titleElement.setValue(titleparam);
        titleElement.shouldNotBe(Condition.empty);
        return this;
    }
    @Step("enter text {0}")
    public ContactUsPageStepObject enterText (String textparam){
        textElement.setValue(textparam);
        textElement.shouldNotBe(Condition.empty);
        return this;
    }

}
