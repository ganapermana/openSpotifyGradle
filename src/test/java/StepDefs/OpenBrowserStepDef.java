package StepDefs;
import OpenBrowserPage.OpenBrowserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import Base.WebSingleton;

public class OpenBrowserStepDef {
    private WebDriver driver;
    private OpenBrowserPage browserPage;
    public OpenBrowserStepDef() {
        this.driver = WebSingleton.getDriver(); // Ambil driver dari singleton
        this.browserPage = new OpenBrowserPage(driver); // Inisialisasi OpenBrowserPage dengan driver yang sama
    }

    @Given("^I already open browser$")
    public void iAlreadyOpenBrowser() {
        driver.manage().window().maximize();
    }

    @Then("^user close the browser$")
    public void userCloseTheBrowser() {
        browserPage.closeBrowser();
    }

    @And("user open spotify web")
    public void userOpenSpotifyWeb() throws InterruptedException {
        browserPage.openSpotifyWeb();
    }
}
