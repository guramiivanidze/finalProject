package pageobject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class GalleryPageobject {
    public SelenideElement Gallerypage = $(byAttribute("href",
            "?page=gallery"));
    public SelenideElement reception = $(byAttribute("data-filter",
            ".gallery10"));
    public SelenideElement Kitchen = $(byAttribute("data-filter",
            ".gallery11"));
    public SelenideElement bathRoom = $(byAttribute("data-filter",
            ".gallery16"));
    public SelenideElement badRoom = $(byAttribute("data-filter",
            ".gallery17"));
    public SelenideElement Pool = $(byAttribute("data-filter",
            ".gallery18"));
    public SelenideElement office = $(byAttribute("data-filter",
            ".gallery19"));


    public SelenideElement receptionPicture = $(byXpath("/html/body/div[2]/ul/li[1]/div/div[3]/p"));
    public SelenideElement KitchenPicture = $(byXpath("/html/body/div[2]/ul/li[2]/div/div[3]/p"));
    public SelenideElement bathRoomPicture = $(byXpath("/html/body/div[2]/ul/li[5]/div/div[3]/p"));
    public SelenideElement badRoomPicture = $(byXpath("/html/body/div[2]/ul/li[4]/div/div[3]/p"));
    public SelenideElement PoolPicture = $(byXpath("/html/body/div[2]/ul/li[3]/div/div[3]/p"));
    public SelenideElement officePicture = $(byXpath("/html/body/div[2]/ul/li[6]/div/div[3]/p"));
}
