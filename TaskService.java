package applicationCS320;

import java.util.HashMap;
import java.util.Map;

public class TaskService {

    //Task service restrictions/requirements:
    //Add tasks with a unique task id
    //Delete tasks per task id
    //Update task fields per task ID
    //Only the name and description fields are updatable
    //Per task id.

    private Map<String, Task> tasks;

    public TaskService() {

        this.tasks = new HashMap<>();

    }

    //Create method to add a task
    public void addTask(Task task) {

        tasks.put(task.getVarTaskID(), task);

    }

    //Create method to delete task
    public void removeTask(String unqTaskID) {

        tasks.remove(unqTaskID);

    }
    //Update requirement (Name)
    public void updateVarName(String unqTaskID, String varName) {

        Task task = tasks.get(unqTaskID);

        if (task != null) {

            task.setVarName(varName);
        }

    }

    //Update requirement (Description)
    public void updateVarDescription(String unqTaskID, String varDescription) {

        Task task = tasks.get(unqTaskID);

        if (task != null) {

            task.setVarDescription(varDescription);

        }

    }

    public Task getTask(String unqTaskID) {

        return tasks.get(unqTaskID);

    }

}
