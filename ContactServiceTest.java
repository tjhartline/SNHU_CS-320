package applicationCS320;

//@author Tammy Hartline
//05/18/2023
//Milestone Week 3
//CS-320
//ContactServiceTest class

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;


public class ContactServiceTest {
    private ContactService contactService;

    public ContactServiceTest() {
    }

    @Before
    public void setUp() {
        this.contactService = new ContactService();
    }
    
    //Annotate each test case for each method in the ContactService class.
    @Test
    public void testAddContact() {
        Contact contact = new Contact("CON1", "Tammy", "Hartline", "222 Main St", "5555551111");
        this.contactService.addContacts(contact);
        Assert.assertEquals(contact, this.contactService.getContact("CON1"));
        
    }

    @Test
    public void testRemoveContact() {
        Contact contact = new Contact("CON1", "Tammy", "Hartline", "222 Main St", "5555551111");
        this.contactService.addContacts(contact);
        this.contactService.removeContact("CON1");
        Assert.assertNull(this.contactService.getContact("CON1"));
    }

    @Test
    public void testUpdateFN() {
        Contact contact = new Contact("CON1", "Tammy", "Hartline", "222 Main St", "5555551111");
        this.contactService.addContacts(contact);
        this.contactService.updateFirstName("CON1", "MaryLou");
        Assert.assertEquals("MaryLou", contact.getFirstName());
    }

    @Test
    public void testUpdateLN() {
        Contact contact = new Contact("CON1", "Tammy", "Hartline", "222 Main St", "5555551111");
        this.contactService.addContacts(contact);
        this.contactService.updateLastName("CON1", "Shine");
        Assert.assertEquals("Shine", contact.getLastName());
    }

    @Test
    public void testUpdateAddress() {
        Contact contact = new Contact("CON1", "Tammy", "Hartline", "222 Main St", "5555551111");
        this.contactService.addContacts(contact);
        this.contactService.updateAddress("CON1", "221B Baker St.");
        Assert.assertEquals("221B Baker St.", contact.getAddress());
    }

    @Test
    public void testUpdatePhoneNumber() {
        Contact contact = new Contact("CON1", "Tammy", "Hartline", "222 Main St", "5555551111");
        this.contactService.addContacts(contact);
        this.contactService.updatePhoneNumber("CON1", "2221112222");
        Assert.assertEquals("2221112222", contact.getPhoneNumber());
    }

}
