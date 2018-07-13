package ru.stqa.pft.addressbook.testsContact;

import org.testng.annotations.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ContactDeletionTests extends TestBaseContact {
    WebDriver wd;


    @Test
    public void testContactDeletion() {

           // wd.get("http://localhost/addressbook/");
            //wd.findElement(By.linkText("home")).click();
            wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
            wd.switchTo().alert().accept();
            wd.findElement(By.xpath("//div[@id='content']/form[2]/input[2]")).click();
    }


    }
