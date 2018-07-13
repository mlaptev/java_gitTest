package ru.stqa.pft.addressbook.appMContact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.appmanager.HelperBase;
import ru.stqa.pft.addressbook.appmanager.NavigationHelper;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    private NavigationHelper NavigationHelper;

    public ContactHelper(WebDriver wd) {
        super(wd);
        NavigationHelper = new NavigationHelper(wd);
    }

    public void unitContactCreation() {
        click(By.linkText("add new"));
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

        if (isElementPresent(By.name("new_group"))) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        }
    }

        public void submitContactCreation () {
            click(By.name("submit"));
        }

        public void returnToHomePage () {
            click(By.linkText("home page"));
        }

        public void initContactModification () {
            click(By.cssSelector("img[alt='Edit']"));
        }

        public void submitContactModification () {
            click(By.name("update"));
        }

        public ContactData infoFromEditForm(ContactData contact) {
            initContactModificationById(contact.getId());
            String firstname = wd.findElement(By.name("firstname")).getAttribute("value");
            String lastname = wd.findElement(By.name("lastname")).getAttribute("value");
            String home = wd.findElement(By.name("home")).getAttribute("value");
            String mobile = wd.findElement(By.name("mobile")).getAttribute("value");
            String work = wd.findElement(By.name("work")).getAttribute("value");
            wd.navigate().back();
            return new ContactData().withId(contact.getId()).withFirstname(firstname).withLastname(lastname)
                    .withHomePhone(home).withMobilePhone(mobile).withWorkPhone(work);

        }




    }


//private void click(By locator) {
       // wd.findElement(locator).click();
   // }
    //private void type(By locator, String text) {
       // click(locator);
       // wd.findElement(locator).clear();
        //wd.findElement(locator).sendKeys(text);
    //}

    //public void initContactCreation() {
      //  click(By.linkText("add new"));
    //}
//}
