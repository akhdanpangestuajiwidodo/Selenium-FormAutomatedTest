import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestPlan {

    private static final ChromeDriver driver = new ChromeDriver();

    @Before
    public void main() {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test
    public void submitForm(){
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterFirstName();
        webForm.enterLastName();
        webForm.clickSubmitButton();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        webForm.showAlert();
    }

    @After
    public void clean(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
