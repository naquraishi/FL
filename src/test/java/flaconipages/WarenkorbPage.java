package flaconipages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;


public class WarenkorbPage extends FluentPage {


    @Page
    private NischenDueftePage nischenDueftePage;

    public boolean checkIftheItemAddedExists(String itemDetails){
        String itemXpath = String.format("//div[@class='cart-details']//a[contains(text(), '%s')]", itemDetails);
        return find(By.xpath(itemXpath)).first().displayed();
    }


}
