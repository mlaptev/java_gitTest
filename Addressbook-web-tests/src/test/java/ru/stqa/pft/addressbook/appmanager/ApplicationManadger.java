package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import sun.plugin2.util.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManadger {
    WebDriver wd;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private String browser;

    public ApplicationManadger( String browser) {
        this.browser = browser;
    }


    public void init() {

        String browser = org.openqa.selenium.remote.BrowserType.CHROME;
        if (browser == org.openqa.selenium.remote.BrowserType.FIREFOX){
            wd = new FirefoxDriver();
        }
        else  if (browser == org.openqa.selenium.remote.BrowserType.CHROME) {
            wd = new ChromeDriver();
        }
        else  if (browser == org.openqa.selenium.remote.BrowserType.IE) {
            wd = new InternetExplorerDriver();
        }
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/edit.php");
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret");
    }



    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
