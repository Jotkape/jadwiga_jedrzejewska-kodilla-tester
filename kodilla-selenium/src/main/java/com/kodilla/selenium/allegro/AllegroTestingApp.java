package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.82 Safari/537.36");
        WebDriver driver = new ChromeDriver(chromeOptions);

        //poniższy kod nie zadziała ponieważ uruchami się antybot mechanizm allegro którego nie da się wyłaczyć wg wskazówek z zadania

        WebElement categoryDropdown = driver.findElement(By.xpath("//select[contains(@aria-label, 'Wybierz kategorię')]"));
        Select selectCategory = new Select(categoryDropdown);
        selectCategory.selectByVisibleText("Elektronika");
        WebElement searchBox = driver.findElement(By.xpath("//input[contains(@placeholder, 'czego szukasz')]"));
        searchBox.sendKeys("Mavic mini");
        searchBox.submit();
    }

}