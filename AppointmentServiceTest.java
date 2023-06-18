package applicationCS320;

import java.util.Date;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppointmentServiceTest {
	
	private AppointmentService apptService;
	
	public AppointmentServiceTest() {
		
		
	}
	
	@Before
	public void setUp() {
		
		this.apptService = new AppointmentService();
		
	}
	
	//Annotate each test case
	@Test
	public void testAddAppt() {
		
		Appointment appt = new Appointment("NEWAPPT001", new Date(), "Test description.");
		this.apptService.addAppt(appt);
		Assert.assertEquals(appt, this.apptService.getAppt("NEWAPPT001"));
		
	}
	
	@Test
	public void testRemoveAppt() {
		
		Appointment appt = new Appointment("NEWAPPT001", new Date(), "Test description.");
		this.apptService.addAppt(appt);
		this.apptService.removeAppt("NEWAPPT001");
		
		//Create assertions
		Assert.assertNull(this.apptService.getAppt("NEWAPPT001"));
		
	}

}