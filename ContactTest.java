package applicationCS320;

//@author Tammy Hartline
//05/18/2023
//Milestone Week 3
//CS-320
//ContactTest class

import org.junit.Assert;
import org.junit.Test;

public class ContactTest {
 
	public ContactTest() {
		
	}

 //Annotate test and test setter methods
 @Test
 public void testSetterMethods() {
     Contact contact = new Contact("CON1", "Jenny", "Jones", "221 Baker Street", "2565551010");
     contact.setContactId("CON2");
     contact.setFirstName("Jordan");
     contact.setLastName("Johnson");
     contact.setAddress("2021 Back Road");
     contact.setphoneNumber("5252522255");
     Assert.assertEquals("CON2", contact.getContactId());
     Assert.assertEquals("Jordan", contact.getFirstName());
     Assert.assertEquals("Johnson", contact.getLastName());
     Assert.assertEquals("2021 Back Road", contact.getAddress());
     Assert.assertEquals("5252522255", contact.getPhoneNumber());
 }
 
}
