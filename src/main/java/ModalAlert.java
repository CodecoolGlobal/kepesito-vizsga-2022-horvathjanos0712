import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalAlert {
    WebDriver driver;
    WebDriverWait wait;

    public ModalAlert(WebDriver driver, WebDriverWait wait) {this.driver = driver;
        this.wait = wait;}

    private final String url = "https://demo.seleniumeasy.com/bootstrap-modal-demo.html#";
    private final By launchButton = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a");
    private final By modalBody = By.xpath("//*[@id=\"myModal0\"]/div/div/div[3]");
    private final By close = By.xpath("//*[@id=\"myModal0\"]/div/div/div[4]/a[1]");

    public void getUrl() {
        driver.get(url);
    }

    public void clickLaunchButton() {
        driver.findElement(launchButton).click();
    }

    public String getModalText() {
        String txt = driver.switchTo().alert().getText();
        return txt;
    }

    public void closeAlert() {
        driver.findElement(close).click();
    }

}
