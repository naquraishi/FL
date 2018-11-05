package utils;
import org.apache.commons.exec.OS;
import org.fluentlenium.adapter.junit.FluentTest;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.Objects;


public class FluentLeniumTest extends FluentTest {

    private  static MyProperties myProperties = new MyProperties();
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {

        ClassLoader classLoader = FluentLeniumTest.class.getClassLoader();

        String driverName = myProperties.getProperty("driver");

        File chromeDriverFile = null;
        File ffDriverFile = null;

        if (OS.isFamilyWindows()){
            ffDriverFile = new File(Objects.requireNonNull(classLoader.getResource("geckodriver.exe")).getFile());
            chromeDriverFile = new File(Objects.requireNonNull(classLoader.getResource("chromedriver.exe")).getFile());

        }
        else if (OS.isFamilyUnix()){
            chromeDriverFile = new File(Objects.requireNonNull(classLoader.getResource("chromedriver")).getFile());
            ffDriverFile = new File(Objects.requireNonNull(classLoader.getResource("geckodriver")).getFile());
        }


        switch(driverName){
            case "chrome":
                //chrome driver ver 2.42 loaded from src->main->resources

                try{
                    System.out.println(chromeDriverFile.getAbsolutePath());
                    System.setProperty("webdriver.chrome.driver", chromeDriverFile.getAbsolutePath());
                }catch (NullPointerException e){
                    throw new RuntimeException(e);
                }



                break;

            case "firefox":

                try{
                    System.out.println(ffDriverFile.getAbsolutePath());
                    System.setProperty("webdriver.gecko.driver", ffDriverFile.getAbsolutePath());
                }catch (NullPointerException e){
                    throw new RuntimeException(e);
                }

                break;
            default:
                System.out.println("No driver selected");
                break;
        }

    }

    @Override
    public String getWebDriver() {
        return myProperties.getProperty("driver");
    }

}