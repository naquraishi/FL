package flaconipages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;


public class WarenkorbPage extends FluentPage {

    @Page
    private NischenDueftePage nischenDueftePage;

    public boolean checkIftheItemAddedExists(String itemDetails){
        System.out.println(itemDetails + "******");
        String itemXpath = String.format("//div[@class='cart-details']//a[contains(text(), '%s')]", itemDetails);
        System.out.println(itemXpath);
        return find(By.xpath(itemXpath)).first().displayed();
    }
}
