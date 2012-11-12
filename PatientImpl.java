public class PatientImpl   {
  private String name;
  private int age;
  private String illness;
  private PatientImpl nextPatient;
  private PatientImpl patientListStart = null; 
  
  public PatientImpl(String name, int age, String illness) {
	this.name = name;
	this.age = age;
	this.illness = illness;
	this.nextPatient = null;
	}
	
	public void addPatient(PatientImpl newPatient) {
		if (this.nextPatient == null || this.nextPatient == patientListStart) {
		// this means this is the last patient in the list
		this.nextPatient = newPatient;
		newPatient.nextPatient = patientListStart;
		} else {
		  this.nextPatient.addPatient(newPatient);
		  }
	}

	public boolean deletePatient(PatientImpl newPatient) {
	  if (this.nextPatient == patientListStart) {
	  //patient to remove was not found
	  return false;
	} else if (this.nextPatient.name.equals(newPatient.name)) {
	  //We found it! It is the next one!
	  // Now link this patient to the one after the next
	  this.nextPatient = nextPatient.nextPatient;
	  return true;
	} else {
	  return this.nextPatient.deletePatient(newPatient);
	  }
	}
	
	public void traverseForward(PatientImpl myPatient) {
		
			do { System.out.println(myPatient.name + ", " + myPatient.age + ", " + myPatient.illness);
				myPatient = myPatient.nextPatient; }
			 while (myPatient != patientListStart); 
		}
		
		
	}
	