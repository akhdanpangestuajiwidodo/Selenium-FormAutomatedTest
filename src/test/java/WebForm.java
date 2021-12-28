import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebForm {

    protected WebDriver driver;

    public WebForm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
