package com.vemser.web.pages;

import com.vemser.web.data.service.ElementService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends ElementService {
    protected static String readText(By by) {
        waitElement(by);
        return element(by).getText();
    }

    protected static void verifyElement(By by) {
        waitElement(by);
        element(by).isDisplayed();
    }

    protected static void fillInput(By by, String text) {
        waitElement(by);
        element(by).sendKeys(text);
    }

    protected static void clearInput(By by) {
        waitElement(by);
        element(by).clear();
    }

    protected static void click(By by) {
        waitElement(by);
        element(by).click();
    }

    protected static void waitAndClick(By by) {
        waitElementToBeClickable(by);
        element(by).click();
    }

    protected static void confirmInputCheckbox(By by) {
        waitElement(by);
        WebElement element = element(by);
        if (!element.isSelected()) {
            element.click();
        }
    }

    protected static void selectOptionByValue(By by, String value) {
        waitElement(by);
        WebElement element = element(by);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    protected static void selectOptionByText(By by, String option) {
        waitElement(by);
        WebElement element = element(by);
        Select select = new Select(element);
        select.selectByVisibleText(option);
    }

    protected static void tab(By by) {
        waitElement(by);
        element(by).sendKeys("\t");
    }

    protected static void hover(By by) {
        waitElement(by);
        performInteraction(by, "hover");
    }
}
