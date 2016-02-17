import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        WebElement email=driver.findElement(By.id("f2-ie-mail"));
        email.sendKeys("dt_selenium@qa-zalando.de");

        WebElement password=driver.findElement(By.id("f2-ip-password"));
        password.sendKeys("123456");

        driver.findElement(By.id("submit-login")).click();

        Assert.assertTrue("title should start with Exklusive Mode",
                driver.getTitle().startsWith("Exklusive Mode"));

        driver.close();
        driver.quit();
    }


}
