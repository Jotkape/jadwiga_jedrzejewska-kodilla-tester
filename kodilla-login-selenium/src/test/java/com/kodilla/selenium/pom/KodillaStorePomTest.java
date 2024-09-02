package com.kodilla.selenium.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStorePomTest {

    KodillaStorePom storePom;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "--disable-search-engine-choice-screen");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }

    @Test
    public void testSearchResults() {
        verifySearchResults("NoteBook", 2);
        verifySearchResults("School", 1);
        verifySearchResults("Brand", 1);
        verifySearchResults("Bussines", 1);
        verifySearchResults("Gaming", 1);
        verifySearchResults("Powerful", 0);
    }

    @Test
    public void testSearchResultsIgnoreCase() {
        verifySearchResults("notebook", 2);
        verifySearchResults("NOTEBOOK", 2);
        verifySearchResults("school", 1);
        verifySearchResults("SCHOOL", 1);
        verifySearchResults("brand", 1);
        verifySearchResults("BRAND", 1);
        verifySearchResults("bussines", 1);
        verifySearchResults("BUSSINES", 1);
        verifySearchResults("gaming", 1);
        verifySearchResults("GAMING", 1);
        verifySearchResults("powerful", 0);
        verifySearchResults("POWERFUL", 0);
    }

    private void verifySearchResults(String query, int expectedResults) {
        storePom.search(query);
        int actualResults = storePom.getResultsCount();
        assertEquals(expectedResults, actualResults, "Liczba wyników dla '" + query + "' jest nieprawidłowa.");
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}
