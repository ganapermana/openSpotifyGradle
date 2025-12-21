package OpenBrowserPage;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserPage {

    private WebDriver driver;

    public OpenBrowserPage(WebDriver driver) {
        this.driver = driver;
//        System.setProperty("webdriver.chrome.driver", "/Users/ganapermana/Desktop/chromedriver"); // Sesuaikan path-nya
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void openSpotifyWeb() throws InterruptedException {
        driver.get("https://open.spotify.com/");
        Thread.sleep(1000);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
