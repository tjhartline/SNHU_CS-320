package applicationCS320;

//@author:		 Tammy Hartline
//Date:    		 05/28/2023
//Assignment:	 Week 4 Milestone
//Course:		 CS-320

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskServiceTest {

    private TaskService taskService;

    public TaskServiceTest() {


    }

    @Before
    public void setUp() {

        this.taskService = new TaskService();

    }

    //Annotate each test case
    @Test
    public void testAddTask() {

        Task task = new Task ("T0001", "Organize", "Clean out closets.");
        this.taskService.addTask(task);
        Assert.assertEquals(task, this.taskService.getTask("T0001"));

    }

    @Test
    public void testRemoveTask() {

        Task task = new Task("T0001", "Study", "Begin studying for finals.");
        this.taskService.addTask(task);
        this.taskService.removeTask("T0001");
        
        //Create assertions
        Assert.assertNull(this.taskService.getTask("T0001"));

    }

    @Test
    //Test update methods
    public void testUpdateName() {

        Task task = new Task("T0001", "Study", "Begin studying for finals.");
        this.taskService.addTask(task);
        this.taskService.updateVarName("T0001", "Prepare");
        Assert.assertEquals("Prepare", task.getVarName());

    }

    @Test
    public void testUpdateDescription() {

        Task task = new Task("T0001", "Study", "Begin studying for finals.");
        this.taskService.addTask(task);
        this.taskService.updateVarDescription("T0001", "Prepare for finals.");
        Assert.assertEquals("Prepare for finals.", task.getVarDescription());

    }
    
}
