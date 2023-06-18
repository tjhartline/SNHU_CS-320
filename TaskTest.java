package applicationCS320;
//@author:		 Tammy Hartline
//Date:    		 05/28/2023
//Assignment:	 Week 4 Milestone
//Course:		 CS-320

import org.junit.Assert;
import org.junit.Test;

//Task test creation
public class TaskTest {

    public TaskTest() {

    }
    @Test
    public void testTaskSetters() {

        Task task = new Task("T0001", "Organize", "Clean out closets.");
        task.setVarTaskID("TSK01");
        task.setVarName("Clean");
        task.setVarDescription("Clean and organize closets.");

        //Setup assertions
        Assert.assertEquals("TSK01", task.getVarTaskID());
        Assert.assertEquals("Clean", task.getVarName());
        Assert.assertEquals("Clean and organize closets.", task.getVarDescription());

    }

}
