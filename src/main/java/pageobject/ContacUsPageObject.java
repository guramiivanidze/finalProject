package pageobject;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ContacUsPageObject {
    public SelenideElement pageTitleelement = $(byText("მოგვწერეთ"));
    public SelenideElement contacMenuelement = $(byAttribute("href","?page=contact"));
    public SelenideElement fullNameElement = $(By.name("field1"));
    public SelenideElement emailElement = $(byAttribute("type",  "email"));
    public SelenideElement titleElement = $(byAttribute("placeholder","თემა"));
    public SelenideElement textElement = $(By.name("field3"));
    public SelenideElement submitBtnelement = $(".btn");
    public SelenideElement errorMsgelement = $(".error");
    public SelenideElement successMsgelement = $(".success");

}
