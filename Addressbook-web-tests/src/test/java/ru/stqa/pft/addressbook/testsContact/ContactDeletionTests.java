package ru.stqa.pft.addressbook.testsContact;

import org.testng.annotations.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ContactDeletionTests extends TestBaseContact {
    FirefoxDriver wd;


    @Test
    public void testContactDeletion() {
/*        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
        wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
        if (!wd.findElement(By.id("6")).isSelected()) {
            wd.findElement(By.id("6")).click();
        }
        wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
        wd.findElement(By.xpath("//div/div[3]/ul/li[1]/a")).click();
    }
    public void del() {*/
        wd.get("http://localhost/addressbook/");
        if (!wd.findElement(By.name("selected[]")).isSelected()) {
            wd.findElement(By.name("selected[]")).click();
        }
/*        wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
        wd.findElement(By.linkText("home")).click();
        if (!wd.findElement(By.id("7")).isSelected()) {
            wd.findElement(By.id("7")).click();
        }
        wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
        wd.findElement(By.linkText("home")).click();*/

    }
}