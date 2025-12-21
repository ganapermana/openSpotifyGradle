package StepDefs;
import OpenBrowserPage.LoginSpotifyPage;
import io.cucumber.java.en.And;

public class LoginSpotifyStepDefs {
    private LoginSpotifyPage loginPage;

    public LoginSpotifyStepDefs() {
        this.loginPage = new LoginSpotifyPage();
    }
    @And("user do login into spotify with email {string}")
    public void userDoLogin(String email){
        loginPage.clickLoginButton();
        loginPage.inputEmailAndPassword(email);
    }
}
