package tests;
import flaconipages.*;
import org.fluentlenium.core.annotation.Page;
import org.junit.Test;
import utils.FluentLeniumTest;

import static junit.framework.TestCase.assertTrue;


public class AddNichePerfumeTest2 extends FluentLeniumTest {

    @Page

    private NischenDueftePage nischenDueftePage;

    @Page
    private AddToKartPage addToKartPage;

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
        assertTrue(warenkorbPage.checkIftheItemAddedExists(itemDetails));
    }

}
