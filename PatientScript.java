public class PatientScript {

	public static void main(String[] args) {
	PatientScript script = new PatientScript();
	script.launch();
	}
 
	public void launch() {
	PatientImpl patientListStart = null;
	
	PatientImpl firstPatient = new PatientImpl("John", 33, "Tuberculosis");
	patientListStart = firstPatient;
	
	PatientImpl secondPatient = new PatientImpl("Mary", 66, "Meningitis");
	patientListStart.addPatient(secondPatient);

	PatientImpl thirdPatient = new PatientImpl("Tom", 90, "Cancer");
	patientListStart.addPatient(thirdPatient);
	
	PatientImpl forthPatient = new PatientImpl("Dying", 100, "Brain Cancer");
	patientListStart.addPatient(forthPatient);

	PatientImpl fifthPatient = new PatientImpl("Baby", 3, "Fever");
	patientListStart.addPatient(fifthPatient);
	
	patientListStart.deletePatient(secondPatient);
	
	patientListStart.traverseForward(patientListStart);
	}
}	