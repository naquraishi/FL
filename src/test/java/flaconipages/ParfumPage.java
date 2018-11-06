package flaconipages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;

@PageUrl("https://www.flaconi.de/parfum/")

public class ParfumPage extends FluentPage{

    @FindBy(xpath = "//div[@class='side-nav']//a[contains(text(), 'Herrenparfum')]")
    private FluentWebElement herrenParfum;

    public void herrenParfumSelection() {
        await().atMost(5, TimeUnit.SECONDS).until(herrenParfum).clickable();
        herrenParfum.click();
    }

}


