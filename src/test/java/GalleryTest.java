import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobject.GalleryPageobject;
import stepobject.GalleryStepObject;
import utils.chromeRun;
import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static dataobject.GalleryData.typeOfGall;

@Listeners(utils.testLister.class)
public class GalleryTest extends chromeRun {
    @Description(" Check tab and pictures ")
    @Test (priority = 1)
    public static void Checkalltype() {
        GalleryStepObject step = new GalleryStepObject();

        step .goToGallerypage();

        for (int i = 1;i<11; i++){
            String xpathlocation = String.format("/html/body/div[2]/ul/li[%s]/div/div[3]/h3",i);
            String getValue =  $(byXpath(xpathlocation)).getText();
            for (String j : typeOfGall){
                if (j.equals(getValue)) Assert.assertEquals(j, getValue);
            }

        }
    }

    @Test(priority = 2)
    public static void checkreceptiontype(){
        GalleryStepObject step = new GalleryStepObject();
        GalleryPageobject obj = new GalleryPageobject();
        step
                .goToGallerypage()
                .goToreceptionTab();
        obj.receptionPicture.shouldBe(Condition.visible);


        }

    @Test (priority = 3)
    public static void checkKitchentype(){
        GalleryStepObject step = new GalleryStepObject();
        GalleryPageobject obj = new GalleryPageobject();
        step
                .goToGallerypage()
                .goToKitchenTab();
        obj.KitchenPicture.shouldBe(Condition.visible);


    }

    @Test (priority = 4)
    public static void checkbathRoomtype(){
        GalleryStepObject step = new GalleryStepObject();
        GalleryPageobject obj = new GalleryPageobject();
        step
                .goToGallerypage()
                .goTobathRoomTab();
        obj.bathRoomPicture.shouldBe(Condition.visible);


    }

    @Test (priority = 5)
    public static void checkbadRoomtype(){
        GalleryStepObject step = new GalleryStepObject();
        GalleryPageobject obj = new GalleryPageobject();
        step
                .goToGallerypage()
                .goTobadRoomTab();
        obj.badRoomPicture.shouldBe(Condition.visible);


    }

    @Test (priority = 6)
    public static void checkpooltype(){
        GalleryStepObject step = new GalleryStepObject();
        GalleryPageobject obj = new GalleryPageobject();
        step
                .goToGallerypage()
                .goToPoolTab();
        obj.PoolPicture.shouldBe(Condition.visible);


    }

    @Test (priority = 7)
    public static void checkofficetype(){
        GalleryStepObject step = new GalleryStepObject();
        GalleryPageobject obj = new GalleryPageobject();
        step
                .goToGallerypage()
                .goToofficeTab();
        obj.officePicture.shouldBe(Condition.visible);


    }
}
