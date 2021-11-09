import utils.chromeRun;
import dataobject.contactformdata;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;

public class ContacUsPageTest extends chromeRun {
    @Test
    public static void first_test(){
        $(byAttribute("href","?page=contact")).click();
        $(byAttribute("name","field1")).setValue(contactformdata.fullName);
        sleep(1000);
    }
}
