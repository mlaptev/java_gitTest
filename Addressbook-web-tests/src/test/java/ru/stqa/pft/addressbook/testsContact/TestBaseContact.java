package ru.stqa.pft.addressbook.testsContact;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appMContact.ApplicationManadgerContact;

public class TestBaseContact {

    protected final ApplicationManadgerContact appc = new ApplicationManadgerContact();

    @BeforeMethod
    public void setUp() throws Exception {
        appc.init();
    }

    @AfterMethod
    public void tearDown() {
        appc.stop();
    }

    public ApplicationManadgerContact getAppc() {
        return appc;
    }
}
