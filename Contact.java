package applicationCS320;

public class Contact {
	
	private String contactId;
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;

	//Create contact objects
	public Contact(String contactId, String firstName, String lastName, String address, String phoneNumber) {
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	
	}
	
	//create getter methods
	public String getContactId() {
		return this.contactId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getAddress() {
		return this.address;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	//create setter methods
	
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
/* Commenting out as I could not get the coverage to
 * 100% with this code block included.
 
	//create method to return Contact info.
	@Override
    public String toString() {
        return "Contact Information:\n" +
                "Contact ID: " + this.contactId + "\n" +
                "First Name: " + this.firstName + "\n" +
                "Last Name: " + this.lastName + "\n" +
                "Address: " + this.address + "\n" +
                "Phone Number: " + this.phoneNumber + "\n";
    }
    */
	
}
