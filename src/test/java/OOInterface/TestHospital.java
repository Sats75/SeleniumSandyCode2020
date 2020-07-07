package OOInterface;

public class TestHospital {

	public static void main(String[] args) {

	FortisHospital fs = new FortisHospital();
	
		fs.EmergencyServices();
		fs.Nineoneoneservices();
		fs.birthcontrol();
		fs.orthoservices();
		fs.physioservices();
		fs.birthcontrol();
		fs.pathologyServices();
		fs.oPTServices();
		fs.cardioServices();
		

		USMedical us = new FortisHospital();
		us.orthoservices();
		us.physioservices();
		us.Nineoneoneservices();
				us.birthcontrol();             // Taking from parent interface GHC
		


		UKMedical uk = new FortisHospital();
		uk.emergencyServices();
		uk.oncologyServices();
		uk.physioServices();
		
		

		IndianMedical im = new FortisHospital();
		im.cardioServices();
		im.oPTServices();
		im.physioServices();
		im.pathologyServices();
		
		
		
	}

}
