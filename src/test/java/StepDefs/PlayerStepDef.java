package StepDefs;

import OpenBrowserPage.MusicPlayerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class PlayerStepDef {

    private MusicPlayerPage musicPlayerPage;

    public PlayerStepDef() {
        this.musicPlayerPage = new MusicPlayerPage();
    }
    @And("user search for {string} on search bar")
    public void userSearchForOnSearchBar(String songName) {
        musicPlayerPage.searchSongName(songName);
    }

    @When("user click play button")
    public void userClickPlayButton() {
        musicPlayerPage.playTopSearchSong();
    }

    @And("user wait for {int} seconds and repeat the song {int} times")
    public void userWaitForSecondsAndRepeatTheSong(int seconds, int timeRepeat) {
        musicPlayerPage.repeatSongAfterSeconds(seconds, timeRepeat);
    }

    @When("user play on first song")
    public void userPlayOnFirstSong() {
        musicPlayerPage.userPlayFirstSong();
    }

    @And("user click on repeat song button")
    public void userClickOnRepeatSongButton() {
        musicPlayerPage.clickRepeatButtonPlayer();
    }

    @And("user wait for {int} seconds and play next and back repeat {int} times")
    public void userWaitForSecondsAndPlayNextAndBackRepeatTimes(int seconds, int timeRepeat) {
        musicPlayerPage.playNextAndBackRepeat(seconds, timeRepeat);
    }

    @And("user click on song artist")
    public void userClickOnSongArtist() {
        musicPlayerPage.clickTopSongArtist();
    }
}
