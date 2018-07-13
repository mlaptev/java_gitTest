package ru.stqa.pft.addressbook.appMContact;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import ru.stqa.pft.addressbook.appmanager.SessionHelper;
import sun.plugin2.util.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManadgerContact {
    WebDriver wd;

    private SessionHelper sessionHelper;
    private NavigationHelperContact navigationHelperContact;
    private ContactHelper contactHelper;

    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert().accept();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }



    public void init() {
        String browser = org.openqa.selenium.remote.BrowserType.FIREFOX;
        if (browser == org.openqa.selenium.remote.BrowserType.FIREFOX) {
            wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        }
        else if (browser == org.openqa.selenium.remote.BrowserType.CHROME) {
            wd = new ChromeDriver();
        }
        else if (browser == org.openqa.selenium.remote.BrowserType.IE) {
            wd = new InternetExplorerDriver();
        }
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
