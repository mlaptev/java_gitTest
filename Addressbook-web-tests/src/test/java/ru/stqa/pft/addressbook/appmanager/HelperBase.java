package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
<<<<<<< HEAD
=======
import org.openqa.selenium.NoSuchElementException;
>>>>>>> 0a0cbad80c37f3b89c1ecbf389396bbf1a93788b
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBase {
    public WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        click(locator);
        if (text != null) {
            String existingText = wd.findElement(locator).getAttribute("value");
            if (!text.equals(existingText)) {

                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }
        }
    }
    //protected void attach(By locator, File file) {
      //  if (file != null) {
        //    wd.findElement(locator).sendKeys(file.getAbsolutePath());
        //}
    //}

    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    protected boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}
