package applicationCS320;

import java.util.HashMap;
import java.util.Map;
public class ContactService {
	
	//create contact map to keep contact info linked based on unique contact id.
    private Map<String, Contact> contactMap;

    
    public ContactService() {
    	
    	//add contact to map
        contactMap = new HashMap<>();

    }

    //create add contacts 
    public void addContacts(Contact contact) {

    	String contactId = contact.getContactId();
        contactMap.put(contactId, contact);
        
    }

    //create remove contact
    public void removeContact(String contactId) {
        this.contactMap.remove(contactId);
    }

    //create methods to update both first and last name, address and phone number
    public void updateFirstName(String contactId, String firstName) {
        Contact contact = (Contact)this.contactMap.get(contactId);
        if (contact != null) {
            contact.setFirstName(firstName);
        }

    }

    public void updateLastName(String contactId, String lastName) {
        Contact contact = (Contact)this.contactMap.get(contactId);
        if (contact != null) {
            contact.setLastName(lastName);
        }

    }

    public void updateAddress(String contactId, String address) {
        Contact contact = (Contact)this.contactMap.get(contactId);
        if (contact != null) {
            contact.setAddress(address);
        }

    }

    public void updatePhoneNumber(String contactId, String phoneNumber) {
        Contact contact = (Contact)this.contactMap.get(contactId);
        if (contact != null) {
            contact.setphoneNumber(phoneNumber);
        }

    }

    //create get contact method
    public Contact getContact(String contactId) {
        return (Contact)this.contactMap.get(contactId);
    }
    
    
}
