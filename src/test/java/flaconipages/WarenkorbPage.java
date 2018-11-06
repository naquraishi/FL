package flaconipages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;


public class WarenkorbPage extends FluentPage {

    @FindBy(xpath = "//span[contains(text(), 'Löschen')]")
    private FluentWebElement removeItemFromTheCartButton;

    @Page
    private NischenDueftePage nischenDueftePage;

    public boolean checkIftheItemAddedExists(String itemDetails){
        String itemXpath = String.format("//div[@class='cart-details']//a[contains(text(), '%s')]", itemDetails);
        return find(By.xpath(itemXpath)).first().displayed();
    }

    public void removeItemFromTheCart(){
        removeItemFromTheCartButton.click();
    }
}
