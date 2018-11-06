package flaconipages;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

public class AddToCartPage extends FluentPage {

    @FindBy(xpath = "(//button[@title='In den Warenkorb'])[1]")
    //@FindBy(xpath = "(//div[@id='purchasepanel']/ul[@class='product-list']//button[@title='In den Warenkorb'])[1]")
    private FluentWebElement addToCartButton;

    @FindBy(xpath = "//a[contains(text(), 'Warenkorb Ansehen')]")
    private FluentWebElement viewCartButton;

    public void addToCartClick() {
        await().atMost(10, TimeUnit.SECONDS).until(addToCartButton).displayed();
        addToCartButton.click();
    }

    public void viewCartClick() {
        await().atMost(10, TimeUnit.SECONDS).until(viewCartButton).clickable();
        viewCartButton.click();
    }


}
