package applicationCS320;

//task class creation
public class Task {

  //Task ID Restrictions/Requirements:
  //Cannot be null, longer than 10 chars, or updated.
  //Must be unique and a string.
  String unqTaskID;

  //Name restrictions/requirements:
  //Must be a string, cannot be more than 20 chars
  //Cannot be null and is updatable.
  String varName;

  //Description restrictions/requirements:
  //Must be a string, cannot be more than 50 chars,
  //cannot be null and is updatable.
  String varDescription;

  public Task (String unqTaskID, String varName, String varDescription) {

      //initiate variables.
      this.unqTaskID = unqTaskID;
      this.varName = varName;
      this.varDescription = varDescription;

  }

  //Create getter and setter methods
  public String getVarTaskID() {

      return unqTaskID;

  }

  public void setVarTaskID(String unqTaskID) {

      this.unqTaskID = unqTaskID;

  }

  public String getVarName() {

      return varName;

  }

  public void setVarName(String varName) {

      this.varName = varName;

  }

  public String getVarDescription() {

      return varDescription;

  }

  public void setVarDescription(String varDescription) {

      this.varDescription = varDescription;

  }

}
