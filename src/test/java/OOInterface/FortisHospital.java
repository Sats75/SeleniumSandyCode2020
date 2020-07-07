package OOInterface;

//All methods to be implemented in a class
//Parent cannot take any properties from the child
//@Override - Better to have Annotation for overriden methods 
//Cannot create object for USMedical interface (USMedical us = new USMedical)
//US med cannot access methods of another interface (Eg UK and Fortis non overriden methods) 
//But we can achieve top casting
//Parent interface object not allowed ..newUSMedical
public class FortisHospital implements USMedical, UKMedical, IndianMedical {

	public static void main(String[] args) {

	}

	public void orthoservices() {
		System.out.println("FS------------Orthoservices");
	}
	
	@Override
	public void physioservices() {
		System.out.println("FS------------Physioservices");

	}

	public void Nineoneoneservices() {
		System.out.println("FS------------Nineoneservices");

	}

	public void emergencyServices() {
		System.o	ut.println("FS------------Emergency ----------- services");

	}

	public void oncologyServices() {
		System.out.println("FS-----------Oncology ------------ services");

	}

	public void physioServices() {
		System.out.println("FS------------physio ........ services");

	}

	// non overriden method
	public void EmergencyServices() {
		System.out.println("FS------------Emergency ........ services");

	}

	public void birthcontrol() {
		System.out.println("FS------------birth ........ control");

	}

	public void pathologyServices() {
		System.out.println("FS------------pathology ........ services");

	}

	public void oPTServices() {
		System.out.println("FS------------OPT ........ services");

	}

	public void cardioServices() {
		System.out.println("FS------------Cardio ........ services");

	}
}