package StepDefs;

import Base.WebSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class HooksStepDefs {

    @After
    public void tearDown(Scenario scenario) {
        // Jika skenario gagal, ambil screenshot
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) WebSingleton.getDriver()).getScreenshotAs(OutputType.BYTES);
            // Tempelkan gambar ke laporan HTML
            scenario.attach(screenshot, "image/png", "Screenshot_Gagal");
        }

        // Selalu tutup driver setelah selesai agar memori cloud tidak penuh
//        WebSingleton.quitDriver();
    }
}