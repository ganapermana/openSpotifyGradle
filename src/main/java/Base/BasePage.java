package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void clickOn(By locator){
        driver.findElement(locator).click();
    }

    protected void waitUntilClickable(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Tunggu hingga 10 detik
        wait.until(ExpectedConditions.elementToBeClickable(locator)); // Menunggu tombol bisa diklik
    }

    protected void typeOn(By locator, String stringInput){
        driver.findElement(locator).sendKeys(stringInput);
    }

    protected void hoverArea(By locator){
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform(); // Melakukan aksi hover pada elemen
    }

    protected void doubleClick(By locator){
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.doubleClick();
    }

    protected void waitABit(int seconds) {
        try {
            Thread.sleep(seconds * 1000L); // Konversi detik ke milidetik
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Kembalikan status interrupt
            System.out.println("Thread was interrupted: " + e.getMessage());
        }
    }

    protected String getText (By locator){
        String stringText = driver.findElement(locator).getText();
        return stringText;
    }
}
