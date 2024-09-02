package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class KodillaStorePom extends AbstractPom {

    @FindBy(css = "input#searchField")
    WebElement searchField;

    @FindBy(css = "div.element")
    List<WebElement> searchResults;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void search(String query) {
        searchField.click();
        searchField.clear();
        searchField.sendKeys(query);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getResultsCount() {
        return searchResults.size();
    }
}
