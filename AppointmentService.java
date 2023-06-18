package applicationCS320;

import java.util.HashMap;
import java.util.Map;

public class AppointmentService {

		private Map<String, Appointment> appts;
		
		public AppointmentService() {
			
			this.appts = new HashMap<>();
			
		}
		
		//Create method to add an appointment
		public void addAppt(Appointment appt) {
			
			appts.put(appt.getApptID(), appt);
		
		}
		
		public void removeAppt(String apptID) {
			
			appts.remove(apptID);
			
		}
		
		public Appointment getAppt(String apptID) {
			
			return appts.get(apptID);
			
		}
		
}
