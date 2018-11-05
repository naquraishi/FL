package flaconipages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;

@PageUrl("https://www.flaconi.de/herrenparfum/")

public class HerrenParfumPage extends FluentPage{

    @FindBy(xpath = "//div[@class='side-nav']//a[contains(text(), 'Herrenparfum')]/following::a[contains(text(),'Nischendüfte')]")
    private FluentWebElement nischenDüfte;

    public void nischenDüfteSelection() {
        await().atMost(5, TimeUnit.SECONDS).until(nischenDüfte).clickable();
        nischenDüfte.click();
    }

    @Override
    public void isAt() {
        assertThat(window().title()).contains("All User");
    }

}


