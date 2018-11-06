package flaconipages;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

@PageUrl("https://www.flaconi.de/herren-nischenduefte/")

public class NischenDueftePage extends FluentPage{

    @FindBy(xpath = "//div[@class='sort-by']//select[@class='sortBy']/option[@class='sort-price-asc']")
    private FluentWebElement niedrigsterPreis;

    @FindBy(xpath = "//ul[@class='small-block-grid-2 medium-block-grid-3 large-block-grid-3']/li")
    private FluentList<FluentWebElement> itemsList;


    public String addItemName(){
        String[] parts = itemsList.first().text().split("\n");
        return parts[1];
    }


    public void niedrigsterOptionSelection() {
        niedrigsterPreis.click();
    }

    public void niedrigsterParfumSelection() {
       itemsList.first().click();
    }


}


