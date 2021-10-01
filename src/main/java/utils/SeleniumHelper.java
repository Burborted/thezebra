package utils;

import org.openqa.selenium.*;

public class SeleniumHelper {

    public static boolean isElementPresent(WebElement webElement) {
        try {
            boolean isPresent = webElement.isDisplayed();
            return isPresent;
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public static void dynamicInputDropdownIterator(String keys, int numberOfClicks, WebElement webElement) throws InterruptedException {
        webElement.sendKeys(keys);
        for (int i = 0; i < numberOfClicks; i++){
            webElement.sendKeys(Keys.DOWN);
            Thread.sleep(1000);
        }
        webElement.sendKeys(Keys.ENTER);
    }

}
