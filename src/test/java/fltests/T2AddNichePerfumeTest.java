package fltests;
import flaconipages.*;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.junit.Test;
import utils.FluentLeniumTest;



public class T2AddNichePerfumeTest extends FluentLeniumTest {

    @Page
    private NischenDueftePage nischenDueftePage;

    @Page
    private AddToCartPage addToKartPage;

    @Page
    private WarenkorbPage warenkorbPage;

    @Test
    public void test2() {
        nischenDueftePage.go();
        nischenDueftePage.niedrigsterOptionSelection();
        String itemDetails =  nischenDueftePage.addItemName();
        nischenDueftePage.niedrigsterParfumSelection();
        addToKartPage.addToCartClick();
        addToKartPage.viewCartClick();
        boolean itemExists = warenkorbPage.checkIftheItemAddedExists(itemDetails);
        warenkorbPage.removeItemFromTheCart();
        Assert.assertTrue(itemExists);
    }

}
