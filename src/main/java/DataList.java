import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataList {
    WebDriver driver;
    WebDriverWait wait;

    public DataList(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private final String url = "https://demo.seleniumeasy.com/data-list-filter-demo.html";

}
