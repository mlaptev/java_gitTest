package ru.stqa.pft.addressbook.testsContact;

import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Groups;
public class ContactCreationTests extends TestBaseContact {

    @Test
    public void testContactCreation()

    {

        ContactData newContact = new ContactData().withFirstname("test_name").withLastname("test_surname");
        app.goTo().gotoHomePage();
        app.contact().initContactCreation();
        app.contact().fillContactForm(newContact, true);
        app.contact().submitContactCreation();
        app.contact().returnToHomePage();






    }





    //{

      //  appc.getContactHelper().unitContactCreation();
        //appc.getContactHelper().fillContactForm(new ContactData("tegfdst", "mifddgdle", "lafdfgsst", "nidfgkndfame", "tidfgtlee", "campdfgania", "Odfgmsk", "12dfg3456", "123456789", "123", "321564", "tedfgdggts@tt.t", "tedfdfgst2@tt.r", "tesdgdt3@tt.rr", "1985", "2000", "addfgdre", "dom", "tdfgdfgdfgdfgdfgdfgdfgestirovanitre", "test1154"));
        //appc.getContactHelper().submitContactCreation();
        //appc.getContactHelper().returnToHomePage();
    //}

}
