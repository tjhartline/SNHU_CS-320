package applicationCS320;

import java.util.Date;

public class Appointment {

	
	//Appointment ID Restrictions/Requirements:
	//A required field
	//Must be of type String
	//String must be 10 in length or less
	//Cannot be null
	//Is NOT updateable
	private String unqApptID;
	
	//Appointment date restrictions/requirements:
	//A required field
	//Type must be DATE
	//Date must be in the present or future/Not the past
	//Cannot be null
	//Need to use java.util.Date for the appointment date field
	//And use Before(new Date) in test file to test
	//and check if date is in the past
	private Date apptDate;
	
	//Description restrictions/requirements:
	//A required field
	//Type must be String
	//Cannot be more than 50 characters in length
	//Cannot be null
	private String apptDescription;

	//Create public objects
	public Appointment(String unqApptID, Date apptDate, String apptDescription) {
		
		this.unqApptID = unqApptID;
		this.apptDate = apptDate;
		this.apptDescription = apptDescription;
	
	}
		
	
	//Create getter and setter methods
	public String getApptID() {
		
		return this.unqApptID;
		
	}
	
	public void setUnqApptID(String unqApptID) {
		
		this.unqApptID = unqApptID;
		
	}
	
	public Date getApptDate() {
		
		return this.apptDate;
		
	}
	
	public void setApptDate(Date apptDate) {
		
		this.apptDate = apptDate;
		
	}
	
	public String getApptDescription() {
		
		return this.apptDescription;
		
	}
	
	public void setApptDescription(String apptDescription) {
		
		this.apptDescription = apptDescription;
		
	}

}
