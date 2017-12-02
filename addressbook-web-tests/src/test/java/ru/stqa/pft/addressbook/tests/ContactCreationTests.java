package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
    FirefoxDriver wd;

    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactData(new ContactData("Siarhei", "Maiseichyk", "Minsk, Belarus", "+375297698649", "jaguar_sergey@tut.by"));
        app.getContactHelper().clickAddContactBtn();
    }


}
