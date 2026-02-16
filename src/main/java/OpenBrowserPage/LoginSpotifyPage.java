package OpenBrowserPage;
import Base.BasePage;
import Locators.SpotifyLocator;
import Base.WebSingleton;

public class LoginSpotifyPage extends BasePage {

    public LoginSpotifyPage() {
        super(WebSingleton.getDriver()); // Panggil constructor dari BasePage
    }

    public void clickLoginButton(){
        waitUntilClickable(SpotifyLocator.LOGIN_BUTTON);
        clickOn(SpotifyLocator.LOGIN_BUTTON);
    }

    public void inputEmailAndPassword(String email){
        waitUntilClickable(SpotifyLocator.LABEL_INPUT_EMAIL);
        typeOn(SpotifyLocator.LABEL_INPUT_EMAIL, email);
        clickOn(SpotifyLocator.BUTTON_COMPLETE_AFTER_EMAIL);
        waitABit(2);
        waitUntilClickable(SpotifyLocator.BUTTON_LOGIN_WITH_PASSWORD);
        clickOn(SpotifyLocator.BUTTON_LOGIN_WITH_PASSWORD);
        waitABit(2 );
        waitUntilClickable(SpotifyLocator.LABEL_INPUT_PASSWORD_EMAIL);
        typeOn(SpotifyLocator.LABEL_INPUT_PASSWORD_EMAIL, "P@ssw0rd*1");
        clickOn(SpotifyLocator.BUTTON_LOGIN);
    }

}
