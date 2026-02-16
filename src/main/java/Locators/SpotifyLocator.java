package Locators;

import org.openqa.selenium.By;

public interface SpotifyLocator {
    By LOGIN_BUTTON = By.xpath("//button/span[contains(text(),'Log in')]");
    By LABEL_INPUT_EMAIL = By.xpath("//input[@data-testid='login-username']");
    By BUTTON_COMPLETE_AFTER_EMAIL = By.xpath("//button[@data-testid='login-button']");
    By BUTTON_LOGIN_WITH_PASSWORD = By.xpath("//button[contains(text(),'Log in with a password')]");
    By LABEL_INPUT_PASSWORD_EMAIL = By.xpath("//input[@data-testid='login-password']");
    By BUTTON_LOGIN = By.xpath("//button[@data-testid='login-button']");
    By LABEL_SEARCH_SONG = By.xpath("//input[@data-testid='search-input']");
    By BUTTON_PLAY_TOP_SEARCH = By.xpath("//div[@data-testid='top-result-card']//button[@data-testid='play-button']");
    By BUTTON_BACK_PLAYER = By.xpath("//button[@data-testid='control-button-skip-back']");
    By BUTTON_NEXT_PLAYER = By.xpath("//button[@data-testid='control-button-skip-forward']");
    By BUTTON_CLOSE_FOOTER = By.xpath("//div[@id='onetrust-close-btn-container']/button");
    By BUTTON_MUTE_PLAYER = By.xpath("//button[@data-testid='volume-bar-toggle-mute-button']");
    By CARD_TOP_SEARCH = By.xpath("//div[@data-testid='top-result-card']");
    By BUTTON_REPEAT_PLAYER = By.xpath("//button[@data-testid='control-button-repeat']");
    By BUTTON_FIRST_SONG = By.xpath("//div[@aria-rowindex=1]/div[@data-testid='tracklist-row']");
    By BUTTON_TOP_SONG_ARTIST_TAFSIR = By.xpath("//div[@data-testid='top-result-card']//a[contains(text(),'Tafsir')]");
    By LABEL_CURRENT_SONG_PLAYED = By.xpath("//a[@data-testid='context-item-link']");
}
