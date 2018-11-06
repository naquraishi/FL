package flaconipages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;

@PageUrl("https://www.flaconi.de/herrenparfum/")

public class HerrenParfumPage extends FluentPage{

    @FindBy(xpath = "//div[@class='side-nav']//a[contains(text(), 'Herrenparfum')]/following::a[contains(text(),'Nischend')]")
    private FluentWebElement nischenDuefte;

    public void nischenDuefteSelection() {
        await().atMost(5, TimeUnit.SECONDS).until(nischenDuefte).clickable();
        nischenDuefte.click();
    }

}


