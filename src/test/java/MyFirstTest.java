import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by dteichert on 17/02/16.
 */
public class MyFirstTest {

    @Test
    public void startWebDriver(){

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://de.release.zlounge.org");
        Assert.assertTrue("title should start with Exklusive Mode",
                driver.getTitle().startsWith("Exklusive Mode"));

        driver.close();
        driver.quit();
    }


}
