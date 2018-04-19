package ru.stqa.pft.addressbook.appMContact;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import ru.stqa.pft.addressbook.appmanager.SessionHelper;

import java.util.concurrent.TimeUnit;

public class ApplicationManadgerContact {
    FirefoxDriver wd;

    private SessionHelper sessionHelper;
    private NavigationHelperContact navigationHelperContact;
    private ContactHelper contactHelper;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert().accept();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }



    public void init() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        contactHelper = new ContactHelper(wd);
        navigationHelperContact = new NavigationHelperContact(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret");
    }



    public void stop() {
        wd.quit();
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NavigationHelperContact getNavigationHelperContact() {
        return navigationHelperContact;
    }

    public void returnToHomePage() {
        navigationHelperContact.returnToHomePage();
    }
}
