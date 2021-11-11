package stepobject;

import io.qameta.allure.Step;
import pageobject.GalleryPageobject;

public class GalleryStepObject extends GalleryPageobject {
    @Step
    public GalleryStepObject goToGallerypage(){
        Gallerypage.click();
        return this;
    }
    @Step
    public GalleryStepObject goToreceptionTab(){
        reception.click();
        return this;
    }
    @Step
    public GalleryStepObject goToKitchenTab(){
        Kitchen.click();
        return this;
    }
    @Step
    public GalleryStepObject goTobathRoomTab(){
        bathRoom.click();
        return this;
    }
    @Step
    public GalleryStepObject goTobadRoomTab(){
        badRoom.click();
        return this;
    }
    @Step
    public GalleryStepObject goToPoolTab(){
        Pool.click();
        return this;
    }
    @Step
    public GalleryStepObject goToofficeTab(){
        office.click();
        return this;
    }
}
