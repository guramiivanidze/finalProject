import org.testng.Assert;
import pageobject.ContacUsPageObject;
import stepobject.ContactUsPageStepObject;
import utils.chromeRun;
import dataobject.contactformdata;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;
import static dataobject.contactformdata.*;

public class ContacUsPageTest extends chromeRun {
    @Test (priority = 1)
    public static void DontEnterData(){
        ContactUsPageStepObject step = new ContactUsPageStepObject();
        ContacUsPageObject contobj = new ContacUsPageObject();
        step
                .goToContactPage()
                .justClickSubmitBtn();

        Assert.assertEquals(contobj.errorMsgelement.getValue(),errormsg);
    }

    @Test (priority = 2)
    public static void EnterAllData(){
        ContactUsPageStepObject step = new ContactUsPageStepObject();
        ContacUsPageObject contobj = new ContacUsPageObject();
        step
                .goToContactPage()
                .enterFullName(fullName)
                .enterEmali(email)
                .enterTitle(subject)
                .enterText(simpletext)
                .justClickSubmitBtn();
        Assert.assertEquals(contobj.successMsgelement.getValue(),successMsg);
    }
}
