package OpenBrowserPage;

import Base.BasePage;
import Base.WebSingleton;
import Locators.SpotifyLocator;

public class MusicPlayerPage extends BasePage {
    public MusicPlayerPage() {
        super(WebSingleton.getDriver());
    }

    public void searchSongName(String songName) {
        waitUntilClickable(SpotifyLocator.LABEL_SEARCH_SONG);
        typeOn(SpotifyLocator.LABEL_SEARCH_SONG, songName);
    }

    public void playTopSearchSong() {
        waitABit(1);
        hoverArea(SpotifyLocator.BUTTON_PLAY_TOP_SEARCH);
        clickOn(SpotifyLocator.BUTTON_PLAY_TOP_SEARCH);
        clickOn(SpotifyLocator.BUTTON_CLOSE_FOOTER);
        clickOn(SpotifyLocator.BUTTON_MUTE_PLAYER);
        waitABit(3);
    }

    public void repeatSongAfterSeconds(Integer seconds, Integer timeRepeat) {
        System.out.println("lagu disetel");
        int j = 0;
        for (int i = 1; i <= timeRepeat; i++) {
            waitABit(seconds);
//            clickOn(SpotifyLocator.BUTTON_NEXT_PLAYER);
//            waitABit(2);
//            clickOn(SpotifyLocator.BUTTON_BACK_PLAYER);
            clickOn(SpotifyLocator.BUTTON_BACK_PLAYER);
            if (!currentSongPlayed().equals("Hakim Individu")) {
                clickOn(SpotifyLocator.BUTTON_BACK_PLAYER);
            }
            j = j + 1;
            System.out.println("sedang repeat ke: " + j);
        }
    }

    public void userPlayFirstSong() {
        waitABit(2);
        doubleClick(SpotifyLocator.BUTTON_FIRST_SONG);

    }

    public void clickRepeatButtonPlayer() {
        clickOn(SpotifyLocator.BUTTON_REPEAT_PLAYER);
    }

    public void clickTopSongArtist() {
        waitABit(1);
        clickOn(SpotifyLocator.BUTTON_CLOSE_FOOTER);
        clickOn(SpotifyLocator.BUTTON_MUTE_PLAYER);
        clickOn(SpotifyLocator.BUTTON_TOP_SONG_ARTIST_TAFSIR);
    }

    public void playNextAndBackRepeat(Integer seconds, Integer timeRepeat) {
        System.out.println("lagu disetel");
        int j = 0;
        for (int i = 1; i <= timeRepeat; i++) {
            waitABit(seconds);
            clickOn(SpotifyLocator.BUTTON_NEXT_PLAYER);
            waitABit(2);
            clickOn(SpotifyLocator.BUTTON_BACK_PLAYER);
            if (!currentSongPlayed().equals("Blokir Pikir")) {
                clickOn(SpotifyLocator.BUTTON_BACK_PLAYER);
            }
            j = j + 1;
            System.out.println("sedang repeat ke: " + j);
        }
    }

    public String currentSongPlayed() {
        String currentSongPlayed = getText(SpotifyLocator.LABEL_CURRENT_SONG_PLAYED);
        return currentSongPlayed;
    }
}
