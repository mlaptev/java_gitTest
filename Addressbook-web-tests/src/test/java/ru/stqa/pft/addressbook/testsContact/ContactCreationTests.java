package ru.stqa.pft.addressbook.testsContact;

import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBaseContact {

    @Test
    public void testContactCreation() {

        appc.getContactHelper().initContactCreation();
        appc.getContactHelper().fillContactForm(new ContactData("tegfdst", "mifddgdle", "lafdfgsst", "nidfgkndfame", "tidfgtlee", "campdfgania", "Odfgmsk", "12dfg3456", "123456789", "123", "321564", "tedfgdggts@tt.t", "tedfdfgst2@tt.r", "tesdgdt3@tt.rr", "1985", "2000", "addfgdre", "dom", "tdfgdfgdfgdfgdfgdfgdfgestirovanitre"));
        appc.getContactHelper().submitContactCreation();
        appc.getContactHelper().returnToHomePage();
    }

}
