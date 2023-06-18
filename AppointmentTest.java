package applicationCS320;

import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

public class AppointmentTest {
	
	public AppointmentTest() {
				
	}
	
	//Annotate test
	@Test
	public void TestApptGetters() {
		
		Appointment appt = new Appointment("NEWAPPT001", new Date(), "Test description.");
		appt.setUnqApptID("SETNEWID01");
		appt.setApptDate(new Date());
		appt.setApptDescription("New test description.");
		
		//Create assertions
		Assert.assertEquals("SETNEWID01", appt.getApptID());
		Assert.assertEquals(new Date(), appt.getApptDate());
		Assert.assertEquals("New test description.", appt.getApptDescription());
		
	}
	
	//Annotate Test
	@Test
	public void testApptSetters() {
	    String unqApptID = "NEWAPPT001";
	    Date apptDate = new Date();
	    String apptDescription = "Testing appt description.";
	    Appointment appt = new Appointment(unqApptID, apptDate, apptDescription);

	    String setNewApptID = "NEWAPPT001";
	    Date setNewApptDate = new Date();
	    String setNewApptDesc = "Testing appt description update.";

	    // Update values using setter methods
	    appt.setUnqApptID(setNewApptID);
	    appt.setApptDate(setNewApptDate);
	    appt.setApptDescription(setNewApptDesc);

	    // Perform assertions on the updated values
	    Assert.assertEquals(setNewApptID, appt.getApptID());
	    Assert.assertEquals(setNewApptDate, appt.getApptDate());
	    Assert.assertEquals(setNewApptDesc, appt.getApptDescription());
	}

}