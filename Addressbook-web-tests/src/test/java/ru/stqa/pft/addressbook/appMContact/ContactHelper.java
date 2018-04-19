package ru.stqa.pft.addressbook.appMContact;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper {
    private FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {
       this.wd = wd;
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    private void click(By locator) {
        wd.findElement(locator).click();
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHome());
        type(By.name("mobile"), contactData.getMobilephone());
        type(By.name("work"), contactData.getWorkphone());
        type(By.name("fax"), contactData.getFaxnumber());
        type(By.name("email"), contactData.getEmail());
        type(By.name("email2"), contactData.getEmail12());
        type(By.name("email3"), contactData.getEmail13());
        click(By.name("homepage"));
        wd.findElement(By.name("homepage")).sendKeys("issart.com");
        click(By.xpath("//div[@id='content']/form/select[2]//option[6]"));
        click(By.xpath("//div[@id='content']/form/select[1]//option[13]"));
        type(By.name("byear"), contactData.getBirthyear());
        click(By.xpath("//div[@id='content']/form/select[3]//option[10]"));
        click(By.xpath("//div[@id='content']/form/select[4]//option[6]"));
        type(By.name("ayear"), contactData.getAnniversaryyear());
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getHomephone2());
        type(By.name("notes"), contactData.getNotes());
    }

    private void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }
}
