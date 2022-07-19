import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectListDemo {
    WebDriver driver;
    WebDriverWait wait;

    public SelectListDemo(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public final String url = "https://demo.seleniumeasy.com/basic-select-dropdown-demo.html";
    public final By drop = By.xpath("//*[@id=\"select-demo\"]");
    public final By last = By.xpath("//*[@id=\"select-demo\"]/option[8]");
    public final By selected = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[2]");

    public void navigate() {
        driver.get(url);
    }

    public void clickDrop() {
        driver.findElement(drop).click();
    }
    public void clickLast() {
        driver.findElement(last).click();
    }

    public String getSelected() {
        return driver.findElement(selected).getText();
    }


}
