package ru.stqa.pft.addressbook.appMContact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelperContact {
    private WebDriver wd;

    public NavigationHelperContact(WebDriver wd) {
     this.wd = wd;
    }

    public void returnToHomePage() {
        wd.findElement(By.linkText("home page")).click();
    }
}