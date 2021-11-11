import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import pageobject.ContacUsPageObject;
import stepobject.ContactUsPageStepObject;
import utils.chromeRun;
import org.testng.annotations.Test;
import static dataobject.contactformdata.*;

@Listeners(utils.testLister.class)
public class ContacUsPageTest extends chromeRun {

    @Description(" check default Values ")
    @Link("https://github.com/gurglosa/finalProject")
    public static void DontEnterData(){
        ContactUsPageStepObject step = new ContactUsPageStepObject();
        ContacUsPageObject contobj = new ContacUsPageObject();
        step
                .goToContactPage()
                .justClickSubmitBtn();

        Assert.assertEquals(contobj.errorMsgelement.getValue(),errormsg);
    }

    @Test (priority = 2)
    @Description(" check default Values ")
    @Link("https://github.com/gurglosa/finalProject")
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
